package com.luby.headfirst.startup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Helper {
  public static enum DIRECTION {
    HORIZONTAL,
    VERTICAL
  }
  Scanner scanner = new Scanner(System.in);
  Random rand = new Random();
  public String getUserCoordInput() {
    do {
      try {
        System.out.print("Please guess a coordinate: ");
        String input = this.scanner.nextLine();
        if (!input.matches("[A-Za-z]{1}[0-9]{1}")) {
          throw new InputMismatchException();
        }
        return input;
      } catch (InputMismatchException e) {
        System.out.println("Wrong coordinate, example A0, c6");
      }
    } while (true);
  }

  public int convertCoordToIndex(int boardSize, String coord) {
    String coordLower = coord.toLowerCase();
    int rowIdx = coordLower.charAt(0) - 'a';
    int colIdx = coordLower.charAt(1) - '0';
    return rowIdx * boardSize + colIdx;
  }


  public Startup generateStartup(int boardSize) {
    // get a random start point in the board
    // if board size is 7x7, startup length is 3, then we need to select a random point in a 5x5 board
    int smallerSize = boardSize - 2;
    int randRow = rand.nextInt(smallerSize); // [0, 4]
    int randCol = rand.nextInt(smallerSize);
    int startIndex = randRow * smallerSize + randCol;
    DIRECTION direction = getDirection();
    int indexIncrement = 1;
    if (direction.equals(DIRECTION.VERTICAL)) {
      indexIncrement = boardSize;
    }
    List<Integer> indexes = new ArrayList<>(List.of(startIndex, startIndex + indexIncrement, startIndex + indexIncrement * 2));
    return new Startup(indexes);
  }
  public List<Startup> generateStartups(int boardSize, int count) {
    List<Startup> startups = new ArrayList<>();
    int addCount = 0;
    while (addCount < count) {
      Startup startup = generateStartup(7);
      if (isStartupValid(startups, startup)) {
        startups.add(startup);
        addCount++;
      }
    }
    return startups;
  }

  private boolean isStartupValid(List<Startup> startups, Startup startup) {
    Set<Integer> currentIndexs = startups.stream()
      .map(s -> s.getIndexes())
      .reduce(new HashSet<>(), (accu, cur) -> {
        accu.addAll(cur);
        return accu;
      },  (u1, u2) -> u1);
    Set<Integer> newIndexes = new HashSet<>(startup.getIndexes());
    return Collections.disjoint(currentIndexs, newIndexes);
  }

  private DIRECTION getDirection() {
    if (rand.nextInt(2) == 0) {
      return DIRECTION.HORIZONTAL;
    } else {
      return DIRECTION.VERTICAL;
    }
  }
}

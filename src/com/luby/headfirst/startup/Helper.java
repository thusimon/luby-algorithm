package com.luby.headfirst.startup;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Helper {

  Scanner scanner = new Scanner(System.in);
  public String getUserCoordInput() {
    do {
      try {
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

  public static int convertCoordToIndex(int boardSize, String coord) {

    return 0;
  }


  public static Startup generateStartup(int boardSize) {
    Startup startup = new Startup(Set.of(1,2,3));
    return startup;
  }
  public static Set<Startup> generateStartups(int boardSize, int count) {
    Set<Startup> startups = new HashSet<>();
    return startups;
  }
}

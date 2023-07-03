package com.luby.headfirst.startup;

import java.util.List;

public class Game {
  /**
   * in a 7x7 board, place three startups,
   * which is line segment taking 3 cells, can be either horizontal or vertical
   * user can input coordinates, like A3, C6, if the input hit startup, output hit,
   * if user hit all the startup cells, the game finishes, and output the total guess
   *
   * this class is the main controller, aka, entry point of the game, we still need to implement these classes
   *   - startup: hold 3 coordinates and check if hit
   *   - helper: get input, generate and check coordinates
   */
  private List<Startup> startups;

  private int guessCount;

  private int boardSize;

  private Helper helper;

  public Game(int boardSize, int startupCount) {
    this.boardSize = boardSize;
    helper = new Helper();
    startups = helper.generateStartups(boardSize, startupCount);
  }

  public boolean isAllStartupSink() {
    for (Startup startup : startups) {
      if (!startup.isSink()) {
        return false;
      }
    }
    return true;
  }

  public void hitStartups(int index) {
    for(Startup startup : startups) {
      if (startup.checkHit(index)) {
        return;
      }
    }
  }
  public void start() {
    System.out.println("Game starts");
    System.out.println("Please input the coordinates, like A0, to sink a startup");
    while(!isAllStartupSink()) {
      String coord = helper.getUserCoordInput();
      int index = helper.convertCoordToIndex(this.boardSize, coord);
      guessCount++;
      hitStartups(index);
    }
    System.out.println("Game ends, you guessed %d times".formatted(this.guessCount));
  }
}

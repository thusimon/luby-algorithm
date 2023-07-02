package com.luby.headfirst.startup;

import java.util.Set;

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
  private Set<Startup> startups;
  private Helper helper = new Helper();

  public String getInput() {
    return helper.getUserCoordInput();
  }
  public void start() {
    System.out.println("Game starts");
  }
}

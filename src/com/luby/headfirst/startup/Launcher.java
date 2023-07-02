package com.luby.headfirst.startup;

public class Launcher {
  private Game game;

  public Launcher() {
    game = new Game();
    String input = game.getInput();
    System.out.println(input);
  }

  public static void main(String[] args) {
    Launcher launcher = new Launcher();
  }
}

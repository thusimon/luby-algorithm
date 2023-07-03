package com.luby.headfirst.startup;

public class Launcher {
  private Game game;

  public Launcher() {
    game = new Game(7, 3);
  }

  public void start() {
    game.start();
  }

  public static void main(String[] args) {
    Launcher launcher = new Launcher();
    launcher.start();
  }
}

package com.luby.headfirst.startup;

import java.util.List;

public class Startup {
  private List<Integer> indexes;

  public Startup(List<Integer> indexes) {
    this.indexes = indexes;
  }
  public List<Integer> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<Integer> indexes) {
    this.indexes = indexes;
  }

  public boolean checkHit(int index) {
    int hitIndex = indexes.indexOf(index);
    if (hitIndex > -1) {
      indexes.remove(hitIndex);
      System.out.println("Hit");
      return true;
    }
    System.out.println("Miss");
    return false;
  }

  public boolean isSink() {
    return indexes.isEmpty();
  }
}

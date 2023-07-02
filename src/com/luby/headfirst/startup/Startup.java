package com.luby.headfirst.startup;

import java.util.List;
import java.util.Set;

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
    boolean hit = false;
    return hit;
  }

  public boolean isSink() {
    return indexes.isEmpty();
  }
}

package com.luby.headfirst.startup.test;

import com.luby.headfirst.startup.Helper;
import com.luby.headfirst.startup.Startup;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class HelperTest {
  private Helper helper;

  private void mockScannerLineInput(String input) {
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
  }

  private boolean isIndexesValid(int boardSize, List<Integer> indexes) {
    // the indexes must have 3 elements
    if (indexes.size() != 3) {
      return false;
    }
    // all the indexes are in range
    int maxRange = boardSize * boardSize - 1;
    for(int idx : indexes) {
      if (idx < 0 || idx > maxRange) {
        return false;
      }
    }
    int idx0 = indexes.get(0);
    int idx1 = indexes.get(1);
    int idx2 = indexes.get(2);
    // check if indexes are in the same row
    if (idx1 == idx0 + 1 && idx2 == idx1 + 1 &&
      idx0 / boardSize == idx1 / boardSize && idx0 / boardSize == idx2 / boardSize) {
      return true;
    }
    // check if indexes are in the same column
    if (idx1 == idx0 + boardSize && idx2 == idx1 + boardSize) {
      return true;
    }
    return false;
  }


  @Before
  public void setup() {
    helper = new Helper();
  }

  @Test
  public void testGetUserCoordInput() {
    String coord = "A0";
    mockScannerLineInput(coord);
    assertEquals(new Helper().getUserCoordInput(), coord);
  }

  @Test
  public void testConvertCoordToIndex() {
    assertEquals(helper.convertCoordToIndex(7, "A0"), 0);
    assertEquals(helper.convertCoordToIndex(7, "A3"), 3);
    assertEquals(helper.convertCoordToIndex(7, "A6"), 6);
    assertEquals(helper.convertCoordToIndex(7, "A7"), 7);
    assertEquals(helper.convertCoordToIndex(7, "b0"), 7);
    assertEquals(helper.convertCoordToIndex(7, "d5"), 26);
    assertEquals(helper.convertCoordToIndex(7, "g6"), 48);
    assertEquals(helper.convertCoordToIndex(7, "H1"), 50);
  }

  @Test
  public void testGenerateStartup() {
    Startup startup = helper.generateStartup(7);
    assertEquals(isIndexesValid(7, startup.getIndexes()), true);
  }

  @Test
  public void testGenerateStartups() {
    List<Startup> startups = helper.generateStartups(7, 3);
    for(Startup startup : startups) {
      assertEquals(isIndexesValid(7, startup.getIndexes()), true);
    }
    assertEquals(startups.size(), 3);
  }
}

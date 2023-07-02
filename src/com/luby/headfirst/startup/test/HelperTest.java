package com.luby.headfirst.startup.test;

import com.luby.headfirst.startup.Helper;
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

  private boolean isStraightSegment(List<Integer> indexes) {
    return true;
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
    assertEquals(Helper.convertCoordToIndex(7, "A0"), 0);
    assertEquals(Helper.convertCoordToIndex(7, "A3"), 3);
    assertEquals(Helper.convertCoordToIndex(7, "A6"), 6);
    assertEquals(Helper.convertCoordToIndex(7, "A7"), -1);
    assertEquals(Helper.convertCoordToIndex(7, "b0"), 7);
    assertEquals(Helper.convertCoordToIndex(7, "d5"), 26);
    assertEquals(Helper.convertCoordToIndex(7, "g6"), 48);
    assertEquals(Helper.convertCoordToIndex(7, "H1"), -1);
  }

  @Test
  public void testGenerateStartup() {

  }
}

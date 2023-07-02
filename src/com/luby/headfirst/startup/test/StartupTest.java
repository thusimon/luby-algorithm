package com.luby.headfirst.startup.test;

import com.luby.headfirst.startup.Startup;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class StartupTest {
  private Startup startup;
  @Before
  public void setup() {
    startup = new Startup(List.of(1,2,3));
  }
  @Test
  public void testCheckHit() {
    assertTrue(startup.checkHit(1));
    assertFalse(startup.checkHit(1));
    assertFalse(startup.checkHit(4));
    assertTrue(startup.checkHit(2));
  }

  @Test
  public void testIsSink() {
    assertFalse(startup.isSink());
    startup.checkHit(1);
    assertFalse(startup.isSink());
    startup.checkHit(2);
    startup.checkHit(3);
    assertTrue(startup.isSink());
    startup.checkHit(3);
    assertTrue(startup.isSink());
  }
}

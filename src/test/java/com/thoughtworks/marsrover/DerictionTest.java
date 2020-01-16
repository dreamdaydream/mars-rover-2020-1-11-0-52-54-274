package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DerictionTest {

  @Test
  public void should_return_W_when_turn_left_given_the_direction_is_N() {
    assertEquals(Direction.W, Direction.N.left());
  }

  @Test
  public void should_return_N_when_turn_left_given_the_direction_is_E() {
    assertEquals(Direction.N, Direction.E.left());
  }

  @Test
  public void should_return_E_when_turn_left_given_the_direction_is_S() {
    assertEquals(Direction.E, Direction.S.left());
  }

  @Test
  public void should_return_S_when_turn_left_given_the_direction_is_W() {
    assertEquals(Direction.S, Direction.W.left());
  }

  @Test
  public void should_return_E_when_turn_right_given_the_direction_is_N() {
    assertEquals(Direction.E, Direction.N.right());
  }

  @Test
  public void should_return_S_when_turn_right_given_the_direction_is_E() {
    assertEquals(Direction.S, Direction.E.right());
  }

  @Test
  public void should_return_W_when_turn_right_given_the_direction_is_S() {
    assertEquals(Direction.W, Direction.S.right());
  }

  @Test
  public void should_return_N_when_turn_right_given_the_direction_is_W() {
    assertEquals(Direction.N, Direction.W.right());
  }
}

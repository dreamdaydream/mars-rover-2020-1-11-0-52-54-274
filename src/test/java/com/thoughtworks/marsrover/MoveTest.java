package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveTest {

  @Test
  public void should_state_x_plus_1_when_moven_given_facing_direction_is_E() {
    Move move = new Move();
    MarsRoverState marsRoverState = move.doOperation(new MarsRoverState(0,0, Direction.E));

    assertEquals(1, marsRoverState.getX());
  }

  @Test
  public void should_state_y_plus_1_when_moven_given_facing_direction_is_N() {
    Move move = new Move();
    MarsRoverState marsRoverState = move.doOperation(new MarsRoverState(0,0, Direction.N));

    assertEquals(1, marsRoverState.getY());
  }

  @Test
  public void should_state_y_minus_1_when_moven_given_facing_direction_is_S() {
    Move move = new Move();
    MarsRoverState marsRoverState = move.doOperation(new MarsRoverState(0,0, Direction.S));

    assertEquals(-1, marsRoverState.getY());
  }

  @Test
  public void should_state_X_minus_1_when_moven_given_facing_direction_is_W() {
    Move move = new Move();
    MarsRoverState marsRoverState = move.doOperation(new MarsRoverState(0,0, Direction.W));

    assertEquals(-1, marsRoverState.getX());
  }
}

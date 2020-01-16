package com.thoughtworks.marsrover;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

  @Test
  public void should_operation_given_a_state() {
    MarsRoverState marsRoverState = new MarsRoverState(0,0, Direction.E);
    MarsRover marsRover = new MarsRover(marsRoverState);
    List<Command> commands = Arrays.asList(new Move(), new TurnLeft());
    marsRover.doOperation(commands);

    assertEquals(new MarsRoverState(1,0, Direction.N), marsRover.getMarsRoverState());

  }
}
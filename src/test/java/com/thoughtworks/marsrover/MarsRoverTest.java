package com.thoughtworks.marsrover;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class MarsRoverTest {
  @Test
  public void should_return() {
    MarsRover marsRover = new MarsRover();
    marsRover.init(1,1, Direction.E);
    List<Command> commands = Arrays.asList(Command.L, Command.M);
    commands.forEach(MarsRover::command);

    assertEquals(marsRover.getPosition().getX(), Integer.valueOf(0));
    assertEquals(marsRover.getPosition().getY(), Integer.valueOf(1));
    assertEquals(marsRover.getDirection(), Direction.N);
  }
}
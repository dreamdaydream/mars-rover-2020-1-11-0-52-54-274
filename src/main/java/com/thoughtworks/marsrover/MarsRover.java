package com.thoughtworks.marsrover;

import java.util.HashMap;
import java.util.Map;

import static com.thoughtworks.marsrover.Command.R;
import static com.thoughtworks.marsrover.Command.M;
import static com.thoughtworks.marsrover.Command.L;

public class MarsRover {
  private Position position;
  private Direction direction;
  private final Map<Command, Runnable> commandToAction;

  public MarsRover() {
    this.commandToAction = new HashMap<>();
    commandToAction.put(M, this::move);
    commandToAction.put(L, this::turnLeft);
    commandToAction.put(R, this::turnRight);
  }

  private void turnRight() {
  }

  private void turnLeft() {
  }

  private void move() {
  }

  public void init(Integer x, Integer y, Direction direction) {
    this.position = new Position(x, y);
    this.direction = direction;
  }
}

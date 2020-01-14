package com.thoughtworks.marsrover;

import java.util.HashMap;
import java.util.Map;

import static com.thoughtworks.marsrover.Command.R;
import static com.thoughtworks.marsrover.Command.M;
import static com.thoughtworks.marsrover.Command.L;

public class MarsRover {
  private Position position;
  private Direction direction;
  private static Map<Command, Runnable> commandToAction;

  public MarsRover() {
    this.commandToAction = new HashMap<>();
    commandToAction.put(M, this::move);
    commandToAction.put(L, this::turnLeft);
    commandToAction.put(R, this::turnRight);
  }

  public Position getPosition() {
    return position;
  }

  public Direction getDirection() {
    return direction;
  }

  public static void command(Command command) {
   commandToAction.get(command).run();
  }

  private void turnRight() {
    direction = direction.right();
  }

  private void turnLeft() {
    direction = direction.left();
  }

  private void move() {
    int x = this.position.getX();
    int y = this.position.getY();
    switch (this.direction){
      case E:
        x += 1;
      case N:
        y += 1;
      case S:
        y -= 1;
      case W:
        x -= 1;
    }
    this.position = new Position(x, y);
  }

  public void init(Integer x, Integer y, Direction direction) {
    this.position = new Position(x, y);
    this.direction = direction;
  }
}

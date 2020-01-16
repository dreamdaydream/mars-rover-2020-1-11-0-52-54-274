package com.thoughtworks.marsrover;

public class Move implements Command {

  @Override
  public MarsRoverState doOperation(MarsRoverState marsRoverState) {
    int x = marsRoverState.getX();
    int y = marsRoverState.getY();
    switch (marsRoverState.getFacing()){
      case E:
        x += 1;
        break;
      case N:
        y += 1;
        break;
      case S:
        y -= 1;
        break;
      case W:
        x -= 1;
        break;
    }
    return new MarsRoverState(x, y, marsRoverState.getFacing());
  }
}

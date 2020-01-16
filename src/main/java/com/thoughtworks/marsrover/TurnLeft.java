package com.thoughtworks.marsrover;

public class TurnLeft implements Command {

  @Override
  public MarsRoverState doOperation(MarsRoverState marsRoverState) {

    return new MarsRoverState(marsRoverState.getX(), marsRoverState.getY(), marsRoverState.getFacing().left());
  }
}

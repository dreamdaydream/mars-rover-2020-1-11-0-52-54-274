package com.thoughtworks.marsrover;

public interface Command {
  MarsRoverState doOperation(MarsRoverState marsRoverState);
}

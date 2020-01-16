package com.thoughtworks.marsrover;

import lombok.Data;

import java.util.List;

@Data
public class MarsRover {
  private MarsRoverState marsRoverState;

  public MarsRover(MarsRoverState marsRoverState) {
    this.marsRoverState = marsRoverState;
  }

  public MarsRoverState doOperation(List<Command> commands) {
    commands.forEach(command -> {
      this.marsRoverState = command.doOperation(marsRoverState);
    });
    return this.marsRoverState;
  }

}

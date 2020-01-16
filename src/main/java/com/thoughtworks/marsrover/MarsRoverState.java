package com.thoughtworks.marsrover;

import lombok.Data;

@Data
public class MarsRoverState {
  private int x;
  private int y;
  private Direction facing;

  public MarsRoverState(int x, int y, Direction facing) {
    this.x = x;
    this.y = y;
    this.facing = facing;
  }
}

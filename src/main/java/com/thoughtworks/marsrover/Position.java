package com.thoughtworks.marsrover;

public class Position {
  private Integer x;
  private Integer y;

  public Integer getX() {
    return x;
  }

  public Integer getY() {
    return y;
  }

  public Position(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }
}

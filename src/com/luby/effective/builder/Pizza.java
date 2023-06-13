package com.luby.effective.builder;

public class Pizza {
  private int size;
  private String dough;
  private String sauce;
  private String topping;
  private boolean dipping;

  Pizza(Builder builder) {
    this.size = builder.size;
    this.dough = builder.dough;
    this.sauce = builder.sauce;
    this.topping = builder.topping;
    this.dipping = builder.dipping;
  }

  @Override
  public String toString() {
    return String.format("Pizza(size=%d, dough=%s, souce=%s, topping=%s, dipping=%s)", this.size, this.dough, this.sauce, this.topping, this.dipping);
  }

  public static class Builder {
    private int size;
    private String dough;
    private String sauce;
    private String topping;
    private boolean dipping;
    public Builder (int size) {
      this.size = size;
    }
    public Pizza.Builder withDough(String dough) {
      this.dough = dough;
      return this;
    }
    public Pizza.Builder withSauce(String sauce) {
      this.sauce = sauce;
      return this;
    }
    public Pizza.Builder withTopping(String topping) {
      this.topping = topping;
      return this;
    }
    public Pizza.Builder withDipping(boolean dipping) {
      this.dipping = dipping;
      return this;
    }
    public Pizza build() {
      return new Pizza(this);
    }
  }
}

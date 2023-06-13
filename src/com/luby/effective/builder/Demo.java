package com.luby.effective.builder;

public class Demo {
  public static void main(String[] args) {
    Pizza pizza1 = new Pizza.Builder(10)
      .withDough("handtossed")
      .withSauce("tomato")
      .withTopping("pepperoni")
      .withDipping(true)
      .build();
    System.out.println(pizza1);
    Pizza pizza2 = new Pizza.Builder(20)
      .withTopping("chicken")
      .build();
    System.out.println(pizza2);
  }
}

package com.shail.multithreading;

import java.util.Scanner;

public class FirstThread {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    FortuneCookie forutneCooki1 =
        new FortuneCookie("You will always travel", 1000, "to diffrent places..");
    forutneCooki1.setName("FirstThread-0");
    forutneCooki1.setPriority(Thread.MAX_PRIORITY);
    forutneCooki1.start();

    FortuneCookie forutneCooki2 = new FortuneCookie("Never expect ", 1200, "lot of money..");
    forutneCooki2.setName("FirstThread-1");
    forutneCooki1.setPriority(Thread.MIN_PRIORITY);
    forutneCooki2.start();

    forutneCooki1.suspend();

    try {
      forutneCooki1.sleep(5000);
    } catch (InterruptedException e2) {
      e2.printStackTrace();
    }
    forutneCooki1.resume();

    try {
      forutneCooki1.join();// Current Thread will wait until FirstThread finishes..
    } catch (InterruptedException e1) {
      e1.printStackTrace();
    }

    System.out.println("\n Please input...");
    scanner.next();
    System.out.println("Input request statisfied..");

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("slept for 5 sec before dead..");
  }

}

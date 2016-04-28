package com.shail.multithreading;

public class Fortune extends Thread {

  @Override
  public void run() {
    super.run();
    while (true) {
      System.out.println("Good things will come your way...");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}

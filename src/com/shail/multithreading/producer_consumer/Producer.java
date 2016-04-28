package com.shail.multithreading.producer_consumer;

public class Producer extends Thread {

  private Cup mCup;
  private int mNumber;

  public Producer(final Cup cup, final int number) {
    super("Producer");
    mCup = cup;
    mNumber = number;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      mCup.put(i);
      System.out.println("\n Producer#" + mNumber + "put" + i);
//      try {
//        sleep(1000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
    }
  }

  public void exit() {
    mCup = null;
    mNumber = 0;
  }


}

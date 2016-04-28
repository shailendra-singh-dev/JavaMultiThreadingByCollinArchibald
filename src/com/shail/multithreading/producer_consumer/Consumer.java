/**
 * 
 */
package com.shail.multithreading.producer_consumer;

/**
 * @author shail
 * 
 */
public class Consumer extends Thread {

  private Cup mCup;
  private int mNumber;

  public Consumer(final Cup cup, final int number) {
    super("Consumer");
    mCup = cup;
    mNumber = number;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
//      try {
//        sleep(1000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
      int content = mCup.get();
      System.out.println("\n Consumer#" + mNumber + "get" + content);
    }
  }

  public void exit() {
    mCup = null;
    mNumber = 0;
  }

}

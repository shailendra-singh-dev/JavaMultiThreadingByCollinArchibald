package com.shail.multithreading.producer_consumer;

public class Cup {

  private int mContent;
  private boolean mIsAvailable;

  synchronized public int get() {
    while (!mIsAvailable) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    mIsAvailable = false;
    notifyAll();
    return mContent;
  }

  synchronized public void put(int i) {
    while (mIsAvailable) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    mContent = i;
    mIsAvailable = true;
    notifyAll();
  }

}

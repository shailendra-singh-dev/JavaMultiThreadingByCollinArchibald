package com.shail.multithreading;
public class FortuneCookie extends Thread {

  private String mFirst;
  private String mLast;
  private long mSleepTime;

  public FortuneCookie(final String first, final long sleepTime, final String last) {
    mFirst = first;
    mSleepTime = sleepTime;
    mLast = last;
  }

  @Override
  public void run() {
    while (true) {
      System.out.println(getName()+" "+mFirst);
      try {
        Thread.sleep(mSleepTime);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(getName()+" "+mLast);
    }
  }

}

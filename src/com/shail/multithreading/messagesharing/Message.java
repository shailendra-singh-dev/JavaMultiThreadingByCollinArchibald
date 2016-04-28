package com.shail.multithreading.messagesharing;

public class Message {

  public static final String ONE = "1";
  public static final String TWO = "2";

  private String mMessage;

  synchronized public void sendMessageOne(final String message) {
    while (0 == message.length() || message.equalsIgnoreCase(TWO)) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    mMessage = message;
    notifyAll();
  }

  synchronized public void receiveMessageOneAndSendTwo(final String message) {
    while (0 == message.length() || message.equalsIgnoreCase(ONE)) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    mMessage = message;
    notifyAll();
  }

  public String getMessage() {
    return mMessage;
  }

}

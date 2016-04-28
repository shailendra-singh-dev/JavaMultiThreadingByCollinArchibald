package com.shail.multithreading.messagesharing;

public class MessageProducer extends Thread {

  private Message mMessage;

  public MessageProducer(final Message message) {
    mMessage = message;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      mMessage.sendMessageOne(Message.ONE);
      System.out.println("\n Producer#" + mMessage.getMessage());
      try {
        sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

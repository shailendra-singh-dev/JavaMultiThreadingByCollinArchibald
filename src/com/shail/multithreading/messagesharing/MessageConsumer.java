package com.shail.multithreading.messagesharing;

public class MessageConsumer extends Thread {

  private Message mMessage;

  public MessageConsumer(final Message message) {
    mMessage = message;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      mMessage.receiveMessageOneAndSendTwo(Message.TWO);
      System.out.println("\n Consumer#"+mMessage.getMessage());
      try {
        sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

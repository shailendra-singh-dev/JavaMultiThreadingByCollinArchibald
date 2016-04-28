package com.shail.multithreading.messagesharing;

public class MessageSharingTestClass {

  public static void testMessageSharing() {

    final Message message = new Message();
    final MessageProducer messageProducer = new MessageProducer(message);
    final MessageConsumer messageConsumer = new MessageConsumer(message);

    messageProducer.start();
    messageConsumer.start();
  }

}

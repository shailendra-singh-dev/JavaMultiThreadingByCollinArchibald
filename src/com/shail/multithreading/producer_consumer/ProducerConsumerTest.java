package com.shail.multithreading.producer_consumer;

public class ProducerConsumerTest {

  /**
   * @param args
   */
  public static void testCupSharing(String[] args) {
    final Cup cup = new Cup();

    final Producer producer1 = new Producer(cup, 1);
    final Consumer consumer1 = new Consumer(cup, 1);
//    final Consumer consumer2 = new Consumer(cup, 2);

    producer1.start();
    consumer1.start();
//    consumer2.start();

  }

}

# JavaMultiThreadingByCollinArchibald

Thread Safety in Java:

Thread safety in java is the process to make our program safe to use in multithreaded environment, there are different ways through which we can make our program thread safe.

1) Synchronization is the easiest and most widely used tool for thread safety in java.
2) Use of Atomic Wrapper classes from java.util.concurrent.atomic package. For example AtomicInteger
3) Use of locks from java.util.concurrent.locks package.
4) Using thread safe collection classes, check this post for usage of ConcurrentHashMap for thread safety.
5) Using volatile keyword with variables to make every thread read the data from memory, not read from thread cache.

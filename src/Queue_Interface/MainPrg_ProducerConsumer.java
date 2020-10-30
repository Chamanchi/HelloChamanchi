//package Queue_Interface;
//
////import com.Queue_Interface.consumer.consumer;
//
//import java.util.concurrent.BlockingDeque;
//import java.util.concurrent.PriorityBlockingQueue;
//
//public class MainPrg_ProducerConsumer {
//    public static void main(String[] args) {
//        final BlockingDeque<String> pbq = new PriorityBlockingQueue<String>();
//
//
//        new Thread(new producer(pbq)).start();
//        new Thread(new consumer(pbq)).start();
//        new Thread(new Consumer(pbq)).start();
//
//    }
//}

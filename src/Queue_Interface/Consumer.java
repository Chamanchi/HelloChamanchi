//package Queue_Interface;
//
//import java.util.concurrent.BlockingQueue;
//
//public class Consumer implements Runnable
//{
//    //Declare a refference variable to hold the PriorityBlockingQueue
//    protected BlockingQueue<String> pbq;
////    generate constructor
//    public consumer(BlockingQueue<String> pbq)
//    {
//        this.pbq=pbq;
//    }
//    @Override
//    public void run()
//    {
//        while (true){
//            try {
//                String data= pbq.take();
//                System.out.println(Thread.currentThread().getName()+"take()"+data);
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//
//    }
//
//
//
//}

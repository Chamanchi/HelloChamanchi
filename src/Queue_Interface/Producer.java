//package Queue_Interface;
//
//import java.util.UUID;
//import java.util.concurrent.BlockingQueue;
//
//public class Producer implements Runnable
//{
//
////  declare a reference variable to hold the PriorityBlockingQueue
//        protected BlockingQueue<String> pbq;
////        Generate the constructor
//        public Producer(BlockingQueue<String> pbq)
//         {
//            this.pbq=pbq;
//        }
//        @Override
//                public void run()
//    {
//            while (true)
//            {
//                try
//                {
////                    generate random UUID
//                    String data= UUID.randomUUID().toString();
//                    System.out.println("put()"+data);
//
////                    store the UUID in priorityBlockingQueue
//                    pbq.put(data);
//                    thread.sleep(500);
//                }
//                catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//
//    }
//}

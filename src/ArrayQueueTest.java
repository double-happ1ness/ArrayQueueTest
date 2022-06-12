
public class ArrayQueueTest {

    public static void main(String[] args) {
        Integer queueSize=Input.getInteger("queue size: ");
        QueueADT queue = new ArrayQueue(queueSize);
        Integer value;
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: enqueue");
            System.out.println("2: dequeue");
            System.out.println("3: display");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    value=Input.getInteger("value: ");
                    try{
                        queue.enqueue(value);
                        System.out.println("enqueued");
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("enqueue invalid - queue is full");
                    }
                   break;
                case 2:
                    try{
                        value=(Integer)queue.dequeue();
                        System.out.println(value+" dequeued");
                    }
                    catch(QueueADT.QueueEmptyException e){
                        System.out.println("dequeue invalid - queue is empty");
                    }
                    break;
               case 3:
                    System.out.println(queue);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }
}

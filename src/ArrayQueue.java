
public class ArrayQueue implements QueueADT {

    private Object[] objects;
    private Integer head;
    private Integer tail;

    public ArrayQueue(Integer queueSize) {
        this.objects = new Object[queueSize];
        this.head=0;
        this.tail=0;
    }

    public String toString() {
        /* algorithm
            set up a string to contain the queue details
            if queue is not empty then
                set the current slot as the head slot
                do
                    add the current slot object to the string
                    increment the current slot
                    if current slot is beyond the end of the array then
                        set current slot to the first slot in the array
                    end if
                while not yet reached the tail slot
            else
                add empty queue message to the string
            end if
        */
        String queueDetails = new String();
        // add code here
        return queueDetails;
    }
    
    public void enqueue(Object object) {
        /* algorithm
            if queue is full then
                throw queue full exception
            end if
            add object at tail slot
            increment tail slot
            if tail slot is off the end of the array then
                set the tail slot to the first slot in the array
            end if
        */
        // add code here
        
    }

    public Object dequeue() throws QueueEmptyException{
        /* algorithm
            if queue is empty then
                throw queue empty exception
            end if
            save the object at the head slot
            delete the object at the head slot
            increment the head slot
            if head slot is beyond the end of the array then
                set the head slot to the first slot in the array
            end if
        */
        // add code here
        return null;
    }

}

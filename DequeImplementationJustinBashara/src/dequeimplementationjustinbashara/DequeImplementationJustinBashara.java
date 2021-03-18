// Justin Bashara
// Implementing a Deque Assignment
package dequeimplementationjustinbashara;

public class DequeImplementationJustinBashara {

    public static void main(String[] args) {
       ArrayDeque<Integer> array = new ArrayDeque<>();
       
       // Enqueue two ints to front and dequeue from the rear.
       array.enqueueFront(5);
       array.enqueueFront(1);
       array.dequeueRear();
       array.dequeueRear();
       
       // Enqueueing ints to rear of array up to the MAX set in the ArrayDeque class.
       int i = 0;
       while(!array.isFull()){
           array.enqueueRear(i);
           i++;
       }
       
       // Printing ints in array by using the dequeueRear method implemented in ArrayDeque class.
       while(!array.isEmpty()){
           System.out.println(array.dequeueRear());
       }
       
    }
    
}

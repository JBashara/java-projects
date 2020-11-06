// Justin Bashara
// Implementing a Deque Assignment
package dequeimplementationjustinbashara;

public class DequeImplementationJustinBashara {

    public static void main(String[] args) {
       ArrayDeque<Integer> array = new ArrayDeque<>();
       
       array.enqueueFront(5);
       array.enqueueFront(1);
       
       array.dequeueRear();
       array.dequeueRear();
       
       int i = 0;
       while(!array.isFull()){
           array.enqueueRear(i);
           i++;
       }
       while(!array.isEmpty()){
           System.out.println(array.dequeueRear());
       }
       
    }
    
}

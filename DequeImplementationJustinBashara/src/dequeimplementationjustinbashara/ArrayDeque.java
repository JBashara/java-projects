package dequeimplementationjustinbashara;

public class ArrayDeque<T> implements DequeInterface<T> {
    public T[] elements;
    public static final int MAX = 100;
    public int front = 0;
    public int rear;
    public int numElements = 0;
    
    public ArrayDeque(){
        elements = (T[]) new Object[MAX];
        rear = MAX - 1;
    }
    
    @Override
    public void enqueueFront(T element) throws QueueOverflowException{
        // Throws QueueOverflowException if this queue is full;
        // otherwise, adds element to the front of this queue.
        if(isFull()) throw new QueueOverflowException ("Deque is full.");
        //else if (isEmpty()) elements[front] = element;
        else{
            front = (front - 1 + elements.length)  % elements.length;
            elements[front] = element;
        }
        numElements+=1;
    }

    @Override
    public void enqueueRear(T element) throws QueueOverflowException{
        // Throws QueueOverflowException if this queue is full;
        // otherwise, adds element to the rear of this queue.
        if(isFull()) throw new QueueOverflowException ("Deque is full.");
        else{
            rear = (rear + 1) % elements.length;
            elements[rear] = element;
            numElements += 1;
        }
    }
    
    @Override
    public T dequeueFront() throws QueueUnderflowException{
        // Throws QueueUnderflowException if this queue is empty;
        // otherwise, removes front element from this queue and returns it.
        if(isEmpty()) throw new QueueUnderflowException("Deque is empty.");
        else{
            T current = elements[front];
            front = (front + 1) % elements.length;
            numElements -= 1;
            return current;
        }
    }
    
    @Override
    public T dequeueRear() throws QueueUnderflowException{
        // Throws QueueUnderflowException if this queue is empty;
        // otherwise, removes rear element from this queue and returns it.
        if(isEmpty()) throw new QueueUnderflowException("Deque is empty.");
        else{
            T current = elements[rear];
            rear = (rear - 1 + elements.length) % elements.length;
            numElements -= 1;
            return current;
        }

        
    }
    
    @Override
    public boolean isFull(){
        // Returns true if this queue is full; otherwise, returns false.
        return (numElements == elements.length);
    }
    
    @Override
    public boolean isEmpty(){
        // Returns true if this queue is empty; otherwise, returns false.
        return (numElements == 0);
    }
    
    @Override
    public int size(){
        // Returns the number of elements in this queue.
        return numElements;
    } 
}

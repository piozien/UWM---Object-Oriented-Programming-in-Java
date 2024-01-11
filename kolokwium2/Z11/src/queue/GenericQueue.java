package queue;


import java.util.LinkedList;

public class GenericQueue <T> {
    LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T t) {
        queue.addLast(t);
    }
    public T dequeue(){
        if(queue.isEmpty()){
            throw new IllegalArgumentException("Queue is empty!");
        }
        return queue.removeFirst();
    }



}

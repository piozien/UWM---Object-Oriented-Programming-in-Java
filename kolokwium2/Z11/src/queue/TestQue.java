package queue;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;

public class TestQue {
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        try {
            System.out.println(queue.dequeue());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}

package stack_queue_hashMap_hashing;
import java.util.*;

public class QueueUsingStack{
    Stack<Integer> inStack =new Stack<>();
    Stack<Integer> outStack=new Stack<>();
    
    public void enqueue(int x){
        inStack.push(x);
        System.out.println(x+" enqueued");
    }
    
    public int dequeue() {
        if (inStack.isEmpty() && outStack.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        if (outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
    
    public int peek() {
        if (inStack.isEmpty() && outStack.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        if (outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }
    
    public boolean isEmpty(){
        return inStack.isEmpty() && outStack.isEmpty();
    }
    
    public static void main(String[] args){
        QueueUsingStack queue =new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued: "+queue.dequeue());
        System.out.println("Front: "+queue.peek());
        System.out.println("Dequeued: "+queue.dequeue());
    }
}
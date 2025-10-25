import java.util.*;
public class DSA_51 {
    static class MyQueue{
        private Stack<Integer> input;
        private Stack<Integer> output;

        public MyQueue(){
            input = new Stack();
            output = new Stack();
        }

        public void push(int x){
            input.push(x);

        }

        public int pop(){
            peek();
            return output.pop();
        }

        public int peek(){
            if(output.isEmpty()){
                while(!input.isEmpty()){
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean isEmpty(){
            return (input.isEmpty() && output.isEmpty());
        }
    }

    public static void main(String args[]){
        
        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front element: " + q.peek()); // 10
        System.out.println("Dequeued: " + q.pop());       // 10
        System.out.println("Front element: " + q.peek()); // 20
        System.out.println("Is queue empty? " + q.isEmpty()); // false

        q.pop(); // removes 20
        q.pop(); // removes 30

        System.out.println("Is queue empty after all pops? " + q.isEmpty()); 
    }

    
    
}

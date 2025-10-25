public class DSA_49 {
    static class MyQueue{
        private int[] queue;
        private int front, rear, capacity, size;

        public MyQueue(int capacity){
            this.capacity = capacity;
            queue = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int val){
            if(size == capacity){
                System.out.println("Queue is full");
            }
            rear = (rear + 1) % capacity;
            queue[rear] = val;
            size++;
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty Dequeue operation cant be performed");
                return -1;
            }
            
            int pop = queue[front];
            front = (front + 1) % capacity;
            size--;
            return pop;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return queue[front];
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            System.out.println("Queue Elements");
            for(int i = 0; i < size; i++){
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        MyQueue q = new MyQueue(10);
        q.enqueue(21);
        q.enqueue(22);
        q.enqueue(23);
        q.enqueue(24);
        q.enqueue(25);
        q.enqueue(26);
        q.enqueue(27);
        q.enqueue(28);
        q.enqueue(29);

        q.display();
        System.out.println("The front element of queue : " + q.peek());
        System.out.println("The dequeue element of queue : " + q.dequeue());
        q.display();
    }

}

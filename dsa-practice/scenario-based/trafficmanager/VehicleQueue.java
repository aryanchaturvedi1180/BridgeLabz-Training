package scenario.trafficmanager;

class VehicleQueue {

    private int front, rear, size, capacity;
    private String[] queue;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String vehicle) {
        if (isFull()) {
            System.out.println("Queue Overflow! Vehicle waiting outside.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicle;
        size++;
        System.out.println(vehicle + " added to waiting queue");
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No vehicle waiting.");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }
}

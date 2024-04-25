/*
 * Write a generic class “Queue” of using a array. Assume that a Queue follows FIFO property with the pre-defined operations as: Enqueue,Dequeue, Display. Define a constructor to create an array of any data types; the size of the array is provided by the user. Write the definitions of the methods for the above 3 operations. Invoke them iteratively in menu-driven choice
 */

import java.util.Scanner;

class Queue<T> {
    Object arr[];
    int n, front, rear;

    Queue(int n) {
        this.n = n;
        this.arr = (T[]) new Object[n];
        front = rear = -1;
    }

    void enqueue(T item) {
        if (n == arr.length - 1) {
            System.out.println("QUEUE IS FULL !");
        } else {
            arr[++rear] = item;
            System.out.println("ENQUEUED SUCCESSFULLY!");
        }
    }

    T dequeue() {
        if (front == -1) {
            return null;
        } else {
            T item = (T) arr[front + 1];
            return item;
        }
    }

    void display() {
        for (int i = 0; i < rear; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Q10_oos_lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue<Integer> queue = new Queue<Integer>(size);
        queue.enqueue(10);
        queue.display();
    }
}

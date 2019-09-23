package com.test;

import java.util.Arrays;

public class Queue2 {
    private Integer [] queue;
    private int capacity;
    private int size;
    private int head;
    private int tail;

    public Queue2(int capacity) {
        queue = new Integer[capacity];
        this.capacity = capacity;
    }

    // 入队
    public void enqueue(Integer item) {
        // 判断队列是否已满
        if(size == capacity) return;
        queue[tail] = item;
        size++;
        if (tail == capacity - 1) {
            tail = 0;
        }else{
            tail++;
        }
    }

    // 出队
    public Integer dequeue(){
        // 判断队列是否为空
        if(head == tail && size == 0) return null;
        Integer result = queue[head];
        queue[head] = null;
        size--;
        if (head == capacity - 1) {
            head = 0;
        }else{
            head++;
        }
        return result;
    }

    public void show(){
        System.out.println(Arrays.asList(queue));
    }

    public static void main(String[] args) {
        Queue2 queue = new Queue2(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.show();
    }
}

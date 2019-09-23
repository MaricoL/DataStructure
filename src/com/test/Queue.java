package com.test;


import java.util.Arrays;

// 循环队列
public class Queue {
    private Integer[] items;
    private int capacity;
    private int head;
    private int tail;

    public Queue(int capacity) {
        items = new Integer[capacity];
        this.capacity = capacity;
    }

    // 入队
    public void enqueue(Integer item) {
        // 判断是否已满
        if((tail + 1) % capacity == head) return;

        items[tail] = item;
        tail = (tail + 1) % capacity;
    }

    // 出队
    public Integer dequeue(){
        // 判断队列是否为空
        if(head == tail) return null;

        Integer result =  items[head];
        items[head] = null;
        head = (head + 1) % capacity;
        return result;
    }

    // 打印队列元素
    public void show() {
        System.out.println(Arrays.asList(items));
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(4);

        queue.show();
    }
}

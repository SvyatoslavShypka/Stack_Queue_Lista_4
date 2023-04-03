package com.company;

import com.company.exceptions.EmptyQueueException;
import com.company.exceptions.FullQueueException;
import com.company.exceptions.FullStackException;

public class Inverter {

    // Odwróć kolejność elementów w kolejce wykorzystując do tego stos zaimplementowany w klasie ArrayStack
    public static <T> void invert(IQueue<T> queue) throws EmptyQueueException, FullQueueException, FullStackException {
//        if (queue.isEmpty()) throw new EmptyQueueException();
        ArrayStack<T> stack = new ArrayStack<>(queue.size());
        int tmpSize = queue.size();
        for (int i = 0; i < tmpSize; i++) {
            if (stack.isFull()) throw new FullStackException();
            stack.push(queue.dequeue());
        }
        tmpSize = stack.size();
        for (int i = 0; i < tmpSize; i++) {
            if (queue.isFull()) throw new FullQueueException();
            queue.enqueue(stack.pop());
        }
    }
}

package com.company;

import com.company.exceptions.EmptyQueueException;
import com.company.exceptions.FullQueueException;
import com.company.exceptions.FullStackException;

public class Inverter {

    // Odwróć kolejność elementów w kolejce wykorzystując do tego stos zaimplementowany w klasie ArrayStack
    public static <T> void invert(IQueue<T> queue) throws EmptyQueueException, FullQueueException, FullStackException {
        if (queue.isEmpty()) throw new EmptyQueueException();
        ArrayStack<T> stack = new ArrayStack<>();
        for (int i = 0; i < queue.size(); i++) {
            if (stack.isFull()) throw new FullStackException();
            stack.push(queue.dequeue());
        }
        for (int i = 0; i < stack.size(); i++) {
            if (queue.isFull()) throw new FullQueueException();
            queue.enqueue(stack.pop());
        }
    }
}

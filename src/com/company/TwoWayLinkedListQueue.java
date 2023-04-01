package com.company;

import com.company.exceptions.*;

public class TwoWayLinkedListQueue<T> implements IQueue<T> {

    public TwoWayLinkedListQueue(int capacity) {
        // TODO
    }

    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    @Override
    public boolean isFull() {
        // TODO
        return false;
    }

    @Override
    public void enqueue(T value) throws FullQueueException {
        // TODO
    }

    @Override
    public T first() throws EmptyQueueException {
        // TODO
        return null;
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        // TODO
        return null;
    }

    @Override
    public int size() {
        // TODO
        return -1;
    }
}

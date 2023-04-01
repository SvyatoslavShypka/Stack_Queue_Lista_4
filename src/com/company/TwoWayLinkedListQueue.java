package com.company;

import com.company.exceptions.*;

public class TwoWayLinkedListQueue<T> implements IQueue<T> {

    static int limit;
    TwoWayLinkedList<T> list;

    public TwoWayLinkedListQueue(int capacity) {
        list = new TwoWayLinkedList<>();
        limit = capacity;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return list.size() == limit;
    }

    @Override
    public void enqueue(T value) throws FullQueueException {
        if (isFull()) {
            throw new FullQueueException();
        }
        list.add(value);
    }

    @Override
    public T first() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return list.get(0);
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return list.removeAt(0);
    }

    @Override
    public int size() {
        return list.size();
    }
}

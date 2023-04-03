package com.company;

import com.company.exceptions.FullStackException;
import java.util.EmptyStackException;

public class ArrayStack<T> implements IStack<T> {

    private static final int DEFAULT_CAPACITY = 16;
    T array[];
    int topIndex;

    // klasy generyczne w zasadzie są typu Object
    // pozwalają jednak już na etapie kompilacji sprawdzać poprawność typów
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        array = (T[])(new Object[capacity]);
        topIndex = 0;
    }

    public ArrayStack() {
        array = (T[])(new Object[DEFAULT_CAPACITY]);
        topIndex = 0;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == 0;
    }

    @Override
    public boolean isFull() {
        return topIndex == array.length;
    }

    @Override
    public T top() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return array[topIndex - 1];
    }

    @Override
    public T pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return array[--topIndex];
    }

    @Override
    public void push(T value) throws FullStackException {
        if(isFull()) {
            throw new FullStackException();
        }
        array[topIndex++] = value;
    }

    @Override
    public int size() {
        return topIndex;
    }
}

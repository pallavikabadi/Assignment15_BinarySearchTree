package com.bridgelabz.Uc2;

public class INode<T extends Comparable<T>> {
    /*
    Initializing
     */
    T data;
    INode<T> nextL;
    INode<T> nextR;

    public INode(T data) {
        /*
        Parameterized Constructor
         */
        this.data = data;
    }
}
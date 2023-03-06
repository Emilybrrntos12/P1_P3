/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1p3;

import java.util.Stack;

/**
 *
 * @author Emily Barrientos
 */
public class BST {
    
    private static class Node{
        private int data;
        private Node izq, derch;
        
        private Node(int value){
            data= value;
            izq = derch = null;
        }
    }
    private Node root;
    
    public BST(){
        root = null; 
    }
    
    public boolean isEmpty(){
        return null == root;
    }
    
    public int size(){
        Node current = root;
        int size = 0;
        Stack<Node> stack = new Stack<Node>();
        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.derch;
            }else{
                size++;
                current = stack.pop();
                current = current.derch;
            } 
        }
        return size;
    }
    
    public void clear(){
        root = null;
    }
}

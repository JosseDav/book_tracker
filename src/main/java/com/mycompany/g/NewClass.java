/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
/**
 *
 * @author josse
 */
public class NewClass {
    public static void main(String args[]){
        // array
        int[] color = new int[5];
        for(int i = 0; i < color.length; i++){
            color[i] = -1;
        }
        for(int i: color){
            System.out.println(i);
        }
        // queue
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < 10; i++){
            q.add(i);
        }
        System.out.println();
        q.forEach(i -> {
            System.out.println(i);
        });
        System.out.println();
        q.remove();
        q.forEach(i -> {
            System.out.println(i);
        });
        System.out.println();
        // stack
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < 10; i++){
            s.push(i);
        }
        s.forEach(i ->{
            System.out.println(i);
        });
        System.out.println();
        //attempt at backtracking
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a.add(i);
        }
        for(int i = 0; i < 10; i++){
            a.remove(i);
            System.out.print(i + " ");
            a.add(i);
        }
        a.forEach(i ->{
            System.out.println(i);
        });
    }
}

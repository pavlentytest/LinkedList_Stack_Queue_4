package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        /*

                          add (begin)   add(middle)   add(end)
        ArrayList (n)       O(n)         O(n)          O(n)      <- создается массив
        LinkedList          O(1)         O(n)          O(1)
         */

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add (begin):"+duration);

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add (begin):"+duration);


        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(i);// в конец
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList add (end):"+duration);

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(i); // в конец
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add (end):"+duration);


         /*
                          get (begin)   get(middle)   get(end)
        ArrayList (n)       O(1)           O(1)          O(1)
        LinkedList          O(1)           O(n)         O(1)
         */


        startTime = System.nanoTime();
        for(int i=75000;i<125000;i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get (middle):"+duration);

        startTime = System.nanoTime();
        for(int i=75000;i<125000;i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get (middle):"+duration);


            /*

                          remove (begin)   remove(middle)   remove(end)
        ArrayList (n)       O(n)              O(n)            O(1)
        LinkedList          O(1)              O(n)            O(1)
         */


        startTime = System.nanoTime();
        for(int i=0;i<5000;i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove (begin):"+duration);

        startTime = System.nanoTime();
        for(int i=0;i<50000;i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove (begin):"+duration);

              //   Collections.sort();
        Collection<String> abc = new ArrayList<>();
        List<String> abc2 = new ArrayList<>();

        // Collections => List, Set
        // Maps => Map

        // Stack => LIFO - last in first out
        // Queue => FIFO - first in first out

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s);
            queue.offer(s);
            // кладем
            //stack.add()

        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // удаляем и печатаем последний
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // удаляем и печатаем первый
        }



    }
}

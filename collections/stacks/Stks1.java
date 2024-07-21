package stacks;

import java.util.ArrayDeque;

public class Stks1 {
    public static void main(String[] args) {
        ArrayDeque <Integer> it=new ArrayDeque<Integer>();

        it.push(10);
        it.push(30);
        it.push(50);

        System.out.println(it);
        System.out.println(it.pop());
        System.out.println(it);
        System.out.println(it.peek());
        // System.out.println(it.peekLast());

    }
}

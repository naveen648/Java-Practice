package linkedlists;

import java.util.LinkedList;
public class LkLst1 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.offer(10);
        list.offer(20);
        list.offer(30);
        list.offer(40);
        list.offer(50);
        list.offer(60);
        list.offer(10);

        System.out.println(list.poll());
        System.out.println(list.pollLast());

        System.out.println(list.offerLast(70));
        System.out.println(list.offer(10));

        System.out.println(list.peek());
        System.out.println(list.peekLast());

        System.out.println(list);



    }
}

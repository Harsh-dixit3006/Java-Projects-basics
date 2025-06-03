package Collection;

import java.util.LinkedList;
import java.util.Queue;

class Queue_ {
    public static void main(String[] args) {
        Queue<String > newQueue = new LinkedList<>();
        newQueue.add("Harsh");
        newQueue.add("Akarsh");
        newQueue.offer("Utakarsh");
        newQueue.remove("Harsh");
        newQueue.poll();
//        System.out.println(newQueue.element());
//        System.out.println(newQueue.peek());
        for (int i = 0; i < newQueue.size(); i++) {
            System.out.printf("%s",i);
            
        }


    }
}

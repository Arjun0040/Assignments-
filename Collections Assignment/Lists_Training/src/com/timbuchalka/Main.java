package com.timbuchalka;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Items> itemsArrayList = new ArrayList<>();
        List<Items> itemsLinkedList = new LinkedList<>();
        PriorityQueue<Items> itemsPriorityQueue = new PriorityQueue<>();

        Items tea = new Items("Tea", 3);
        Items sugar = new Items("Sugar", 3);
        Items soap = new Items("Soap", 5);
        Items detergent = new Items("Detergent", 10);
        Items broomStick = new Items("Broom Stick", 1);

        //Array List operations
        itemsArrayList.add(tea);
        itemsArrayList.add(sugar);
        itemsArrayList.add(soap);
        itemsArrayList.add(detergent);
        itemsArrayList.add(broomStick);
        itemsArrayList.add(5, new Items("Cat", 2));
        Items chalk = new Items("Chalk", 100);
        itemsArrayList.contains(chalk);
        itemsArrayList.indexOf(soap);
        itemsArrayList.get(3);
        itemsArrayList.remove(detergent);

        //Linked List Operations
        itemsLinkedList.addAll(itemsArrayList);
        itemsLinkedList.isEmpty();
        itemsLinkedList.lastIndexOf(broomStick);
        itemsLinkedList.set(1, new Items("Biscuit", 2));


        //Priority Queue Operations
        itemsPriorityQueue.offer(tea);
        itemsPriorityQueue.offer(new Items("Fan", 1));
        itemsPriorityQueue.peek();
        itemsPriorityQueue.poll();
        itemsPriorityQueue.remove(soap);
        itemsPriorityQueue.toArray();
        itemsPriorityQueue.getClass();
        itemsPriorityQueue.clear();

        showItems(itemsArrayList);
        System.out.println("----------------------");
        showItems(itemsLinkedList);
        System.out.println("----------------------");
        showItems(itemsPriorityQueue);


    }

    static void showItems(List<Items> list) {
        Iterator<Items> itemsIterator = list.iterator();
        while (itemsIterator.hasNext()) {
            Items items = itemsIterator.next();
            System.out.print(items.getName() + " ");
        }
    }

    static void showItems(Queue<Items> itemsQueue) {
        for (Items item : itemsQueue) {
            System.out.println(item.getName());
        }
    }
}

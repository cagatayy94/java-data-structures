package com.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addFirst(new Person("Ali", 25));
        linkedList.addLast(new Person("Aliye", 22));
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> superMarket = new LinkedList<>();

        superMarket.add(new Person("Alex", 21));
        superMarket.add(new Person("Maria", 18));
        superMarket.add(new Person("Ali", 40));

        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());
    }

    static record Person(String name, int age){}
}

//package collection_framework;

//program to demonstrate various methods of arraylist and
//their use

import java.util.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
import java.lang.String;

class exp {
    int i = 10;
    String j;
}

public class arraylist {
    public static void main(String args[]) {

        // arraylist to store any type of data
        ArrayList<Object> a = new ArrayList<Object>();

        exp ex = new exp();
        exp ex1 = new exp();

        // adding string ,int,float and custom class object
        // to ArrayList
        a.add("hello");
        a.add(4);
        a.add(102345.23456789);
        a.add(ex);
        a.add(ex1);

        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i).getClass());

        // type conversion is required as ArrayList stores
        // elements as objects of class Object
        exp j = (exp) a.get(3);
        System.out.println("value of i in j(exp obj):" + j.i);

        int i = (int) a.get(1);
        System.out.println("value of int at index(1):" + i);

        ArrayList<Integer> b = new ArrayList<Integer>(3);
        b.add((Integer) a.get(1));
        System.out.println("size of arrayList(b):" + b.size());

        // list iterator
        ListIterator<Object> l1 = a.listIterator();

        while (l1.hasNext()) {
            System.out.println("next():" + l1.next());
        }

        while (l1.hasPrevious()) {
            System.out.println("previous():" + l1.previous());
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int k = 10; k > 1; k--) {
            al.add(k);
        }

        System.out.println("Before sorting:" + al);
        Collections.sort(al);
        System.out.println("After sorting:" + al);

        System.out.println("Before shuffle:" + al);
        Collections.shuffle(al);
        System.out.println("After shuffle:" + al);

    }
}

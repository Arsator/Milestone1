package main.java.com.myproject;

import java.util.*;

public class App {
    private List<Integer> arr = null;

    //constructor
    public App() {
        arr = new ArrayList<Integer>();
    }

    //Add into list
    public void addElement(int num) {
        arr.add(num);
    }

    //size of List
    public int getSize() {
        return arr.size();
    }

    //sum of elements
    public int getSum() {
        int sum = 0;
        for(int num : arr) sum += num;

        return sum;
    }

    //number of unique elements
    public int numOfUniqueElements() {
        HashSet<Integer> uniqueElements = new HashSet<Integer>();
        for(int num : arr) uniqueElements.add(num);

        return uniqueElements.size();
    }
}
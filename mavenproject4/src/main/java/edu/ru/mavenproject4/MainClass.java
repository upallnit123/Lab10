package edu.ru.mavenproject4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author upall
 */
public class MainClass {
    
    public static void main(String[] args){
        
    ArrayList<Integer> myArray = new ArrayList<>();
    HashMap<Integer, Integer> myHashMap = new HashMap();
    
    Random randomizer = new Random();
    int randomNumber = randomizer.nextInt();
    
    for (int i=0; i < 1000000; i++) {
        myArray.add(randomNumber);
        myHashMap.put(randomNumber, i);
        randomNumber = randomizer.nextInt();
        
    }
    
    int n = 5;
    
    long start = System.nanoTime();
    myArray.contains(5);
    long end = System.nanoTime();
    long duration = end - start;
    System.out.println("Array lookup took: " + duration + " nano seconds.");
    
    start = System.nanoTime();
    myHashMap.containsKey(n);
    end = System.nanoTime();
    duration = end - start;
    System.out.println("Hashmap lookup tool:" + duration + " nano seconds.");
    myHashMap.containsKey(n);
    }
}

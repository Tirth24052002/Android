
package com.example.myapplication.javapractice;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class CollectionTypes {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Merceds");
        cars.add("Masarati");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Nisson GTR");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.clone());
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.isEmpty());
        System.out.println(cars.get(0));
        System.out.println(cars.set(0, "Ford Mustang"));
        System.out.println(cars);
        System.out.println(cars.remove(1));
        cars.clear();
        cars.isEmpty();
        ArrayList<String> Animals = new ArrayList<String>();
        Animals.add("Lion");
        Animals.add("Tiger");
        Animals.add("Deer");
        Animals.add("Giraffe");
        Animals.add("Monkey");
        for (int i = 0; i < Animals.size(); i++) {
            System.out.println(Animals.get(i));
        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(22);
        myNumbers.add(21);
        myNumbers.add(11);
        myNumbers.add(44);
        myNumbers.add(33);
        myNumbers.add(11);
        myNumbers.add(0);
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        //Linked List
        LinkedList<String> names = new LinkedList<String>();
        names.add("Aman");
        names.add("Bhavesh");
        names.add("Chris");
        names.add("Dan");
        names.add("Elen");
        String name = names.get(2);
        System.out.println(name);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //Hash Map
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("India", "Delhi");
        capitalCities.put("Sri lanka", "Columbo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("England", "London");
        capitalCities.put("Norway", "Oslo");
        System.out.println(capitalCities.get("England"));
        for(String i: capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i: capitalCities.values()) {
            System.out.println(i);
        }
        HashSet<String> bikes = new HashSet<String>();
        bikes.add("Ninja");
        bikes.add("Indian");
        bikes.add("Harly Davidson Fat Boy ");
        bikes.add("Bullet");
        bikes.add("Metor");
        bikes.add("R2Z");
        bikes.add("Pulser");
        bikes.add("FZ-S");
        System.out.println(bikes.contains("Ninja"));
        System.out.println(bikes.remove("FZ-S"));
        System.out.println(bikes);
        for (String i : bikes) {
            System.out.println(i);
        }
        HashSet<Integer> numb = new HashSet<Integer>();
        numb.add(1);
        numb.add(2);
        numb.add(10);
        numb.add(22);
        numb.add(44);
        numb.add(25);
        numb.add(9);
        numb.add(49);
    for(int i = 0 ; i <= 50; i++ ) {
        if(numb.contains(i)) {
            System.out.println(i + " was found in the set");
        } else {
            System.out.println(i + " was not fount in the set");
        }
    }
        List<String> list = Arrays.asList("Leon", "Simona");
        List<String> anotherList = new ArrayList<String>();
        anotherList.add("kin");
        anotherList.add("Min");
        list.forEach(System.out::println);
        anotherList.forEach(System.out::println);
        System.out.println("Sorting with natural order");
        List<String> l1 = createList();
        l1.sort(null);
        l1.forEach(System.out::println);

        System.out.println("Sorting with a lamda expression in comparison");
        List<String> l2 = createList();
        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        l2.forEach(System.out::println);
    }
    private static List<String> createList() {
        return Arrays.asList("iPhone","Ubuntu", "Android", "Mac OS");
    }
}
class collectionAndLambas {
    public static void main(String[] args) {
        List<String> personList = Arrays.asList("Carl", "Fik");
        List<String> anotherPersonList = new ArrayList<>();
        anotherPersonList.add("larson");
        anotherPersonList.add("Viu");
        personList.forEach(System.out::println);
        anotherPersonList.forEach(System.out::println);
        //
        List<Integer> list = Arrays.asList(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 1);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
class ShortingList{
    public static void main(String[] args) {
        System.out.println("Sorting with natural order");
        List<String> p1 = createPersons();
        p1.sort(null);
        p1.forEach(System.out::println);

        System.out.println("Sorting with the lamda comparison ");
        List<String> p2 = createPersons();
        p2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        p2.forEach(System.out::println);

        System.out.println("Sorting with method reference");
        List<String> p3 = createPersons();
        p3.sort(String::compareToIgnoreCase);
        p3.forEach(System.out::println);
    }
    private static  List<String> createPersons() {
        return Arrays.asList("Manan", "Hitesh", "Ajay", "Leon");
    }
}
class HashMaps {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("keyONe", "KeyTow", "KeyThree", "KeyThree");
        Map<String, String> mapTwo = Map.ofEntries(
                Map.entry("keyOne", "ValueOne"),
                Map.entry("KeyTwo", "ValueTwo"),
                Map.entry("Ket100", "Value100")
        );
        Map<String, String> mapThree = new HashMap<>();
        mapThree.put("Andorid", "Mobile");
        mapThree.put("Eclipse", "Java");
        mapThree.put("Eclispse", "Java");
        mapThree.put("Git", "Version control system");
        mapThree.forEach((k,v) -> System.out.printf("%s %s%n", k, v));

        Map<String, String> mapFour = new HashMap<>();
        mapFour.put("Andorid", "Mobile");
        mapFour.put("Eclipse", "Java");
        mapFour.put("Eclispse", "Java");
        mapFour.put("Git", "Version control system");
        String[] keys = mapFour.keySet().toArray(new String[mapFour.keySet().size()]);
        for (String string: keys) {
            System.out.println(string);
        }
        List<String> list = new ArrayList<String>(mapFour.keySet());
        for(String string: list) {
            System.out.println(string);
        }
        Map<String, Integer> mapFive = new HashMap<>();
        mapFive.put("Android", 1 + mapFive.getOrDefault("Android", 0));
        mapFive.forEach((k, v) -> System.out.printf("%s %s%n", k, v));

        Map<String, Integer> mapSix = Map.of();
        mapSix.keySet().forEach(key -> System.out.println(key + " " + mapSix.get(key)));
        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
class LinkedLst{
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        l1.add(2, "E");
        System.out.println(l1);
    }
}
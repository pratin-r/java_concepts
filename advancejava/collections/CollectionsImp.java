package advancejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class CollectionsImp {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(4);
        list1.add(5);
        list1.add(2);
        for (Integer i : list1) {
            System.out.println(i);
        }
        Set<Integer> set1 = new TreeSet<>(); // maintains insertion order
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        for (Integer i : set1) {
            System.out.println(i);
        }
        Iterator<Integer> it1 = set1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        set1.forEach(v -> System.out.println(v));
        Map<String, Integer> hm = new HashMap<>();
        hm.forEach((k, v) -> System.out.println(k + " " + v));
        for (Map.Entry<String, Integer> i : hm.entrySet()) {
            System.out.println(i.getValue());
        }
        Collections.sort(list1);
        Student stu1 = new Student("Ada", 32);
        Student stu2 = new Student("Leon", 33);
        List<Student> li2 = new ArrayList<>();
        li2.add(stu1);
        li2.add(stu2);
        li2.add(new Student("Ethan", 37));
        for (Student s : li2) {
            System.out.println(s.name + " " + s.age);
        }
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
        LinkedHashSet<String> nameSet = new LinkedHashSet<>(names);
        for (String name : nameSet) {
            System.out.println(name);
        }
    }
}

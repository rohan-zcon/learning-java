package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashMapDemo {
    public static void main(String[] args) {
        /*
        HashMaps
            Unordered, not sync
            K, V pair Node is stored in an internal array implementation
            K, V pair Node consists of Key, Value and pointer to the next Node.
                Implementation of LinkedList.
            Hash function is used to get the hashcode
            This hash code is then used to determine
                the index of the array at which the K, V pair to be inserted.
            Index is calculated in the form
                int index = hashCode % arraySize
            Sometimes there could be a collision
                ie different input gives out same hashCode and therefore same array index.
            In such scenarios LinkedList emerging from same array index is useful.
            In and after Java8, hybrid approach to handle collision is used
                After threshold of 8 Nodes of LinkedList,
                the data structure switches to Self Balancing Tree to maintain efficiency
            Default
                internal arraySize=16
                load factor=0.75
                Nodes threshold=8
        */
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(3, "Rohan");
        hMap.put(5, "Soham");
        System.out.println("hMap: " + hMap);
        System.out.println("hMap at 3: " + hMap.get(3));
        Set<Integer> keys = hMap.keySet();
        Set<Map.Entry<Integer, String>> allEntries = hMap.entrySet();
        for (Map.Entry<Integer, String> eachEntry : allEntries) {
            System.out.println("Each entry: " + eachEntry);
        }


        /*
        Default hashCode depends on memory address & equals() checks for memory references
        We can override the Hash and equals() function to our liking.
         */

        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Rohan", 89); // hashCode1 --> index1 of internal array to store data
        studentMarks.put("Shubham", 79); // hashCode2 --> index2 of internal array to store data
        studentMarks.put("Rohan", 99); // hashCode1 --> index1 oterf internal array
        // but data is already present. using the .equals() method it checks the strings
        // now even the strings are equal so it REPLACES it. if the string were not equal it would be a collision case
        System.out.println("Size of studentMarks map:  " + studentMarks.size());
        System.out.println("Marks of Rohan: " + studentMarks.get("Rohan"));

        // Above demo had pre defined classes. Now we use custom defined Student class

        Student s1 = new Student(1, "rohan");
        Student s2 = new Student(2, "shubham");
        Student s3 = new Student(1, "rohan"); // s1 and s3 are kept same intentionally

        HashMap<Student, Integer> studentMarksMap = new HashMap<>();
        studentMarksMap.put(s1, 89);
        studentMarksMap.put(s2, 79);
        studentMarksMap.put(s3, 99);

        // Default Hash function generates hash based on memory. s3 new object has diff memory address than s1
        // so s3 does not replace s1 and new k,v pair is added, and now hashmap is of size 3
        // this default behaviour is by hash and equals function which we have now overridden in Student class
        // the overridden methods use combination of id & name to create hash and compare

        System.out.println("Size of custom studentMarksMap HashMap:  " + studentMarksMap.size());
        System.out.println("Value of s1: " + studentMarksMap.get(s1));

    }
}

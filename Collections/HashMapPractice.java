package Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"Jack");
        hashMap.put(2,"James");
        hashMap.put(3,"John");

        System.out.println(hashMap);

        System.out.println(hashMap.get(2));

        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsValue("John"));

        Set<Integer> keys = hashMap.keySet();
        for(int i : keys){
            System.out.println(hashMap.get(i));
        }
    }
}

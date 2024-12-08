package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"test1");
        map.put(2,"test2");
        map.put(3,"test3");
        map.put(4,"Test1");
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Map.Entry<Integer,String>m:map.entrySet()){
            System.out.println(m.getValue());
            System.out.println(m.getKey());
        }
    }
}

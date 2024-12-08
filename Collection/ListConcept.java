package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcept {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        //list allows duplicate.maintain order.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
        Iterator<Integer>it= list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"   ");
        }

    }
}

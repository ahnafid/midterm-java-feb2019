package datastructure;

import java.util.*;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */


        List<String> array = new ArrayList<String>();
        array.add("Bangladesh");
        array.add("United state");
        array.add("united Kingdon");
        array.add("France");
        array.add("Portugal");

        System.out.println(array.size());
        System.out.println(array.remove(2));

        for(String arr :array){
            System.out.println(arr);
        }


        System.out.println("      ****************    +     ***************");

        Iterator<String> its = array.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }


        Map<Integer,List<String>> map = new HashMap<>();
        map.put(1,array);
        System.out.println(map.get(1));









    }

}
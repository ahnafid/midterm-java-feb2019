package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> city = new ArrayList<>();
        city.add("Dhaka");
        city.add("Sylhet");
        city.add("comilla");
        city.add("Khulna");

        List<String> division = new ArrayList<>();
        division.add("Rajshahi");
        division.add("Chittagong");
        division.add("Sylhet");
        division.add("Dhaka");
        division.add("Rangpur");

        List<String> players = new LinkedList<>();
        players.add("Mashrafee");
        players.add("Tamim");
        players.add("Ashraful");
        players.add("Mustafizur");


        Map<String,List<String>> map = new HashMap<>();
        map.put("Mcity",city);
        map.put("DVSIN",division);
        map.put("playername",players);

        for(Map.Entry<String,List<String>> mp : map.entrySet()){
            System.out.println(mp.getKey()+" -------->  "+mp.getValue());

        }

    }

}
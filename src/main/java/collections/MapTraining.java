package collections;

import java.util.HashMap;
import java.util.Map;

public class MapTraining {
    public static void mapTrain() {

        String name1 = "Joe";
        String name2 = "John";
        String name3 = "Mike";

        Map<Integer, String> namesMap = new HashMap<>(); //declaration and initialization of Map
        namesMap.put(1, name1);
        namesMap.put(2, name2);
        namesMap.put(3, name3);

        printMap(namesMap);
        System.out.println(namesMap.size());
        namesMap.put(2, name1);

        printMap(namesMap);
        System.out.println(namesMap.size());



    }

    public static void printMap(Map<Integer, String> mapName) {
        for(Map.Entry<Integer,String> tuple : mapName.entrySet())
            System.out.println(tuple.getKey() + " " + tuple.getValue());
    }
}

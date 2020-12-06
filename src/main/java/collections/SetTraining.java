package collections;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void trainSet() {
        String name1 = "Mark";
        String name2 = "Paul";
        String name3 = "Eric";

        Set<String> uniqueNames = new HashSet<>();  //set implementation that consists unique elements
        uniqueNames.add(name1);
        uniqueNames.add(name2);
        uniqueNames.add(name3);

        System.out.println(uniqueNames.size());

        uniqueNames.add(name1);
        uniqueNames.add(name2);

        System.out.println(uniqueNames.size());
    }
}

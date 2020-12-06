package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTraining {
    public static void trainList() {
        String name1 = "John";
        String name2 = "Mark";
        String name3 = "Glenn";
        List<String> nameList= new LinkedList<>();
//        ArrayList<String> nameList= new ArrayList<>();

        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);

        System.out.println(nameList.size());

        nameList.add(name2);

        System.out.println(nameList.size());
    }
}

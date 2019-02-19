package libs;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {

    public List<List<String>> addNewList(List<List<String>> ourlist) {
        ourlist.add(new ArrayList<>());
        printListList(ourlist);
        return ourlist;
    }


    public List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        if (ourList.size() >= numberOfList) {
            ourList.get(numberOfList).add(value);
            printListList(ourList);
        } else {
            System.out.println("Warning! You try get the nonexistent list...Value is not added.");
        }
        return ourList;

    }

    private void printListList(List<List<String>> ourList) {
        System.out.println("---------");
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(ourList.get(i));

        }


    }

}













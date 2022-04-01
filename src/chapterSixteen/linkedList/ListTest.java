package chapterSixteen.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String [] colors = {"black", "yellow","blue","violet","silver"};
        List<String> list1 = new LinkedList<>();

        for (String color: colors){
            list1.add(color);
        }

        String [] colors2 = {"gold", "white","brown","blue","gray","silver"};
        List<String> list2 = new LinkedList<>();

        for (String color: colors2){
            list2.add(color);
        }

        list1.addAll(list2);
        Collections.sort(list1, Collections.reverseOrder());



        list2  = null;
        System.out.println(list2);
        removeItems(list1, 4,7);
        printReversedList(list1);
    }

    private static void removeItems(List<String> list,int start, int end){
        list.subList(start, end).clear();
    }
    private static void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List: %n");

        while(iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());

        }    }
}

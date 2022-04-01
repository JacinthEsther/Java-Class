package chapterSixteen;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        String [] colors= {"Magenta","Blue","Pink","Green"};


        List<String> list = new ArrayList<String>(Arrays.asList(colors));
//        System.out.println(list);

        String[] removeColor = {"Magenta","Blue","Pink"};
        List<String> list2 = new ArrayList<String>(Arrays.asList(removeColor));

        removeColors(list,list2);
        for(String color : list) {
            System.out.println("The remaining color in list after removal is: "+color);
        }

    }
    private static void removeColors( Collection <String> collection1, Collection <String> collection2){
        Iterator<String> iterator = collection1.iterator();

        while(iterator.hasNext()){
            if(collection2.contains(iterator.next())) iterator.remove();
        }
    }
}

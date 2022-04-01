package chapterSixteen;

import java.util.ArrayList;

public class AutoBoxingAndAutoUnboxing {
    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
//   .valueOf is taking the primitive type and converting it to the wrapper(Boxing)
//            intArrayList.add(Integer.valueOf(i));
            intArrayList.add(i);
        }
        for (int i = 0; i < 10; i++) {
//            unboxing: from wrapper to primitive value:intArrayList.get(i).intValue()
            System.out.println(i+ " --> "+ intArrayList.get(i));
        }
    }
}

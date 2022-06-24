package practice;

import java.util.ArrayList;

public class BinarySearch {

        ArrayList<Integer> numbers;
        public BinarySearch() {
            numbers = new ArrayList<>();
        }

    public static void main(String[] args) {
      BinarySearch search = new BinarySearch();
      search.add(1);
      search.add(3);
      search.add(5);
      search.add(4);
      search.add(7);
      search.find(5);
    }
        public void add(int val) {
            numbers.add(val);
        }

        public void find(int val) {
            int [] arr = new int[numbers.size()];
            for(int i= 0; i < numbers.size(); i++){
                arr[i]= numbers.get(i);
            }
            int newVal =0;
            for (int k : arr) {
                if (k == val) newVal = k;
            }

            for (int k : arr) {

                for (int i : arr) {
                    if (k + i == newVal) {
                        System.out.println("go");
                        return;
                    }
                }

            }
//            System.out.println("not found");


        }
}

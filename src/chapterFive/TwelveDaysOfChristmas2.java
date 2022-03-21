package chapterFive;

public class TwelveDaysOfChristmas2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            switch (i){
                case 12, 11, 10, 9, 8, 6, 7, 5, 4 -> System.out.println("on the "+i + "th day of Christmas, my true love sent to me");
                case 3 -> System.out.println("on the "+i + "rd day of Christmas, my true love sent to me");
                case 2 -> System.out.println("on the "+i + "nd day of Christmas, my true love sent to me");
                case 1-> System.out.println("on the "+i + "st day of Christmas, my true love sent to me");
            }
            for (int j = i; true; j--) {
                switch (j){
                    case 12 : System.out.println("Twelve, Drummers Drumming");
                    case 11 : System.out.println("Eleven, Pipers Piping");
                    case 10 : System.out.println("Ten, Lords a leaping");
                    case 9 : System.out.println("Nine, Ladies Dancing");
                    case 8 : System.out.println("Eight, Maids a Milking");
                    case 7 : System.out.println("Seven, Swarms a Swimming");
                    case 6 : System.out.println("Six, Geese a Laying");
                    case 5 : System.out.println("Five, Golden Rings");
                    case 4 : System.out.println("Four, Calling Birds");
                    case 3 : System.out.println("Three, Fresh Hens");
                    case 2 : System.out.println("Two, Turtle Doves");
                    case 1 : System.out.println("And a Partridge in a pear tree");
                }
                    break;

            }
                        System.out.println();
        }
    }
}

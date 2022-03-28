package chapterFourteen;


public class DateInVariousFormat {
    public static void main(String[] args) {

        dateInFormat("04/25/1955");
    }
    private static void dateInFormat(String date){
        String[] newDate = date.split("/");
        String[] month ={"January","February","March","April","May","June",
        "July","August","September","October","November","December"};
        StringBuilder builder = new StringBuilder();
            for (int j = 0; j < newDate[0].length(); j++) {
                for (int k = 0; k < month.length; k++) {

                    if (Integer.parseInt(newDate[j]) == (k + 1)) {
//
                        builder.append(month[k]).append(" ");
                        break;
                    }
                }
            }
                String nDate = newDate[1].substring(0, 2);
                builder.append(nDate).append(", ").append(newDate[2]);

        System.out.println(builder);
    }
}

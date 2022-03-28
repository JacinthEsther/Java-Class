package chapterFourteen;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        String tokenNumber = "(555) 555-5555";
        String[] tokens = tokenNumber.split(" ");

        String newToken = tokens[0].substring(1,4);

        StringBuilder telephoneToken = new StringBuilder();
        telephoneToken.append(newToken).append("-");
        String [] splitToken = tokens[1].split("-");

        for (String phoneToken: splitToken) {
            telephoneToken.append(phoneToken);
        }
        System.out.println(telephoneToken);

    }
}

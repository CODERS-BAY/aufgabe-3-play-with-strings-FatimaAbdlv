package application;

import java.util.Arrays;

public class PlayWithStrings {
    public static void main(String[] args) {
        System.out.println("Hello String World");
        String a = "Max";
        String b = "Mustermann";
        printInitials(a, b);

        String value1 = "race";
        String value2 = "ca re";
       if( areAnagrams(value1, value2)){
           System.out.println("Is anagram");
       } else {
           System.out.println("Is not an anagram");
       }


        String value = "Eva can I see bees in a cave?";

        if (isPalindrome(value)) {
            System.out.println("Value is a palindrom");

        } else {
            System.out.println("Is not a palindrom");
        }
    }

    public static void printInitials(String firstname, String lastname) {
        System.out.println("Initials: " + firstname.charAt(0) + lastname.charAt(0));

    }

    public static boolean areAnagrams(String value1, String value2) {
        value1 = value1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        value2 = value2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        //replaceAll(a,b) ersetzt alles, was nicht Buchstabe (klein- und großBuchstaben (a-z und A-Z)) und
        //ersetzt es mit nichts "" (wenn " " ersetzt es das mit Leerzeichen)
        //das ^ ist eine Verneinung. Würden wir alle Groß- und Kleinbuchstaben durch z.B. " " Leerzeichen ersetzt haben wollen,
        //dann müssten wir ^ weglassen (z.B. [a-zA-Z], " ")

        if (value1.length() == value2.length()) {

            char[] Arr1 = value1.toCharArray();
            char[] Arr2 = value2.toCharArray();
            Arrays.sort(Arr1);
            Arrays.sort(Arr2);

            if (Arrays.equals(Arr1, Arr2)) {
                return true;
            }


        }
        return false;
    }

    public static boolean isPalindrome(String value) {
        value = value.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int length = value.length();
        int forward = 0;
        int backwards = length - 1;

        while (backwards > forward) {
            char forwardChar = value.charAt(forward++);
            char backwardsChar = value.charAt(backwards--);
            if (forwardChar != backwardsChar) {
                return false;
            }

        }
        return true;


    }
}

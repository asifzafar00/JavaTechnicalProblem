public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("sm***eiy"));
    }

/*
    Return a version of the given string, where for
    every star (*) in the string the star and
    the chars immediately to its left and right
    are gone. So "ab*cd" yields "ad"
    and "ab**cd" also yields "ad".


    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"

    */

    public static String starOut(String str) {
        String starOut = "";
        String endString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i > 1) {
                if (str.charAt(i) == '*') {
                    starOut = str.substring(0, i - 1);
                    break;
                }
            }
        }
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == '*')
                endString = str.substring(i + 2);
            break;

        }
        return starOut + endString;
    }

}

import java.util.Arrays;

public class plusOut {

    public static void main(String[] args) {

        System.out.println(plusOut("12xy34", "xy"));

    }


    /*
         Given a string and a non-empty word string,
         return a version of the original String
         where all chars have been replaced by pluses ("+"),
         except for appearances of the word
         string which are preserved unchanged.

        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

        */
    public static String plusOut(String str, String word) {

        String plusOut = "";
        int[] pos=new int[str.length()] ;
        for (int j = 0; j < word.length(); j++) {
            for (int i = j; i < str.length(); i++) {

                if (str.charAt(i) == word.charAt(j)) {
                    pos[i]=i;
                    plusOut = plusOut + str.charAt(i);
                } else {
                    plusOut = plusOut + "+";
                }


            }
            System.out.println("IND- " + plusOut);
        }

        System.out.println(Arrays.toString(pos));
        for (int k = 0; k < pos.length; k++) {


            // accessing each element of array
            k = pos[k];
        }
        return plusOut;
    }
}

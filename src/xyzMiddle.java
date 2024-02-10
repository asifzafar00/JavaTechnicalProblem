public class xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("axyzb"));
        /*System.out.println();

        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println();

        System.out.println(xyzMiddle("AAssxyzBB"));
        System.out.println();

        System.out.println(xyzMiddle("AeeeAssxyzBBeee"));
        System.out.println();

        System.out.println(xyzMiddle("AeeeeAssxyzBB"));*/
    }

   /*
     Given a string, does "xyz" appear
     in the middle of the string? To
     define middle, we'll say that the
     number of chars to the left and
     right of the "xyz" must differ by
     at most one. This problem is harder
     than it looks.

    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBBB") → false

    */

    public static boolean xyzMiddle(String str) {
        Boolean xyzMiddle = true;
        if (str.length() < 4) return false;

        int start1 = str.length() / 2 - 2;
        int start2 = str.length() / 2 - 1;
        System.out.println("first "+str.charAt(start1));
        System.out.println("second "+str.charAt(start2));
        System.out.println("IND "+str.substring(start2, start2 + 3));
        if (str.length() % 2 == 0) {
            System.out.println("zaf- Even");
            System.out.println(str.length() % 2);
            System.out.println("middle: " + str.charAt(str.length() / 2));
        } else {
            System.out.println("ODD");
            System.out.println("middle :" + str.charAt(str.length() / 2));
          //  System.out.println(str.substring(first));
        }


//        System.out.println("start1 "+start1);
//        System.out.println("start2 "+start2);
        System.out.println("zaf value");
        return xyzMiddle;

    }
}

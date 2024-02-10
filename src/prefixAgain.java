public class prefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 2) );

    }
//    Given a string, consider the prefix string made
//    of the first N chars of the string.
//    Does that prefix string appear somewhere else
//    in the string? Assume that the string is
//    not empty and that N is in the range 1..str.length().
//
//
//    prefixAgain("abXYabc", 1) → true
//    prefixAgain("abXYabc", 2) → true
//    prefixAgain("abXYabc", 3) → false
    public static boolean prefixAgain(String str, int n) {
        String prefixSrt="";
        for (int i = 0; i <str.length()-2 ; i++) {
            if (!(str.charAt(i)=='X' && str.charAt(i+1)=='Y')){
                prefixSrt=prefixSrt+str.charAt(i);
            }

            System.out.println("--"+str.charAt(i));
        }
        System.out.println("** "+prefixSrt);
        return true;
    }

}

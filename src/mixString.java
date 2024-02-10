public class mixString {

    public static void main(String[] args) {
        System.out.println(mixString("Hi", "There"));
    }

   /*
     Given two strings, a and b, create a bigger
     string made of the first char of a,
     the first char of b, the second char of a,
     the second char of b, and so on.
     Any leftover chars go at the end of the result.
     a(0)b(0)(a1)b(1)

     mixString("abc", "xyz") → "axbycz"
     mixString("Hi", "There") → "HTihere"
     mixString("xxxx", "There") → "xTxhxexre"
*/

    public static String mixString(String a, String b) {
        String mixString = "";
        String xx = "";
        if (a.length() > b.length()) {
            xx = a.substring(b.length());
            for (int i = 0; i < b.length(); i++) {
                mixString = mixString + a.charAt(i) + b.charAt(i);
            }
        } else if (a.length() < b.length()) {
            xx = b.substring(a.length());
            for (int i = 0; i < a.length(); i++) {
                mixString = mixString + a.charAt(i) + b.charAt(i);
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                mixString = mixString + a.charAt(i) + b.charAt(i);
            }
        }
        return mixString + xx;
    }


}

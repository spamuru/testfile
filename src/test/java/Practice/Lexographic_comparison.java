package Practice;

public class Lexographic_comparison {

    public static int stringCompare(String str1,
                                    String str2)
    {
        for (int i = 0; i < str1.length() &&
                i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                continue;
            }
            else {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        // Edge case for strings like
        // String 1="Geeky" and String 2="Geekyguy"
        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        }
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }

    public static void main(String args[])
    {
        String string1 = new String("Geeks");
        String string2 = new String("Practice");

        System.out.println(stringCompare(string1, string2));
        //System.out.println(string1.charAt(0)-string2.charAt(1));

    }
}

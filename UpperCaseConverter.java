package STring_;

public class UpperCaseConverter {
    public static void main(String[] args) {
        String s = "PRA";
        String s1 = UpperCaseConverter.upper(s);
        System.out.println(s1);
    }

    private static String upper(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char)(charArray[i] - ('a' - 'A'));
            }
        }
        return new String(charArray);
    }
}

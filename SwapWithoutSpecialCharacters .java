package Array;

public class SwapWithoutSpecialCharacters {

    public static void main(String[] args) {
        String str = "fajsg%gsgjsgj@hysg*";

        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {

            while (left < right && !Character.isLetter(ch[left])) {
                left++;
            }

            while (left < right && !Character.isLetter(ch[right])) {
                right--;
            }

            if (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(ch));
    }
}

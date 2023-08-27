package String;

public class PalindromeString {
    public static void main(String[] args) {
        String s1 = "madam";
        boolean palindrome = true;
        for (int i = 0; i < s1.length() / 2; i++) {
            if (!s1.substring(i, i + 1).equals(s1.substring(s1.length() - i - 1, s1.length() - i))) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}

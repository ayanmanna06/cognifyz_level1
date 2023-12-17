package level1;
import java.util.Scanner;
class palindrome {
    String str;
    int num;
    boolean ispalindrome(String s) {
        str = s;
        String st = s.toLowerCase();
        int l = 0, h = st.length() - 1;
        while (l <= h) {
            if (!(st.charAt(l) >= 'a' && st.charAt(l) <= 'z'))
                l++;
            else if (!(st.charAt(h) >= 'a' && st.charAt(h) <= 'z'))
                h--;
            else if (st.charAt(l) == st.charAt(h)) {
                l++;
                h--;
            } else
                return false;
        }
        return true;
    }
    boolean ispalindrome(int n) {
        int number = num = n;
        // num=n;
        int rev = 0;
        while (number != 0) {
            int reminder = number % 10;
            rev = rev * 10 + reminder;
            number = number / 10;
        }
        if (n == rev) {
            return true;
        }
        return false;
    }
}
public class palindrome_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindrome p = new palindrome();
        System.out.println("Press 1 for Check Palindromic Word or palindromic Sentence.");
        System.out.println("Press 2 for Check Palindromic Number.");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter a Word to Check this is palindromic word or not :");
                String word = sc.nextLine();
                if (p.ispalindrome(word))
                    System.out.println(p.str + " is  Palindromic.");
                else
                    System.out.println(p.str + " is not Palindromic.");
                break;
            case 2:
                System.out.println("Enter a Number to Check this is palindromic Number or not :");
                int num = sc.nextInt();
                if (p.ispalindrome(num))
                    System.out.println(p.num + " is a Palindromic Number.");
                else
                    System.out.println(p.num + " is not a Palindromic Number.");
                break;
            default:
                System.out.println("You Choose an Invalid Option!");
        }
    }
}

import java.util.Scanner;

public class Palindrom {
    

    public static boolean isPalindrome(String text) {
        String cleanText = text.toLowerCase();
        
        int left = 0;
        
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter : ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input +  "is a palindrome");
        } else {
            System.out.println(input + " is NOT a palindrome");
        }
        sc.close();
    }
}

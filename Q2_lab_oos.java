import java.util.Scanner;

class Q2_lab_oos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String ip = sc.nextLine();
        String words[] = ip.split("\\s");
        String palindromeWords[] = new String[ip.length  ()]; // Change ip.length() to words.length
        int palindromeIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                palindromeWords[palindromeIndex] = words[i];
                palindromeIndex++;
            }
        }

        System.out.println("Total palindromic words: " + palindromeIndex);

        System.out.println("Palindromic words:");
        for (int i = 0; i < palindromeIndex; i++) {
            System.out.println(palindromeWords[i]);
        }
    }

    public static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

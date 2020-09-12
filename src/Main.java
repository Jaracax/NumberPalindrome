public class Main {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverseNumber = 0;
        while (number != 0){
            int digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            number /= 10;
        }
        return (originalNumber == reverseNumber);
    }
}

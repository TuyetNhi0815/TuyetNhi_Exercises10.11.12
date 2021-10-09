package Exercise;

import java.util.Scanner;

public class Unit12_Operators_String_Maths_Booleans {
    public static void main(String[] args) {
        String str = "Hello word Hello word Hello word";
        //System.out.println(findWord(str)); //3.6
        //convertTime(); //6.9
        //capitalize(str); //6.10
        //System.out.println(lowercase(str)); //6.11
        //System.out.println(sumNumber(1, 100)); // 6.12.1 sum of the first 100 numbers
        //System.out.println(sumPrime(100)); // 6.12.2 sum of the first 100 Prime numbers
        //printPrime(0, 100); // Bonus print Prime after remove even number

    }
    //3.6 find a work in string
    public static boolean findWord(String str) {
        String key = inputString();
        int a = str.indexOf(key);
        if (a != -1) {
            return true;
        }
        return false;
    }
    // Get string from the user
    public static String inputString() {
        System.out.println("Please enter word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        return str;
    }
    // Get Int number from the user
    public static int inputInt(){
        int num;
        Scanner input = null;
        System.out.println("Please enter number: ");
        try {
            input = new Scanner(System.in);
            num = input.nextInt();
        } catch (Exception ex){
            System.err.println(ex.toString());
            return 0;
        }
        return num;
    }
    //6.9 convert seconds to hour, minute and seconds
    public static void convertTime() {
        int time = inputInt();
        int hour = time / 3600;
        int min = (time % 3600) / 60;
        int second = (time % 3600) % 60;
        System.out.println(hour + ":" + min + ":" + second);
    }
    //6.10 capitalize the first letter of each word
    public static String toTitleCase(String word){
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
    public static void capitalize(String str) {
        String[] splitStr = str.split(" ");
        String newStr = "";
        for(String word: splitStr){
            newStr += toTitleCase(word) + " ";
        }
        System.out.println(newStr.trim());
    }
    //6.11 convert a given string into lowercase
    public static String lowercase(String str) {
        return str.toLowerCase();
    }
    //6.12.1 sum of the first 100 numbers
    public static int sumNumber(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum = sum + i;
        }
        return sum;
    }
    //6.12.2 sum of the first 100 Prime numbers
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumPrime(int number) {
        int sum = 0;
        int count = 0;
        for (int i = 0;;i++) {
            if (check(i)) {
                sum = sum + i;
                count++;
                if (count == number) {
                    break;
                }
            }
        }
        return sum;
    }
    //Bonus print number Prime from num01 to num02
    public static void printPrime(int num01, int num02) {
        for (int i = num01; i <= num02; i++) {
            if (i == 2) {
                System.out.print(i + " ");
            }
            if (i % 2 != 0 ) { //remove even numbers
                if (check(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}

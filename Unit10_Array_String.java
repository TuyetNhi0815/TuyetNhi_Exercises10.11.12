package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Unit10_Array_String {
    public static void main(String[] args){
        int[] arr01 = {10, -20, 0, 30, 40, 60, 10}; //data01
        int[] arr02 = {50, -20, 0, 30, 40, 60, 10}; //data02
        int[] arr03 = {50, -20, 0, 30, 40, 60, 12}; //data03
        int[] arr04 = {45, 20, 10, 20, 30, 50, 11}; //data03
        int[] arr05 = {50, 20, 10, 20, 0, 30, 30, 50, 12}; //data03 test->return true
        int[] arr06 = {50, -20, 0}; //data04
        int[] arr07 = {5, -50, 10}; //data04
        int[] arr08 = {5, 7}; //data05
        int[] arr09 = {20, 30, 40}; //data06.07.08
        int[] arr10 = {20, 30, 40, 50, 67}; //data09
        int[] arr11 = {2, 3, 4, 0, 7, 10, 15, 9, 11};
        int[] arr12 = {1, 2, 3, 4}; //data12
        int[] arr13 = {2, 5, 7, 8}; //data12
        int[] arr14 = {2, 5, 7, 8, 2, 5, 7}; //data14
        int[] arr16 = {1, 2, 3, 4, 5}; //data16
        //System.out.println(check10Appears(arr01)); //01
        //System.out.println(checkFirstSameLast(arr02)); //02
        //System.out.println(checkFirstLast2Arr(arr03, arr04)); //03
        //System.out.println(checkFirstLast2Arr(arr03, arr05)); //03
        //createNewArr(arr06, arr07); //04
        //System.out.println(checkArrayContains(arr08)); //05
        //rotateArray(arr09); //06
        //System.out.println("Larger value between first and last element: " + getLarger(arr09)); //07
        //swapArray(arr09); //08
        //System.out.println("Largest element between first, last, and middle values: " + theLargest(arr10)); //09
        //environment(); //10
        //countEvenOdd(arr11); //11
        //createSortedArray(arr12, arr13); //12
        //System.out.println(square(25)); //13
        //System.out.println(getSingleNum(arr14) + " appears only once"); //14
        String[] str1 = {"cat", "dog", "red", "is", "am"}; //data15
        String[] str2 = {"flag", "green", "country", "w3resource", "cat"}; //data15
        //System.out.println(longest(str2)); //15
        //remove(arr16, 2); //16
        //outputDay(); //17 must enter number
        //outputMonth(); //18 must enter number
        //checkLeapYear(); //19 must enter number
        String str = "     Dearline never die! "; //data20
        //System.out.println(trim(str)); //20

    }
    //01. check 10 appears as first or last element of an int array
    public static boolean check10Appears(int[] array) {
        if (array.length >= 2 ) {
            if (array[0] == 10 | array[array.length - 1] == 10) {
                return true;
            }
        } else {
            System.out.println("The length of the array must be greater than or equal to 2");
        }
        return false;
    }
    //02. check first and last element of an int array are the same
    public static boolean checkFirstSameLast(int[] array) {
        if (array.length >= 2 ) {
            if (array[0] == array[array.length - 1]) {
                return true;
            }
        } else {
            System.out.println("The length of the array must be greater than or equal to 2");
        }
        return false;
    }
    //03. check first and last element of 2 int arrays are the same
    public static boolean checkFirstLast2Arr(int[] array01, int[] array02) {
        if (array01.length >= 2 && array02.length >= 2) {
            if (array01[0] == array02[0] && array01[array01.length - 1] == array02[array02.length - 1]) {
                return true;
            }
        } else {
            System.out.println("The length of the arrays must be greater than or equal to 2");
        }
        return false;
    }
    //04. create new array by the first of arr01 and last of arr02
    public static void createNewArr(int[] array01, int[] array02) {
        int[] arr = {array01[0], array02[2]};
        System.out.println("Array01: " + Arrays.toString(array01));
        System.out.println("Array02: " + Arrays.toString(array02));
        System.out.println("New Array: " + Arrays.toString(arr));
    }
    //05. check array contains a 4 or a 7 or Not
    public static boolean checkArrayContains(int[] array) {
        if (array[0] == 4 | array[1] == 4) {
            return true;
        }
        if (array[0] == 7 | array[1] == 7) {
            return true;
        }
        return false;
    }
    //06. rotate an int array (length 3) in the left direction
    public static void rotateArray(int[] array) {
        int[] arr = {array[1], array[2], array[0]};
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
    //07. get larger between first and last element of an int array (length 3)
    public static int getLarger(int[] array) {
        return Math.max(array[0], array[2]);
    }
    //08. swap the first and last
    public static void swapArray(int[] array) {
        int[] arr = {array[2], array[1], array[0]};
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(arr));
    }
    //09. get the largest element between first, last, and middle
    public static int theLargest(int[] array) {
        int a = array.length;
        int max = Math.max(Math.max(array[0], array[a - 1]), array[a / 2]);
        return max;
    }
    //10. get the value of the environment variable PATH, TEMP, USERNAME
    public static void environment() {
        System.out.println("Environment variable PATH: ");
        System.out.println(System.getenv("PATH"));
        System.out.println("\nEnvironment variable TEMP: " + System.getenv("TEMP"));
        System.out.println("\nEnvironment variable USERNAME: " + System.getenv("USERNAME"));
    }
    //11. count number of even and odd in an int array
    public static void countEvenOdd(int[] array) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("The number of even: " + countEven);
        System.out.println("The number of odd: " + countOdd);
    }
    //12. merge two int arrays and create a new sorted array.
    public static void createSortedArray(int[] array01, int[] array02) {
        int[] merged = new int[array01.length + array02.length];
        int pos = 0;
        for (int element : array01) {
            merged[pos] = element;
            pos++;
        }
        for (int element : array02) {
            merged[pos] = element;
            pos++;
        }
        int[] sorted = merged.clone();
        Arrays.sort(sorted);
        System.out.println("\nMerged array: "+Arrays.toString(sorted));

    }
    //13. compute the square root of a given integer
    public static double square(int number) {
        double square = Math.sqrt(number);
        return square;
    }
    //14. find a number that appears only once
    public static int getSingleNum(int[] array) {
        int single = 0;
        for (int i = 0; i < array.length; i++) {
            single ^= array[i];
        }
        return single;
    }
    //15. find all of the longest words
    public static ArrayList<String> longest(String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest = 0;
        for (String str : dictionary) {
            int lengest = str.length();
            if (lengest > longest) {
                longest = lengest;
                list.clear();
            }
            if (lengest == longest) {
                list.add(str);
            }
        }
        return list;
    }
    //16. remove the nth element from the end of a given list
    public static void remove(int[] array, int number) {
        int index = array.length - number;
        int [] clone = new int[array.length - 1];
        System.arraycopy(array, 0, clone, 0, index);
        System.arraycopy(array, index + 1, clone, index, array.length - index - 1);
        System.out.println(Arrays.toString(clone));
    }
    //Get Int number from the user
    public static int inputInt() {
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
    //17. enter number -> day
    public static void outputDay() {
        int number = inputInt();
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number > 0 && number <= 7) {
            System.out.println(day[number - 1]);
        } else {
            System.out.println("Please enter a number from 1 to 7");
        }
    }
    //18. enter number -> month
    public static void outputMonth() {
        int number = inputInt();
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (number > 0 && number <= 12) {
            System.out.println(month[number - 1]);
        } else {
            System.out.println("Please enter a number from 1 to 12");
        }
    }
    //19. return leap year or not
    public static void checkLeapYear() {
        int year = inputInt();
        if (year >= 0) {
            if (year % 4 == 0) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not leap year");
            }
        } else {
            System.out.println("Please enter a positive number!");
        }
    }
    //20. trim string
    public static String trim(String str) {
        String trim = str.trim();
        return trim;
    }

}

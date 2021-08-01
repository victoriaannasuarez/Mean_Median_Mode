import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyMath {

    public static void main(String[] args) {
        int [] numbers = {1,2, 55, 10, 6, 7};

        System.out.println("median " + findMedian(numbers));
        System.out.println(findMode(numbers));

        System.out.println(searchArray(111, numbers));

    }

    //mode  - A Mode is defined as the value that appears most frequently in a data set. ..

    public static int findMode(int [] number) {
        int frequency = 1; //number of times a number appears while looping through
        int highestFrequency = 0; //stores the number that IS the highest Frequency
        int numberWithHighestFrequency = 0;
       ArrayList<Integer> examinedNumbers = new ArrayList<>();//numbers we already assessed from the array

        for (int i = 0; i < number.length; i++) {
            if (!alreadyAssessed(examinedNumbers, number[i])) {
                examinedNumbers.add(number[i]);
                frequency = 0;
                for (int j = i + 1; j < number.length; j++) {
                    if (number[i] == number[j]) {
                        frequency++;

                    }
                }
            }
            if(frequency>highestFrequency)
            {
                highestFrequency = frequency;
                numberWithHighestFrequency = number[i];
            }


        }
        System.out.println(highestFrequency);
        return numberWithHighestFrequency;

    }


    //dont loop through/assess int already found earlier
    public static boolean alreadyAssessed(ArrayList<Integer> numbers, int target)
    {
        for(int n: numbers){
            if(n== target)
            {return true;}
        }
        return false;

    }

    //mean
    public static int getMean(int [] numbers)
    {
        int sum = 0;
        for(int n: numbers){

            sum += n;
        }
        return sum/numbers.length;
    }



    //median  -  the middle number , or if the number of numbers is even, average of the 2 middle numbers
    //need to sort array
    public static double findMedian(int [] numbers)
    {
        Arrays.sort(numbers);
        if(numbers.length % 2 == 0){
            //123456

            int leftMiddleNumber = (numbers.length-1)/2;
            int rightMiddleNumber = (numbers.length)/2;

            return (numbers[leftMiddleNumber] + numbers[rightMiddleNumber]) /2.0;

        }
        return numbers[numbers.length/2];

    }


    //search number
    //take user input of array integers, find it in the array
    public static boolean searchArray(int target, int[] numbers) {
        for(int n : numbers) {

            if (n == target) {
                return true;
            }

        }
        return false;

    }


}

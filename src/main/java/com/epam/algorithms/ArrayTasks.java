package com.epam.algorithms;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {

        String[] seasonsArray = new String[] {"winter", "spring", "summer", "autumn"};

        return seasonsArray;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {

        int[] arrayOfNumbers = new int[length];
        int index = 0;

        while (index < length) {
            arrayOfNumbers[index] = index + 1;
            index++;
        }
        return arrayOfNumbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {


        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }

        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String temp;
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int arrayLength = 0;
        int index = 0;
        int[] positiveArray;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                arrayLength++;
            }
        }

        positiveArray = new int[arrayLength];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                positiveArray[index] = arr[i];
                index++;
            }
        }

        return positiveArray;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        int[][] sortedArray = new int[arr.length][];
        int[][] tempArray = new int[1][];
        boolean flag = false;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = new int[arr[i].length];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sortedArray[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < sortedArray.length; i++) {

            for (int j = 0; j < sortedArray[i].length - 1; j++) {
                flag = false;
                for (int k = 0; k < sortedArray[i].length - 1 - j; k++) {
                    if(sortedArray[i][k] > sortedArray[i][k + 1]){
                        temp = sortedArray[i][k];
                        sortedArray[i][k] = sortedArray[i][k + 1];
                        sortedArray[i][k + 1] = temp;
                    }
                }
                if(flag == false) {
                    break;
                }
            }
        }


        for (int i = 0; i < sortedArray.length - 1; i++) {
            flag = false;
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if(sortedArray[j].length > sortedArray[j + 1].length){
                    tempArray[0] = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tempArray[0];
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }


        return sortedArray;


    }

}

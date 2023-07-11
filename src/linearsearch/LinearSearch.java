package linearsearch;

import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return linearSearch(arr, target, index+1);
    }

    static int stringSearch(String str, char target, int index){
        if (str.length() == index){
            return -1;
        }
        if (str.charAt(index) == target){
            return index;
        }
        return stringSearch(str, target, index+1);
    }

    static int minimumNumber(int[] arr, int index, int minElement){
        if (arr.length == index){
            return minElement;
        }
        if (arr[index] < minElement){
            minElement = arr[index];
        }
        return minimumNumber(arr, index+1, minElement);
    }

    static int[] search2dArray(int[][] arr, int col, int row, int target){
        if (row == 4){
            return new int[] {-1, -1};
        }
        if (col < arr.length) {
            if (arr[row][col] == target) {
                System.out.println(row + " " + col);
                return new int[] {row, col};
            }
            return search2dArray(arr, col+1, row, target);
        }
        return search2dArray(arr, 0, row+1, target);
    }

    static int maxNumber2DArray(int[][] arr, int col, int row, int max){
        if (arr.length == row){
            return max;
        }
        if (col < arr.length){
            if (arr[row][col] > max){
                max = arr[row][col];
            }
            return maxNumber2DArray(arr, col+1, row, max);
        }else {
            return maxNumber2DArray(arr, 0, row+1, max);
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 22, 2, 10};
        String str = "vinay";
        System.out.println(linearSearch(arr, 22, 0));
        System.out.println(stringSearch(str, 'i', 0));
        System.out.println("min element = " + minimumNumber(arr, 0, arr[0]));

        int[][] arr2d = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 20, 11, 12},
                {13, 14, 15, 16},
        };

        System.out.println("2D search = " + Arrays.toString(search2dArray(arr2d, 0, 0, 15)));
        System.out.println("max in 2D array = " + maxNumber2DArray(arr2d, 0, 0, arr2d[0][0]));
    }
}

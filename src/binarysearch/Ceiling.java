package binarysearch;

public class Ceiling {
    static int ceiling(int[] arr, int start, int end, int target){
        if (target > arr[arr.length-1]){
            return -1;
        }

        if (start >= end){
            return start;
        }


        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            System.out.println("mid " + mid);
            return mid;
        }
        if (target > arr[mid]){
            return ceiling(arr, mid+1, end, target);
        }else {
            return ceiling(arr, 0, mid-1, target);
        }
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int result = ceiling(arr, 0, arr.length-1, 1);
        System.out.println(result);
    }
}

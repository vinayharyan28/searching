package binarysearch;

public class BinarySearch {
    public static int binarySearchRecursion(int[] arr, int start, int end, int target){
        if (start > end){
            return -1;
        }
        int middle = (start+end)/2;
        if (arr[middle] == target){
            return middle;
        }
        if (target > arr[middle]){
            return binarySearchRecursion(arr, middle+1, end, target);
        }else{
            return binarySearchRecursion(arr, start, middle-1, target);
        }
    }

    public static int binarySearchLoop(int[] arr, int target){
        int start = 0, end = arr.length;
        while (start <= end){
            int middle = (start+end) / 2;
            if (arr[middle] == target){
                return middle;
            }else if(target > arr[middle]){
                start = middle + 1;
            }else{
                end = middle-1;
            }
        }
        return -1;
    }

    public static int ascendingDescendingSearch(int[] arr, int target){
        int start = 0, end = arr.length;
        boolean check = arr[start] < arr[end-1];
        if (check){
            while (start <= end){
                int middle = start + (end-start) / 2;
                if (arr[middle] == target){
                    return middle;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }else {
                    end = middle-1;
                }
            }
        }else{
            while (start <= end){
                int middle = start + (end-start) / 2;
                if (arr[middle] == target){
                    return middle;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }else {
                    end = middle-1;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 23, 34};
        int[] arr1 = {34, 23, 3, 2, 1};
        System.out.println("Recursion = " + binarySearchRecursion(arr, 0, arr.length, 23));
        System.out.println("Loop = " + binarySearchLoop(arr, 34));
        System.out.println("ascendingDescending1 = " + ascendingDescendingSearch(arr, 23));
        System.out.println("ascendingDescending2 = " + ascendingDescendingSearch(arr1, 23));
    }
}

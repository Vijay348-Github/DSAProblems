package com.DSAProblems;

import java.util.Arrays;

public class BinarySearchInSorted2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));

    }
    static int[] binarySearch(int[][] arr,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if (arr[row][mid] == target){
                return new int[]{row,mid};
            }
            if (target<arr[row][mid]){
                cEnd = mid-1;
            }
            else {
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if (cols == 0){
            return new int[]{-1,-1};
        }
        if (rows == 1){
            return binarySearch(arr,0,0,cols-1,target);
        }
        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;

        while (rstart < rend-1){
            int mid = rstart + (rend-rstart)/2;
            if (arr[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            if (target<arr[mid][cmid]){
                rend = mid;
            }
            else {
                rstart = mid;
            }
        }
        if (arr[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if (arr[rstart+1][cmid] == target){
            return new int[]{rstart+1,cmid};
        }
        if (target <= arr[rstart][cmid-1]){
            return binarySearch(arr,rstart,0,cmid-1,target);
        }
        if (target >= arr[rstart][cmid+1] && target <= arr[rstart][cols-1]){
            return binarySearch(arr,rstart,cmid+1,cols-1,target);
        }
        if (target <= arr[rstart+1][cmid-1]){
            return binarySearch(arr,rstart+1,0,cmid-1,target);
        }
        else {
            return binarySearch(arr,rstart+1,cmid+1,cols-1,target);
        }
    }
}

import java.util.*;
import java.io.*;

class FindTrippletWithZeroSum{
    
void findTriplets(int arr[], int n)
{
    boolean found = false;
    Arrays.sort(arr);
    int left, right;
    
    for(int i = 0; i <= n-2; i++ )
    {
        left = i+1;
        right = n-1;
        while(left < right){
            if(arr[i] + arr[left] + arr[right] == 0)
            {
                System.out.println(arr[i] +"...." + arr[left] + "...." + arr[right]);
                found = true;
                right = right - 1;
            }
            else if(arr[i] + arr[left] + arr[right] < 0) {
                left++;
            }
            else{
                right--;
            }
        }
    }
    
    if(!found){
        System.out.println("No Tripplet Found");
    }
    
}    
    public static void main(String[] args){
        FindTrippletWithZeroSum s = new FindTrippletWithZeroSum();
        int[] arr = {0, -1, 2, -3, 1};
        s.findTriplets(arr, arr.length);
    }
    
    
}


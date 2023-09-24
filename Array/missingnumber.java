// Problem:https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
// Solution:Given Below

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum=(n*(n+1))/2;
        for(int i=0;i<array.length;i++){
            sum=sum-array[i];
            }
            return sum;
    }
}

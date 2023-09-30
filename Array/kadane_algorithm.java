// Problem:https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&sortBy=submissions
// Solution: Given Below
long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long currentSum=0;
        long maxSum=arr[0];
        for(int i=0;i<n;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}

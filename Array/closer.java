// Problem:https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1
// Solution: Given Below;


class Solution {
    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int l = arr.length - 1;
        int a = 0;
        int z = 0, u = 0;
        int min = Integer.MAX_VALUE;
        while (l >= 0 && a < brr.length) {
            int s = arr[l] + brr[a];
            int diff = Math.abs(x - s);
            if (diff < min) {
                z = l;
                u = a;
                min = diff;
            }
            if (s == x) {
                result.add(arr[l]);
                result.add(brr[a]);
                return result;
            } else if (s < x) {
                a++;
            } else {
                l--;
            }
        }
        result.add(arr[z]);
        result.add(brr[u]);
        return result;
    }
}

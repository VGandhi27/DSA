// Problem:https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
// Solution:

class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> olist = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
            {
                olist.add(i);
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i] == x)
            {
                olist.add(i);
                break;
            }
        }
        
        if(olist.size() != 2)
        {
            olist.add(-1);
            olist.add(-1);
        }
        
        return olist;
    }
    
}

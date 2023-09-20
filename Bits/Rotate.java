// Problem : https://practice.geeksforgeeks.org/problems/rotate-bits4524/1
// Solution

ArrayList<Integer> rotate(int N,int D){
            ArrayList<Integer> list =new ArrayList<>();
             int m = D%16;
        int left = (N<<m| N>>(16-m)) & 65535; 
        int right = (N>>m| N<<(16-m)) & 65535;
        
        list.add(left);
        list.add(right);
        return list;
        }

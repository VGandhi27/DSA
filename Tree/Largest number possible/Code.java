class Solution{
    static String findLargest(int N, int S){
        // code here
       StringBuilder s = new StringBuilder();
        if(S == 0 && N > 1){
            return "-1";
        }
        for(int i = 0;i<N;i++){
            if(S >= 9){
                s.append('9');
                S -= 9;
            }else{
                s.append((char)(S+48));
                S = 0;
            }
        }
        if(S > 0){
                return "-1";
        }
        return s.toString();
    }
}

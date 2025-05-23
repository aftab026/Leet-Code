class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder res = new StringBuilder();

        Arrays.sort(strs);
        // get first and last char[]
        char first[] = strs[0].toCharArray(); // first = "flower"
        char last[] = strs[strs.length-1].toCharArray(); // last = "flight";

        // compare first and last
        for(int i=0; i<first.length; i++){
            if(first[i]!=last[i]){
                //i=0->f=f
                break;
            } else{
                res.append(first[i]); // res= f
            }
        }
        return res.toString(); //"fl"
    }
}
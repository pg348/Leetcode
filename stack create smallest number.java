class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0)
            {
                // System.out.println(st.pop());
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
        if(st.size()==0)
            return "0";

        StringBuilder re= new StringBuilder();
        while(!st.isEmpty()){
            re=re.append(st.pop());
        }
        re.reverse();
       while(re.length()>1 && re.charAt(0)=='0')
            re.deleteCharAt(0);
        return re.toString();
    
        
}}




class Solution {
    public int largestRectangleArea(int[] arr) {

        // BRUTE-FORCE APPROACH
        // int n=a.length;

        // int area=0;
        // for(int i=0;i<n;i++){
        //     int left=i-1  ;
        //     int right=i+1;
        //     while(left>=0 && a[left]>=a[i]){
        //         left--;
        //     }

        //     while(right<n && a[right]>=a[i]){
        //         right++;
        //     }

        //     area=Math.max((right-left-1)*a[i],area)
           
        // }

        int max =0;
        int nsr [] = new int[arr.length];
        int nsl [] = new int[arr.length];

        //next smaller element to right
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i]= arr.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        //next smaller element to left
        stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                
                nsl[i]= -1;
            }else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        // current area
        for(int i=0;i<arr.length;i++){
            int area = arr[i] * (nsr[i] - nsl[i] - 1);
            max = Math.max(area,max);
        }
        return max;

        

        
    }
}

//308/313 timelimit exceed!!!!!!!!!!!!!!!!!!!!!! need better approach


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> arr = new  ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hs = new HashSet<Integer>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(hs.contains(third)){
                    ArrayList<Integer> arr2=new ArrayList<Integer>();
                    arr2.add(nums[i]);
                    arr2.add(nums[j]);
                    arr2.add(third);
                    Collections.sort(arr2);
                    if(arr.contains(arr2)){
                        continue;
                    }
                    else{
                        arr.add(arr2);
                    }
                }
                hs.add(nums[j]);
               
            }
        }
        

   
        return arr;

    }
}
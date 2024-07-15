class Solution {
    public void moveZeroes(int[] nums) {
        int start =0;
        int zeros =0;


           for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                nums[start]=nums[i];
                start++;

            }else{
                zeros++;
            }
           }
           int n = nums.length;

           while(zeros>0){
            nums[n-1] = 0;
            n--;
            zeros--;

           }
        
    }
}
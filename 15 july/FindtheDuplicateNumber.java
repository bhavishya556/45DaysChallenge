class Solution {
    public int findDuplicate(int[] nums) {
        int slow =0;
        int fast =0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);

        //reset one of them to start point
        slow=0;
        while(slow != fast){
         
            slow = nums[slow];
            fast = nums[fast];
        
        }

        return fast;


        
    }
}
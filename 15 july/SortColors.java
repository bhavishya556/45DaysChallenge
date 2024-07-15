class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int one = 0;
        int two = 0;

        for(int i = 0; i< nums.length; i++){
            int val = nums[i];
            if(val == 0){

                zeros++;
            }else if(val == 1){
                one++;
            }else{
                two++;
            }
        }
           for(int i = 0; i< nums.length; i++){

             
            if(zeros > 0){
                nums[i] = 0;
                zeros--;

               
            }else if(zeros == 0 && one > 0){
              nums[i] = 1;
              one--;
            }else{
                nums[i] = 2;
            }

           }

      
         
    }
}
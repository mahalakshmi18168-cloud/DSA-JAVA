public class RemoveDuplicates_26 {
    static int removeDuplicates(int[] nums){
        int rd = 0;
         for(int i=0;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd++;
                nums[rd]=nums[i];
            }
         }
         return rd+1;
    }
    public static void main(String[] args){
        int nums[]={1,1,2,2,3,3,3,4,5,5,6,6,6,6,7};
         for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
         }
        int rd=removeDuplicates(nums);
        System.out.println();

        for(int i=0;i<rd;i++){
            System.out.print(nums[i]+ " ");
         }
        
}
}
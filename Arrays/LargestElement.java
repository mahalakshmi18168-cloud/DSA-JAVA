public class LargestElement {
    public static void main(String[] args){
        int nums[]={3,3,6,1,45,67,89,87,44,99,101};
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            
        }
        System.out.println("largest numbers is:"+max);
    }
    
}

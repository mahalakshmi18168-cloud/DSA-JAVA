public class One {
    public static void main(String[] args){
        int nums[]={0,14,0,5,2};
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int k=0; k<nums.length; k++){
            System.out.println(nums[k]);
        }
    }
    
}

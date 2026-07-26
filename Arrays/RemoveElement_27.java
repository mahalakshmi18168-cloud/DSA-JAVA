public class RemoveElement_27 {
    public static void main(String[] args){
    int nums[]={1,3,2,2,5,2};
    int val=2;
    int k=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[k]=nums[i];
            k++;
            System.out.print(nums[i]+ " ");

        }
    }
    }
    
}

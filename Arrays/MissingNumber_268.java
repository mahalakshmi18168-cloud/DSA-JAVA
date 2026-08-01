class MissingNumber_268{
    public int MissingNumber(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int actualSum=(nums.length*(nums.length+1))/2;
        int missing_number=actualSum-sum;
        return missing_number;
    }
    public static void main(String[] args){
        int nums[]={9,6,4,2,3,5,7,0,1};
        MissingNumber_268 obj=new MissingNumber_268();
        int missing_number=obj.MissingNumber(nums);
        System.out.println(missing_number);
    }
}
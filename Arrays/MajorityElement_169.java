public class MajorityElement_169 {
    public static int majorityElement(int[] nums){
        int count=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }else{
                count--;
            }

        }
        return candidate;
    }
    public static void main (String[] args){
        int nums[]={3,2,3,2,3,2,2,2,2,3};
        MajorityElement_169 obj=new MajorityElement_169();
        System.out.println(obj.majorityElement(nums));
    }
}

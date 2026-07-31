import java.util.Scanner;
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int size=nums.length;
        if(size==0 || size==1){
            return;
        }
        int nz=0,z=0;
        while(nz<size){
            if(nums[nz]!=0){
                int temp=nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            }else{
                nz++;
            }
        }
        
    }
    public static void main(String[] args) {

    int[] nums = {1, 2, 0, 4, 0, 4};

    MoveZeroes obj = new MoveZeroes();

    obj.moveZeroes(nums);

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }
}
}
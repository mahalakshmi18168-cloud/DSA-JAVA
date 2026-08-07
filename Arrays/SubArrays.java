class SubarraySum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            

            for(int j = i; j < arr.length; j++) {

                sum = sum + arr[i];

                System.out.println("Sum = " + sum);
            }
        }
    }
}
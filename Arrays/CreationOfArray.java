package Arrays;

public class CreationOfArray {
    public static void main(String[] args) {
        
        // int nums[] = {3,7,2,4};  // creation
        int nums[] = new int[4];  // cretion without values
        // nums[1] = 6;              //  updation
        nums[0] =4;
        nums[1] =8;
        nums[2] =3;
        nums[3] =9;

        // printing values one by one
        System.out.println(nums[0]); // printing
        System.out.println(nums[1]); // printing
        System.out.println(nums[2]); // printing
        System.out.println(nums[3]); // printing

        // printing values in one go by using loop

        for(int i=0;i<4;i++) {
            System.out.println(nums[i]);
        }
    }
    
}

package Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // for(int i=0;i<nums.length;i++) {   
        //     System.err.println(nums[i]);
        // }

        // for each loop / enhanced for loop

        for(int n : nums) {
            System.out.println(n);
        }
    }
    
}

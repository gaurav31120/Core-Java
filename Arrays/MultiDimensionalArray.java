package Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int nums[][] = new int[3][4]; // 3 rows 4 cols

        // int random = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.println(m + " ");
            }
        }
        System.out.println();

    }
}

public class Lab1 {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
    public static double average(int[] nums) {
        double total = 0;
        for (int num : nums) {
            total += num;
        }
        return total / nums.length;
    }
    public static int max(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
    public static int min(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

        int i = 0;
        System.out.print("Array in order: ");
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("Array in reverse: ");
        for (int j = nums.length - 1; j >= 0; j--) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        System.out.println("First value: " + nums[0]);
        System.out.println("Last value: " + nums[nums.length - 1]);

        System.out.println("Max of 5 and 9: " + max(5, 9));
        System.out.println("Min of 5 and 9: " + min(5, 9));
        System.out.println("Sum of array: " + sum(nums));
        System.out.println("Average of array: " + average(nums));
        System.out.println("Max in array: " + max(nums));
        System.out.println("Min in array: " + min(nums));
    }
}

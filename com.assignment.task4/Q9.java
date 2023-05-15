public class Q9 {
    public static void main(String[] args) {
        int nums[] = { 1, 4, 10, -3 };
        int target = 20;
        boolean flag = false;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < nums.length; ++j) {
                if (i != j) {

                    if (nums[i] + nums[j] == target) {
                        flag = true;
                        System.out.println("[" + i + "," + j + "]");
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("No indices match up to target");
        }
    }

}

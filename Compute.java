

public class Compute {
    public static void main(String[] args) { 
        int[] nums = { 1, 3, 5, 7 }; 
        for (int i = 1; i < nums.length; i++) 
        if (nums[i - 1] < nums[i]) { 
        int t = nums[i]; 
        nums[i] = nums[i - 1]; 
        nums[i - 1] = t; 
        } 
        for (int i = 0; i < nums.length; i++) { 
        System.out.print(nums[i] + " "); 
        } 
        System.out.println(); 
        } 
}

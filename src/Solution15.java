import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int target;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                target = -nums[i] - nums[j];
                if (contain(nums, j + 1, nums.length - 1, target)){
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], target)));
                }
            }
        }
        return result;
    }

    public boolean contain(int[] nums, int start, int end, int target){
        if (start == nums.length)
            return false;
        if (nums[start] > target)
            return false;
        if (nums[end - 1] < target)
            return false;
        int mid = start + end;
        mid >>= 1;
        if (nums[mid] == target)
            return true;
        if (nums[mid] < target)
            return contain(nums, mid + 1, end, target);
        else
            return contain(nums, start, mid, target);
    }
}

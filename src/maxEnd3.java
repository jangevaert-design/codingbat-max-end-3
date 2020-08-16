public class maxEnd3 {
  public int[] maxEnd3(int[] nums) {

    if (nums[0] > nums[2]) {
      int[] large0 = {nums[0], nums[0], nums[0]};
      return large0;
    } else {
      int[] large2 = {nums[2], nums[2], nums[2]};
      return large2;
    }
  }
}

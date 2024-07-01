class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // 예외 처리를 제거하였으므로 이 메소드가 항상 결과를 반환하도록 해야 합니다.
        return null; // 주어진 제약 조건에 따르면 이 부분은 실행되지 않습니다.
    }
}

package com.qiyi.leetcode.twosum;
//����һ���������� nums ��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ target ���� ���� ���������������ǵ������±ꡣ
//
// ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�
//
// ����԰�����˳�򷵻ش𰸡�
// ʾ�� 1��
//���룺nums = [2,7,11,15], target = 9
//�����[0,1]
//���ͣ���Ϊ nums[0] + nums[1] == 9 ������ [0, 1] ��
// ʾ�� 2��
//���룺nums = [3,2,4], target = 6
//�����[1,2]
// ʾ�� 3��
//���룺nums = [3,3], target = 6
//�����[0,1]
// ��ʾ��
// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// ֻ�����һ����Ч��
// ���ף���������һ��ʱ�临�Ӷ�С�� O(n2) ���㷨��
// Related Topics ���� ��ϣ��
// ? 11162 ? 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 1};
        if(nums.length==2){
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            if((nums[i]+nums[j])==target)
            {
               result.add(i);
               result.add(j);
                break;
            }
        }
        }
        int[] total = new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            total[i]=result.get(i);
        }
        return total;
    }
}

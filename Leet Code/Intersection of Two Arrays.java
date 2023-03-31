class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>(); 
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
            nums.add(nums2[i]);
        for(int i = 0;i<nums1.length; i++){
            for(int j=0;j<nums.size();j++){
                if(nums1[i] == nums.get(j)){
                    result.add(nums1[i]);
                    nums.remove(j);
                    break;
                }
            }
        }
        int[] arr = new int[result.size()];
        for(int i=0;i<result.size();i++)
            arr[i]=result.get(i);
        return arr;
    }
}
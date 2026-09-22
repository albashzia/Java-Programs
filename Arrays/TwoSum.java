package Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{j,i};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]){

        TwoSum solver = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int answer[] = solver.twoSum(nums,target);

        for(int i : answer){
            System.out.println(i);
        }
    }
}
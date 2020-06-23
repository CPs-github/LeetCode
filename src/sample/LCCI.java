package sample;

public class LCCI {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(new LCCI().massage(nums));
    }
    public int massage(int[] nums) {
        int [] memory = new int[nums.length +1];
        System.out.println(nums.length);
        return dfs(nums,0,memory);

    }
    public int dfs(int[] nums , int index, int[] memory){

        // 递归终止条件: 超过排队人数时，收益为 0
        if(index >= nums.length){

            return 0;
        }
        if(memory[index] != 0){
            System.out.println("memory:"+index);
            return memory[index];
        }
        int ret = -1;
        System.out.println(index +"......"+nums.length);
        for(int i = index ; i < nums.length ; i++){
            ret = Math.max(ret , nums[i]+dfs(nums,i+2,memory));
        }
        System.out.println(ret+"xxx");
        memory[index] = ret;

        return ret;
    }
}

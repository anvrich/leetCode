public class Solution169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        int majorityElement = findMajorityElement(nums);

        if (majorityElement != -1) {
            System.out.println("Элемент большинства: " + majorityElement);
        } else {
            System.out.println("Элемент большинства отсутствует");
        }
    }

    private static int findMajorityElement(int[] nums) {
        int count = 1;
        int cur = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == cur) {
                count++;
            }else count--;

            if (count==0){
                cur = nums[i];
            }
        }

        count = 0;
        for (int num : nums){
            if (num == cur){
                count++;
            }
        }
        return cur;
        //2 2 1 1 1 2 2
        //2=2->count=2 cur=2
        //1=2->count=1 cur=2
        //1=2->count=0 cur=1
        //1=1->count=1 cur=1
        //2=1->count=0 cur=2
        //2=2->count=1 cur=2

        //2 2 1 1 1 2 2
        //count=0 cur=2
        //2==2->count=1
        //2==2->count=2
        //1==2->count=2
        //1==2->count=2
        //1==2->count=2
        //2==2->count=3
        //2==2->count=4

    }
}

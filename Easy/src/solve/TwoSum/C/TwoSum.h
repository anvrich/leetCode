int* twoSum(int* nums, int len, int target) {
    int* result = malloc(2 * sizeof(int));

    for (int i = 0; i < len; ++i) {
        for (int j = i+1; j < len; ++j) {
            if(nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }
    return NULL;
}


int removeElement(int nums[], int numsSize, int val) {
    int i, j;
    for (i = 0, j = 0; i < numsSize; i++) {
        if (nums[i] != val) {
            nums[j++] = nums[i];
        }
    }
    return j;
}


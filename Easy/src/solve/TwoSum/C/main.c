#include <stdio.h>
#include <stdlib.h>
#include "TwoSum.h"

int main() {
    int nums[] = {2,  11, 15, 23, 43, 111, 7};
    int len = sizeof(nums) / sizeof(nums[0]);
    int target = 9;
    int* x = twoSum(nums, len, target);
    if (x != NULL) {
        printf("Indices: %d, %d\n", x[0], x[1]);
        free(x);
    } else {
        printf("No two sum solution\n");
    }

    return 0;
}

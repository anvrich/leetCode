#include <stdio.h>
#include <malloc.h>
#include "two_sum.h"

int main() {
    int nums_1[] = {2, 7, 11, 15};
    int target_1 = 9;

    int nums_2[] = {3, 2, 4};
    int target_2 = 6;

    int nums_3[] = {3, 3};
    int target_3 = 6;

    size_t size;

    int *result_1 = twoSum(nums_1, sizeof(nums_1) / sizeof(nums_1[0]), target_1, &size);
    printf("Result for nums_1: [%d, %d]\n", result_1[0], result_1[1]);
    free(result_1);

    int *result_2 = twoSum(nums_2, sizeof(nums_2) / sizeof(nums_2[0]), target_2, &size);
    printf("Result for nums_2: [%d, %d]\n", result_2[0], result_2[1]);
    free(result_2);

    int *result_3 = twoSum(nums_3, sizeof(nums_3) / sizeof(nums_3[0]), target_3, &size);
    printf("Result for nums_3: [%d, %d]\n", result_3[0], result_3[1]);
    free(result_3); // Освобождаем память, выделенную для результата

    return 0;
}

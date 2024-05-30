#include <stdio.h>
#include "remove.h"

int main() {
    int nums[] = {0,1,2,2,3,0,4,2};
    int val = 2;
    size_t size = sizeof(nums) / sizeof(*nums);
    int res = removeElement(nums, size, val);
    printf("res = %d \n", res);
}

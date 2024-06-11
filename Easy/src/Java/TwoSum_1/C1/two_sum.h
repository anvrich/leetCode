int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    for (int i = 0; i < numsSize; ++i) {
        for (int j = i + 1; j < numsSize; ++j) {
            if (nums[i] + nums[j] == target) {
                int* result = (int*)malloc(2 * sizeof(int));
                result[0] = i;
                result[1] = j;
                *returnSize = 2; // Записываем размер результата
                return result; // Возвращаем указатель на результат
            }
        }
    }
    *returnSize = 0; // Если пара чисел не найдена, записываем размер результата как 0
    return NULL; // Возвращаем NULL, так как пара чисел не найдена
}

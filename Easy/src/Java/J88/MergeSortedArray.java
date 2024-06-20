package Java.J88;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;          // Указатель на последний элемент массива nums1
        int index2 = n - 1;          // Указатель на последний элемент массива nums2
        int mergedIndex = m + n - 1; // Индекс, куда будем записывать слияние, начиная с конца nums1
        //{1, 2, 3, 0, 0, 0};                               {2, 5, 6};
        // Проходим по массивам nums1 и nums2, начиная с конца и заканчивая началом
        while (index1 >= 0 && index2 >= 0) {
            // Сравниваем элементы nums1 и nums2
            if (nums1[index1] > nums2[index2]) {
                // Если элемент nums1 больше, помещаем его в конец mergedIndex в nums1
                nums1[mergedIndex] = nums1[index1];
                index1--;  // Уменьшаем указатель index1
            } else {
                // Если элемент nums2 больше или равен, помещаем его в конец mergedIndex в nums1
                nums1[mergedIndex] = nums2[index2];
                index2--;  // Уменьшаем указатель index2
            }
            mergedIndex--;  // Уменьшаем mergedIndex для записи следующего элемента
        }

        // Если в nums2 остались элементы, которые не были помещены в nums1
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray marr = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        marr.merge(nums1, m, nums2, n);

        // Printing merged array (optional)
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

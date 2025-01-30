package Java.J350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;

        List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;

        while(i < n && j < m){
            if(nums1[i] == nums2[j]){
                resultList.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int len = resultList.size();
        int[] result = new int[len];
        for(int k = 0; k < len;k++){
            result[k] = resultList.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}

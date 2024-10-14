package main

import "fmt"

func singleNumber(nums []int) int {
	res := 0
	for i := 0; i < len(nums); i++ {
		res ^= nums[i]
	}
	return res
}

func main() {
	// Примеры использования
	nums1 := []int{2, 2, 1}
	nums2 := []int{4, 1, 2, 1, 2}
	nums3 := []int{1}

	fmt.Println("Пример 1:", singleNumber(nums1))
	fmt.Println("Пример 2:", singleNumber(nums2))
	fmt.Println("Пример 3:", singleNumber(nums3))
}

package main

import "fmt"

func main() {
	nums := []int{3, 0, 1}
	res := missingNumber(nums)
	fmt.Println(res)
}

func missingNumber(nums []int) int {
	n := len(nums)
	exceptionSum := n * (n + 1) / 2

	for i := 0; i < n; i++ {
		exceptionSum -= nums[i]
	}

	return exceptionSum
}

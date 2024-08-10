class Solution:
    def romanToInt(self, s):
        roman_to_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        total = 0;
        prev_value = 0;

        for char in reversed(s):
            cur_value = roman_to_int[char]
            if cur_value < prev_value:
                total -= cur_value
            else:
                total += cur_value

            prev_value = cur_value
        return total

s1 = "III"
result1 = Solution().romanToInt(s1)
print(f"Roman numeral: {s1} -> Integer: {result1}")

s2 = "LVIII"
result2 = Solution().romanToInt(s2)
print(f"Roman numeral: {s2} -> Integer: {result2}")


s3 = "MCMXCIV"
result3 = Solution().romanToInt(s3)
print(f"Roman numeral: {s3} -> Integer: {result3}")

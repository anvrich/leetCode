class Solution:
    def intToRoman(self, num: int) -> str:
        val = [
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
        ]
        symbols = [
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
        ]
        roman = []
        for i in range(len(val)):
            while num >= val[i]:
                num -= val[i]
                roman.append(symbols[i])
        return "".join(roman)

# Пример использования
solution = Solution()
print(solution.intToRoman(3749))  # Вывод: "MMMDCCXLIX"

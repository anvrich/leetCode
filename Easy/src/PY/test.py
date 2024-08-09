def is_anagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    return sorted(s) == sorted(t)


# Примеры использования
s1 = "anagram"
t1 = "nagaram"
print(is_anagram(s1, t1))  # Вывод: True

s2 = "крыса"
t2 = "автомобиль"
print(is_anagram(s2, t2))  # Вывод: False

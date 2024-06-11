#include <stdio.h>
#include <string.h>
#include "longestCommonPrefix.h"

int main() {
    char *strs1[] = {"flower", "flow", "flight"};
    int strsSize1 = 3;
    printf("Пример 1: %s\n", longestCommonPrefix(strs1, strsSize1));  // Вывод: "fl"

    for (int i = 1; i < strsSize1; i++) {
        int j = 0;
        printf("Сравниваем строки \"%s\" и \"%s\":\n", strs1[0], strs1[i]);

        while (strs1[0][j] && strs1[i][j] && strs1[0][j] == strs1[i][j]) {
            printf("    Символ \"%c\" совпадает.\n", strs1[0][j]);
            j++;
        }

        printf("Общий префикс: %.*s\n", j, strs1[0]); // Вывод общего префикса
        printf("\n");
    }

    return 0;
}

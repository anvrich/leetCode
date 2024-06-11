char *longestCommonPrefix(char **strs, int strsSize) {
    if (strsSize == 0) return "";

    char *prefix = strdup(strs[0]);

    for (int i = 1; i < strsSize; i++) {
        int j = 0;

        while (prefix[j] && strs[i][j] && prefix[j] == strs[i][j]) {
            j++;
        }

        prefix[j] = '\0';

        if (prefix[0] == '\0') return prefix;

    }
    return prefix;
}

//prefix будет установлен как "flower".
//Сравнение "flower" и "flow":
//
//prefix[0] == strs[1][0] → 'f' == 'f' → true
//        prefix[1] == strs[1][1] → 'l' == 'l' → true
//        prefix[2] == strs[1][2] → 'o' == 'o' → true
//        prefix[3] == strs[1][3] → 'w' == 'w' → true
//        prefix[4] == strs[1][4] → 'e' != '\0' → false
//        Цикл останавливается, prefix обрезается до "flow".
//
//Сравнение "flow" и "flight":
//
//prefix[0] == strs[2][0] → 'f' == 'f' → true
//        prefix[1] == strs[2][1] → 'l' == 'l' → true
//        prefix[2] == strs[2][2] → 'o' != 'i' → false
//        Цикл останавливается, prefix обрезается до "fl".
//
//Таким образом, на выходе будет "fl" как самый длинный общий префикс для массива {"flower", "flow", "flight"}.
int romanToInt(char* s) {
    int romanMap[256] = {0};
    romanMap['I'] = 1;
    romanMap['V'] = 5;
    romanMap['X'] = 10;
    romanMap['L'] = 50;
    romanMap['C'] = 100;
    romanMap['D'] = 500;
    romanMap['M'] = 1000;

    int result = 0;
    int i = 0;

//    MCMXCIV
    while (s[i]) {
        printf("%c " , s[i]);
        if (s[i + 1] && romanMap[s[i]] < romanMap[s[i + 1]]) {
            result -= romanMap[s[i]];
        } else {
            result += romanMap[s[i]];
        }
        i++;
    }
    printf("\n");
    return result;
}


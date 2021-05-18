class Solution {
    public String intToRoman(int num) {
        char c[] = new char[10001];
        int i = 0;
 
 
        // TO convert decimal number to roman numerals
        while (num != 0) {
            // If base value of number is greater than 1000
            if (num >= 1000) {
                i = digit('M', num / 1000, i, c);
                num = num % 1000;
            } // If base value of number is greater than or
            // equal to 500
            else if (num >= 500) {
                // To add base symbol to the character array
                if (num < 900) {
                    // Add 'D' number/1000 times after index i
                    i = digit('D', num / 500, i, c);
                    num = num % 500;
                } // To handle subtractive notation in case of number
                // having digit as 9 and adding corresponding base
                // symbol
                else {
                    // Add C and M after index i/.
                    i = sub_digit('C', 'M', i, c);
                    num = num % 100;
                }
            } // If base value of number is greater than or equal to 100
            else if (num >= 100) {
                // To add base symbol to the character array
                if (num < 400) {
                    i = digit('C', num / 100, i, c);
                    num = num % 100;
                } // To handle subtractive notation in case of number
                // having digit as 4 and adding corresponding base
                // symbol
                else {
                    i = sub_digit('C', 'D', i, c);
                    num = num % 100;
                }
            } // If base value of number is greater than or equal to 50
            else if (num >= 50) {
                // To add base symbol to the character array
                if (num < 90) {
                    i = digit('L', num / 50, i, c);
                    num = num % 50;
                } // To handle subtractive notation in case of number
                // having digit as 9 and adding corresponding base
                // symbol
                else {
                    i = sub_digit('X', 'C', i, c);
                    num = num % 10;
                }
            } // If base value of number is greater than or equal to 10
            else if (num >= 10) {
                // To add base symbol to the character array
                if (num < 40) {
                    i = digit('X', num / 10, i, c);
                    num = num % 10;
                } // To handle subtractive notation in case of
                // number having digit as 4 and adding
                // corresponding base symbol
                else {
                    i = sub_digit('X', 'L', i, c);
                    num = num % 10;
                }
            } // If base value of number is greater than or equal to 5
            else if (num >= 5) {
                if (num < 9) {
                    i = digit('V', num / 5, i, c);
                    num = num % 5;
                } // To handle subtractive notation in case of number
                // having digit as 9 and adding corresponding base
                // symbol
                else {
                    i = sub_digit('I', 'X', i, c);
                    num = 0;
                }
            } // If base value of number is greater than or equal to 1
            else if (num >= 1) {
                if (num < 4) {
                    i = digit('I', num, i, c);
                    num = 0;
                } // To handle subtractive notation in case of
                // number having digit as 4 and adding corresponding
                // base symbol
                else {
                    i = sub_digit('I', 'V', i, c);
                    num = 0;
                }
            }
        }
 
        String toReturn = "";
        for (int j = 0; j < i; j++) {
            toReturn += c[j];
        }
        return toReturn;
    }
    
    int sub_digit(char num1, char num2, int i, char[] c) {
        c[i++] = num1;
        c[i++] = num2;
        return i;
    }
 
    int digit(char ch, int n, int i, char[] c) {
        for (int j = 0; j < n; j++) {
            c[i++] = ch;
        }
        return i;
    }
}
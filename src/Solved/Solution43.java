package Solved;

public class Solution43 {
    public String multiply(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int l1 = num1.length(), l2 = num2.length(), l = l1+l2;
        for (int i = 0; i < l1+l2; i++) {
            res.append(0);
        }
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                int num = (num1.charAt(l1-1-i) - '0') * (num2.charAt(l2 - 1 - j) - '0');
                int tens = i + j;
                while(num > 0){
                    char c = res.charAt(l-tens);
                    c += num % 10;
                    if (c-'0' > 9){
                        c -= 10;
                        num += 10;
                    }
                    res.setCharAt(l - tens, c);
                    num /= 10;
                    tens += 1;
                }
            }
        }
        String str = res.toString();
        while (str.startsWith("0")){
            str = str.substring(1);
        }
        return str;

    }
    private String times(String num, int i){
        char[] chars = num.toCharArray();
        for (int j = chars.length - 1; j >= 0; j--) {

        }
        return "";
    }
}


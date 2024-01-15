package MianShi;

public class Solution01_06 {
    public String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char pre = ' ';
        for (char c : S.toCharArray()){
            if (c == pre || pre == ' '){
                count += 1;
                if (pre == ' '){
                    sb.append(c);
                    pre = c;
                }
            }else{
                sb.append(count);
                count = 1;
                sb.append(c);
                pre = c;
            }
        }
        sb.append(count);
        if (sb.length() < S.length())
            return sb.toString();
        else return S;
    }
}

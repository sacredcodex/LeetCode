package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution68 {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int length = 0;
        for (String word : words){
            if (length + line.size() + word.length() <= maxWidth){
                line.add(word);
                length += word.length();
            }else {
                StringBuilder sb = new StringBuilder();
                if (line.size() == 1){
                    sb.append(line.get(0));
                    while(sb.length() < maxWidth)
                        sb.append(' ');
                }else {
                    int remain = maxWidth - length - line.size() + 1;
                    int space = line.size() - 1;
                    int[] spaces = new int[space];
                    int spaceLength = remain / space;
                    int longerNum = remain - spaceLength * space;
                    for (int i = 0; i < longerNum; i++) {
                        spaces[i] = spaceLength + 1;
                    }
                    for (int i = longerNum; i < space; i++) {
                        spaces[i] = spaceLength;
                    }
                    for (int i = 0; i < line.size(); i++) {
                        sb.append(line.get(i));
                        if (i<space)
                            for (int j = 0; j <= spaces[i]; j++) {
                                sb.append(' ');
                            }
                    }
                }
                res.add(sb.toString());
                line.clear();
                line.add(word);
                length = word.length();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.size(); i++) {
            sb.append(line.get(i));
            if (i < line.size()-1)
                sb.append(' ');
        }
        while(sb.length() < maxWidth)
            sb.append(' ');
        res.add(sb.toString());
        return res;
    }
}

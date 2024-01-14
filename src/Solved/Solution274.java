package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length; i > 0; i--) {
            int index = citations.length - i;
            if (citations[index] >= i)
                return i;
        }
        return 0;
    }
}

package Solved;

public class Solution365 {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (jug1Capacity + jug2Capacity > targetCapacity)return false;
        if (jug1Capacity < jug2Capacity){
            int tmp = jug1Capacity;
            jug1Capacity = jug2Capacity;
            jug2Capacity = tmp;
        }
        int q = jug1Capacity % jug2Capacity;
        while (q != 0){
            jug1Capacity = jug2Capacity;
            jug2Capacity = q;
            q = jug1Capacity % jug2Capacity;
        }
        return targetCapacity % jug2Capacity == 0;


    }

}

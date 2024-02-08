package Solved;

public class Solution808 {
    public double soupServings(int n) {
        n = (n+24) / 25;
        if (n > 178)
            return 1.0;
        memory = new double[n+1][n+1];
        return p(n,n);
    }

    private double[][] memory;

    private double p(int a, int b){
        if (a<=0 && b<=0) return 0.5;
        if (a<=0) return 1;
        if (b<=0) return 0;
        if (memory[a][b] != 0) return memory[a][b];
        double p = (p(a-4,b)+p(a-3,b-1)+p(a-2,b-2)+p(a-1,b-3))/4;
        memory[a][b] = p;
        return p;
    }

    public static void main(String[] args) {
        Solution808 solution808 = new Solution808();
        for (int i = 0; i < 10000; i++) {
            double p = solution808.soupServings(i*25);
            if (p > 0.99999){
                System.out.println(i); //179
                break;}
        }
    }
}

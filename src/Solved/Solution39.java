package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solutions = new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, solution, solutions);
        return solutions;
    }
    private void solve(int[] candidates, int target, List<Integer> solution, List<List<Integer>> solutions){
        if (target == 0) {
            solutions.add(new ArrayList<>(solution));
            return;
        }
        for (int candidate : candidates){
            if (solution.size() > 0 && candidate < solution.get(solution.size() - 1))
                continue;
            if (candidate <= target){
                solution.add(candidate);
                target -= candidate;
                solve(candidates, target, solution, solutions);
                solution.remove(solution.size() - 1);
                target += candidate;
            }else
                break;
        }
        return;

    }


}

package org.src;

import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        if(candidates.length==0) return result;

        List<Integer> current = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        breaker(candidates,result,current,target,0,set);

        return result;

    }

    public void breaker(int[] candidates,List<List<Integer>> result,List<Integer> current,int target,int sum,Set<List<Integer>> set){

        if(sum==target){

            List<Integer> list = new ArrayList<>(current);
            Collections.sort(list);

            if(!set.contains(list)){
                result.add(new ArrayList<>(current));
                set.add(list);
            }

            return;
        }

        for (int candidate : candidates) {

            if (sum + candidate > target) {
                break;
            }

            sum = sum + candidate;
            current.add(candidate);

            breaker(candidates, result, current, target, sum, set);

            sum = sum - candidate;
            current.remove(current.size() - 1);

        }

    }

    public static void main(String[] argc){
        CombinationSum main = new CombinationSum();
        System.out.println(main.combinationSum(new int[]{8,7,4,3},11));
    }

}

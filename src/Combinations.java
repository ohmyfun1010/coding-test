package org.src;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        breaker(1, result, new ArrayList<>(), n, k);
        return result;
    }

    public void breaker(int start, List<List<Integer>> result, List<Integer> current, int n, int k) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            breaker(i + 1, result, current, n, k);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] argc){
        Combinations main = new Combinations();
        System.out.println(main.combine(4,2));
    }

}

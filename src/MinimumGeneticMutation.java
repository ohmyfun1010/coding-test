package org.src;

import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class MinimumGeneticMutation {

    public int minMutation(String startGene, String endGene, String[] bank) {

        Queue<String> queue = new LinkedList<>();
        Set<String> done = new HashSet<>();
        queue.add(startGene);
        int changeCnt = 0;

        while(!queue.isEmpty()){

            int queueSize = queue.size();

            for(int q = 0;q<queueSize;q++){

                String target = queue.poll();
                if(target.equals(endGene)) return changeCnt;

                for(int i = 0;i<bank.length;i++){
                    int diffCnt = 0;
                    for(int j = 0;j<target.length();j++){
                        if(diffCnt > 1) break;
                        if(target.charAt(j)!=bank[i].charAt(j)) diffCnt++;
                    }
                    if(diffCnt==1 && !done.contains(bank[i])) {
                        queue.add(bank[i]);
                    }
                }

                done.add(target);

            }

            changeCnt++;

        }

        return -1;

    }

    public static void main(String[] argc){
        MinimumGeneticMutation main = new MinimumGeneticMutation();
        System.out.println(main.minMutation("AAAAACCC","AAAAACGG",new String[]{"AAAAACCG", "AAAAACGG"}));
    }

}

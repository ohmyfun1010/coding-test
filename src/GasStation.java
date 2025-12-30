package org.src;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return total >= 0 ? start : -1;

    }

    public static void main(String[] argc){
        GasStation main = new GasStation();
        System.out.println(main.canCompleteCircuit(new int[]{5,1,2,3,4},new int[]{4,4,1,5,1}));
    }

}

package org.src;
import java.util.*;

public class RandomizedSet {

    private List<Integer> list;
    private Map<Integer,Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            map.put(val,list.size());
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if(map.containsKey(val)){

            int idx = map.get(val);
            int lastValue = list.get(list.size()-1);

            list.set(idx,lastValue);
            map.put(lastValue, idx);

            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }else{
            return false;
        }
    }

    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

}

package solution.leetcode.com;

import java.util.ArrayList;
import java.util.HashSet;

public class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet r = new RandomizedSet();
        System.out.println(r.insert(1));
        System.out.println(r.remove(2));
        System.out.println(r.insert(2));
        System.out.println(r.getRandom());
        System.out.println(r.remove(1));
        System.out.println(r.insert(2));
        System.out.println(r.getRandom());
    }
    /** Initialize your data structure here. */
    HashSet<Integer> set;
    ArrayList<Integer> list;
    java.util.Random rand = new java.util.Random();
    public RandomizedSet() {
        set = new HashSet();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (this.set.contains(val)){
            return false;
        }else{
            set.add(val);
            list.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!this.set.contains(val)){
            return false;
        }else{
            this.set.remove(val);
            list.remove(new Integer(val));
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }

}

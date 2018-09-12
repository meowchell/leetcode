package solution.leetcode.com;

import java.util.HashSet;
import java.util.List;

public class KeysAndRooms {
    public static void main(String[] args) {

    }
    HashSet<Integer> visitedRoom = new HashSet<>();
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        enterRoom(0, rooms);
        return this.visitedRoom.size() == rooms.size();

    }
    public void enterRoom(int key, List<List<Integer>> rooms){
        visitedRoom.add(key);
        for (Integer i: rooms.get(key)){
            if (!visitedRoom.contains(key)){
                enterRoom(i, rooms);
            }
        }
    }
}

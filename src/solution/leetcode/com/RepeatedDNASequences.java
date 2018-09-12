package solution.leetcode.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    public List<String> findSeq(String s){
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (int i=0; i+9 < s.length() ; i ++){
            String sub = s.substring(i, i+10);
            if (!seen.add(sub)){
                repeated.add(sub);
            }
        }

        return new ArrayList<>(repeated);
    }
}

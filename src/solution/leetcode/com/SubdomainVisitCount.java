package solution.leetcode.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huijiej on 4/24/2018.
 */
public class SubdomainVisitCount {
    public static void main(String[] args) {
        SubdomainVisitCount c = new SubdomainVisitCount();
        List l = c.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
        System.out.print(l);

    }
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String url:cpdomains){
            helper(url, map);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry e: map.entrySet()){
            String s = e.getValue()+" "+e.getKey();
            list.add(s);
        }
        return list;
    }
    public void helper(String s, HashMap<String, Integer> map){
        String[] ts = s.split("\\s");
        Integer count = Integer.valueOf(ts[0]);
        String[] es = ts[1].split("\\.");
        map.put(ts[1], map.getOrDefault(ts[1],0)+count);
        for (int i = 1; i < es.length; i ++){
            int j =0;
            int start = 0;
            while (j < i){
                start+=es[j++].length();
            }
            String e = ts[1].substring(start+j);
            map.put(e, map.getOrDefault(e,0)+count);
        }

    }
}

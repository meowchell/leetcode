package solution.leetcode.com;



import java.util.*;

public class MergeAccounts {
    public static void main(String[] args) {
        String[][] ss = new String[][]{
                {"David","David0@m.co","David4@m.co","David3@m.co"},
                {"David","David5@m.co","David5@m.co","David0@m.co"},
                {"David","David1@m.co","David4@m.co","David0@m.co"},
                {"David","David0@m.co","David1@m.co","David3@m.co"},
                {"David","David4@m.co","David1@m.co","David3@m.co"}};
        MergeAccounts m = new MergeAccounts();
        List<List<String>> acc = new ArrayList<>();
        for (String[] s:ss){
            acc.add(Arrays.asList(s));
        }
        List<List<String>> ret = m.mergeAccounts(acc);
        for (List<String> account:  ret){
            for (String s: account){
                System.out.println(s);
            }
            System.out.println("---");
        }
    }
    public String toLowerCase(String str) {
        char[] cs = str.toCharArray();
        for(int i = 0;  i < cs.length; i++){
            if(cs[i] > 'A' && cs[i] < 'Z'){
                cs[i] = (char)('a' + cs[i] -'A');
            }

        }
        return new String(cs);
    }
    public List<List<String>>  mergeAccounts(List<List<String>> accounts){
        List<List<String>> ret = new ArrayList<>();
        Map<String, String> parent = new HashMap<>();
        Map<String, String> owner = new HashMap<>();
        Map<String, TreeSet<String>> unions = new HashMap<>();
        for (List<String> account:  accounts){
            for (int i = 1; i < account.size(); i++){
                parent.put(account.get(i), account.get(1));
                owner.put(account.get(i), account.get(0));
            }
        }

        for (List<String> account:  accounts){
            String p = find(account.get(1), parent);
            for (int i = 2; i < account.size(); i++){
                parent.put(find(account.get(i), parent),p);
            }
        }


        for (List<String> account:  accounts){
            String p = find(account.get(1), parent);
            if (!unions.containsKey(p)) unions.put(p, new TreeSet<String>());
            for (int i = 1; i < account.size(); i++){
                unions.get(p).add(account.get(i));
            }
        }

        for(Map.Entry<String, TreeSet<String>> e: unions.entrySet()){
            String n = owner.get(e.getKey());
            List<String> mergedAccount = new ArrayList<>(e.getValue());
            mergedAccount.add(0, n);
            ret.add(mergedAccount);
        }


        return ret;

    }

    String find(String s, Map<String, String> map){
        return map.get(s) == s ? s: find(map.get(s), map);
    };
}

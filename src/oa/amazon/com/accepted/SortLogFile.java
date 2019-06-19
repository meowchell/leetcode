package oa.amazon.com.accepted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLogFile {
    public static void main(String[] args) {
        String[] logString = {
                "afe2 br9o fjsd",
                "fhie 1df8 sfds",
                "fdsf 3def sees",
                "efe2 br9o fjsd",
                "asd1 awer jik9",
                "fdsf 2def sees",};

        List<String> s = Arrays.asList(logString);
        SortLogFile slf = new SortLogFile();
        slf.orderedJunctionBoxes(6,Arrays.asList(logString)).stream().forEach(e-> System.out.println(e));


    }

    public List<String> orderedJunctionBoxes(int numberOfBoxes,
                                             List<String> boxList)
    {
        // WRITE YOUR CODE HERE
        String[] ans = new String[numberOfBoxes];
        int cnt = numberOfBoxes-1;

        List<String> ret = new ArrayList<>();
        for (int i = 0;i< numberOfBoxes; i++ ){
            String model = boxList.get(i);
            int idx = model.indexOf(" ");
            String version = model.substring(idx+1);
            if (version.charAt(0) > '0' && version.charAt(0) < '9'){
                ans[cnt--] = model;
            } else {
                ret.add(model);
            }

        }

        ret.sort(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                int idx1 = s1.indexOf(" ");
                String id1 = s1.substring(0,idx1);
                String ver1 = s1.substring(idx1+1);
                int idx2 = s2.indexOf(" ");
                String id2 = s2.substring(0,idx2);
                String ver2 = s2.substring(idx2+1);
                if(ver1.compareTo(ver2) == 0){
                    return id1.compareTo(id2);
                }
                return ver1.compareTo(ver2);

            }

        });
        for(;cnt < numberOfBoxes; cnt++){
            ret.add(ans[cnt]);
        }


        return ret;

    }
    public String[] sort(List<String> log) {
        int len = log.size();
        String[] ans = new String[len];
        int cnt = len - 1;
        List<String> letterList = new ArrayList<>();
        for (int i = len - 1; i >= 0; i--){
            String l = log.get(i);
            int idx  = l.indexOf(' ');
            String body = l.substring(idx+1);
            if (body.charAt(0) >= '0' && body.charAt(0)<='9'){
                ans[cnt--] = l;
            }else {
                letterList.add(l);
            }
        }

        letterList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int idx1 = o1.indexOf(' ');
                int idx2 = o1.indexOf(' ');
                String id1 = o1.substring(0, idx1);
                String id2 = o2.substring(0, idx2);
                String body1 = o1.substring(idx1);
                String body2 = o2.substring(idx2);
                if (body1.equals(body2)) {
                    return id1.compareTo(id2);
                }

                return body1.compareTo(body2);
            }
        });
        cnt = 0;

        for (String s:letterList){
            ans[cnt++] = s;
        }


        return ans;
    }

}

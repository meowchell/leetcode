package solution.leetcode.com;

import java.util.ArrayList;

public class Confetti {
    static ArrayList<Wrapper> list = new ArrayList<>();
    static{
        list.add(new Wrapper(0.1, 0.2));
        list.add(new Wrapper(0.4, 0.77));
        list.add(new Wrapper(0.3, 0.6));
        list.add(new Wrapper(0.226, 0.28));
        list.add(new Wrapper(0.16, 0.6));
        list.add(new Wrapper(0.46, 0.9));
        list.add(new Wrapper(0.80, 1.0));
        list.add(new Wrapper(0.10, 0.4));

    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList();
//        list.add(0);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        int k = 3;
//        while (list.size() > 3){
//            list.remove(k);
//        }

//        list.stream().forEach(e-> System.out.println(e));
        Confetti c = new Confetti();
        System.out.println(c.party());

    }

    public int party(){
        ArrayList<Double> coverage = new ArrayList<>();
        int i = 0;
        for (i = 0; i < list.size(); i++){
            double start =list.get(i).start;
            double end =list.get(i).end;
            if (coverage.isEmpty()){
                coverage.add(start);
                coverage.add(end);
                continue;
            }
            int k = 0;
            int m = 0;
            while (k < coverage.size()){
                if (start < coverage.get(k)){
                    if (end < coverage.get(k)){
                        m = k;
                        break;
                    }
                    m = k+1;

                    while ( m < coverage.size()){
                        if (end < coverage.get(m)){
                            break;
                        } else {
                            m = m+2;
                        }
                    }
                    break;
                } else {
                    k +=2;
                }
            }
            if (k >= coverage.size()){
                coverage.add(start);
                coverage.add(end);
            } else if (m == k){
                coverage.add(0.0);
                coverage.add(0.0);
                int n = coverage.size() - 1;
                int l = coverage.size() - 2;
                while (l > m){
                    coverage.set(n, coverage.get(n-2));
                    coverage.set(l, coverage.get(l-2));
                    l = l -2;
                    n = n -2;
                }
                coverage.set(k, start);
                coverage.set(k+1, end);
            } else if (m > coverage.size()){
                while (coverage.size() > k+1){
                    coverage.remove(k+1);
                }
                coverage.add(end);
            } else if(k < coverage.size()){
                coverage.set(k, start);

            }else if(m < coverage.size()){
                coverage.set(m, end);
            }

            if (coverage.size() == 2&&coverage.get(0) == 0&&coverage.get(1) == 1){
                break;
            }

        }
        return i+1;
    }




    static class Wrapper{
        double start;
        double end;
        public Wrapper(double start, double end) {
            this.start = start;
            this.end = end;
        }
    }
}

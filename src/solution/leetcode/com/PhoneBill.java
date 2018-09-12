package solution.leetcode.com;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by huijiej on 9/21/2017.
 */
public class PhoneBill {
    private double total;
    private double avg;
    private ArrayList<Double> highList = new ArrayList<>();
    public final static int memberCount = 6;
    public DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        double total = 226.87;
        double avg= 21.18;
        PhoneBill b = new PhoneBill(total, avg);
        b.getHighList().addAll(Arrays.asList(33.97));
        b.calculate();
    }

    public PhoneBill(double total, double avg) {
        this.total = total;
        this.avg = avg;

    }

    public void calculate() {
        double base = 0;
        double diff = 0;
        double sumHigh = 0;
        HashMap<Double, Double> map = new HashMap<>();

        for (Double d : highList) {
            diff += d - avg;
        }
        System.out.println("total = "+ total);
        System.out.println("avg = "+ avg);
        System.out.println("high = "+ highList.toString());
        System.out.println("diff = "+highList.toString()+" - "+avg+ " x "+highList.size()+" = "+df.format(diff));
        base = (total - diff) / memberCount;
        System.out.println("====");
        System.out.println("base = ( total - diff ) / "+memberCount +" = ( "+total+" - " + df.format(diff) +" ) / " +memberCount +" = " + df.format(base));


        for (Double d : highList) {
            double b = base + (d - avg);
            map.put(d, b);
            sumHigh+=b;
            System.out.println(d+" needs to pay = base + diff = " +df.format(base )+" + "+df.format(d - avg)+" = "+df.format(b));
        }




        int avgCount = memberCount - highList.size();
        double sum = base*avgCount+sumHigh;
        System.out.println("====");
        System.out.println("Sum = base x "+avgCount+" + sum of high = "+df.format(base)+" x "+avgCount+" + "+df.format(sumHigh) +" = "+df.format(sum) );
        System.out.println("compared at $"+df.format(total));
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public ArrayList<Double> getHighList() {
        return highList;
    }

    public void setHighList(ArrayList<Double> highList) {
        this.highList = highList;
    }

    public static int getMemberCount() {
        return memberCount;
    }
}

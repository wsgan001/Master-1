package Combination;

/**
 * Created with IntelliJ IDEA.
 * User: Yang Wenjing
 * Date: 13-11-28
 * Time: 下午8:10
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;
import java.util.List;

public class Combination_by_GrayCode {
    private int n;
    private String[] graycodeArr;

    public Combination_by_GrayCode(int n) {
        this.n = n;
    }
    public void generateGrayCode() {
        this.graycodeArr = GrayCode(n);
        print();
    }
    public String[] GrayCode(int n) {

        // produce 2^n grade codes
        String[] graycode = new String[(int) Math.pow(2, n)];

        if (n == 1) {
            graycode[0] = "0";
            graycode[1] = "1";
            return graycode;
        }

        String[] last = GrayCode(n - 1);

        for (int i = 0; i < last.length; i++) {
            graycode[i] = "0" + last[i];
            graycode[graycode.length - 1 - i] = "1" + last[i];
        }

        return graycode;
    }

    public void print() {
        for(int i=0;i<this.graycodeArr.length;i++)
        {
            System.out.print(this.graycodeArr[i]+"\n");
        }

    }

}


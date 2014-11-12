/**
 * Created with IntelliJ IDEA.
 * User: Yang Wenjing
 * Date: 13-11-28
 * Time: 下午7:44
 * To change this template use File | Settings | File Templates.
 */
import Combination.*  ;
import Permutation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program {
    //TODO: to select to run combination or permutation
    public static void main(String[] args) {
        //生成格雷码3
        //combination_by_grayCode();
        permutation();
        combination_by_r_dict();
    }
    private static String readDataFromConsole(String prompt) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            System.out.print(prompt);
            str = br.readLine();
            //System.out.print(str);
            while (str=="") {
                str = br.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    static void permutation()
    {

        System.out.println("Input a string: ");
        String text = new java.util.Scanner(System.in).next();
        Permutation.permutate(text);

    }
    static void combination_by_grayCode()
    {

        String str = readDataFromConsole("生成多少位的格雷码呢？") ;
        int n = Integer.parseInt(str);
        Combination_by_GrayCode combination = new Combination_by_GrayCode(n);
        combination.generateGrayCode();
    }

    static void combination_by_r_dict()
    {
        String str = readDataFromConsole("字典序生成r-组合数：输入n:");
        int n = Integer.parseInt(str);
        String rStr = readDataFromConsole("输入r:");
        int r = Integer.parseInt(rStr);
        Combination_r_dict combination_r_dict = new Combination_r_dict(r,n);
        combination_r_dict.generator();

    }
}

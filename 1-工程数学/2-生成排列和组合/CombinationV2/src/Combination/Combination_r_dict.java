package Combination;
/**
 * Created with IntelliJ IDEA.
 * User: Yang Wenjing
 * Date: 13-11-29
 * Time: 下午8:34
 * To change this template use File | Settings | File Templates.
 */
public class Combination_r_dict {
    private int combintaion[];
    private int n;//n个数
    private int r;//生成r组合

    public Combination_r_dict(int r, int n) {
        this.r = r;
        this.n = n;
        combintaion = new int [r];
        for(int i=0;i<r;i++)
            this.combintaion[i]=i+1;
    }
    public void generator()
    {
        while(true)
        {
            print_combintation();
            int index = get_max_index_can_increase();
            if(index==-1)break;

            next(index);
        }
    }
    public void print_combintation()
    {
        String str = "";
        for(int j=0;j<this.combintaion.length;j++)
            str+=this.combintaion[j];
        System.out.println(str);

    }
    public int get_max_index_can_increase()
    {
        int i = this.r-1;
        int j=0;
        while (i>=0)
        {
            if(this.combintaion[i]!= this.n-j)
                return i;
            i -= 1;
            j+=1;

        }
        return -1;
    }
    public void next(int index)
    {
        int num = this.combintaion[index];
        int i = index;
        while(i<this.r)
        {
            num+=1;
            this.combintaion[i] = num;
            i++;
        }
    }
}


package buaa.edu.com;

public class CircleCalculator {

    private double r;   
    private double mian;   
    private double zhou;   
       
    public void readInput()   
    {   
        KeyBoardReader input = new KeyBoardReader();   
        System.out.println("Enter radius");   
        r=input.readDouble();   
    }   
    public void doCalculations()   
    {   
        mian= Math.PI * r*r;   
        zhou = Math.PI * r*2;   
    }   
    public void display()   
    {   
        System.out.println("你输入的半径为： "+r);   
        System.out.println("圆的面积为： "+mian);   
        System.out.println("圆的周长为："+zhou);   
    }  

}

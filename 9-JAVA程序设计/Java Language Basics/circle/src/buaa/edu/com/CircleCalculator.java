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
        System.out.println("������İ뾶Ϊ�� "+r);   
        System.out.println("Բ�����Ϊ�� "+mian);   
        System.out.println("Բ���ܳ�Ϊ��"+zhou);   
    }  

}

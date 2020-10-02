package Day3;
public class Test
{
    int a;
    Test(int a)
    {
        this.a=a;
    }
    void add()
    {
        int a=5,b=10;
        System.out.println("Function Without parameters :- ");
        System.out.println("Sum of "+a+" & "+b+" is : "+(a+b));
    }
    float add(int a,float c)
    {
        System.out.println("Function With parameters int and float :- ");
        System.out.print("Sum of "+a+" & "+c+" is : ");
        return (a+c);
    }
    void add(String s1,String s2)
    {
        System.out.println("Function With String parameters :- ");
        System.out.println("Sum of "+s1+" & "+s2+" is : "+(s1+s2));
    }
    Test add(Test ob,Test ob1)
    {
        System.out.println("Function With Objects as parameters :- ");
        System.out.print("Sum of "+ob.a+" & "+ob1.a+" is : ");
        ob.a=ob.a+ob1.a;
        return ob;
    }
    public static void main(String args[])
    {
        Test ob=new Test(12);
        ob.add();
        float c=ob.add(15,25);
        System.out.println(c);
        ob.add("Hello ","World");
        Test ob1=new Test(18);
        Test ob3;
        ob3=ob.add(ob,ob1);
        System.out.println(ob3.a);        
    }
}

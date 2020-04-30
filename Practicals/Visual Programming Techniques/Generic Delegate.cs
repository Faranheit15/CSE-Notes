using System;
using System.Collection.Generics;
delegate T NumberChanges<T>(Tn);
Class TestDelegate
{
    static int num=10;
    public static int AddNum(int p)
    {
        num+=p;
        return num;
    }
    public static int MullNum(int q)
    {
        num*=q;
        return num;
    }
    public static int getNum()
    {
        return num;
    }
    static void Main()
    {
        //create delegate
        NumberChanges<int>nC1=new NumberChanges<int>(AddNum);
        NumberChanges<int>nC2=new NumberChanges<int>(MullNum);
        //calling methods
        nC1(25);
        Console.WriteLine("Value of num: ",getNum());
        nC2(35);
        Console.WriteLine("Value of num: ",getNum());
        
    }
}
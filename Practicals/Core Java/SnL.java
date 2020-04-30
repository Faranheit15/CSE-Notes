import java.util.*;
class SnL
{
    int Random, p1pos, p2pos;
    boolean p1state, p2state;
    SnL()
    {
        Random=0;
        p1pos=0;
        p2pos=0;
        p1state=false;
        p2state=false;
    }
    void dice()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 0 to spin the dice!");
        int spin=sc.nextInt();
        if(spin==0)
            Random=((int)(Math.random()*5))+1;
        System.out.println("Dice : "+(Random));
    }
    void Player1()
    {
        System.out.println("Player 1 current position : "+p1pos);
        if((p1pos==0)&&(p1state==false))
        {
            if(Random==1)
            {
                p1state=true;
                p1pos++;
            }
            else
                System.out.println("Booooo! Try in the next move!");
        }
        else if(p1pos>0)
        {
            p1pos+=Random;
            if(p1pos==2)
                p1pos=18;
            else if(p1pos==9)
                p1pos=28;
            else if(p1pos==25)
                p1pos=47;
            else if(p1pos==30)
                p1pos=50;
            else if(p1pos==39)
                p1pos=41;
            else if(p1pos==45)
                p1pos=57;
            else if(p1pos==51)
                p1pos=73;
            else if(p1pos==65)
                p1pos=85;
            else if(p1pos==79)
                p1pos=98;
            else if(p1pos==89)
                p1pos=91;
            else if(p1pos==25)
                p1pos=7;
            else if(p1pos==38)
                p1pos=17;
            else if(p1pos==52)
                p1pos=33;
            else if(p1pos==66)
                p1pos=46;
            else if(p1pos==62)
                p1pos=60;
            else if(p1pos==90)
                p1pos=70;
            else if(p1pos==93)
                p1pos=67;
            else if(p1pos==95)
                p1pos=75;
            else if(p1pos==97)
                p1pos=58;
            else if(p1pos==99)
                p1pos=81;
        }
        System.out.println("Player 1 new position : "+p1pos);
    }
    void Player2()
    {
        System.out.println("Player 2 current position : "+p2pos);
        if(p2pos==0)
        {
            if((p2pos==0)&&(p2state==false))
            {
                p2state=true;
                p2pos++;
            }
            else
                System.out.println("Booooo! Try in the next move!");
        }
        else if(p2pos>0)
        {
            p2pos+=Random;
            if(p2pos==2)
                p2pos=18;
            else if(p2pos==9)
                p2pos=28;
            else if(p2pos==25)
                p2pos=47;
            else if(p2pos==30)
                p2pos=50;
            else if(p2pos==39)
                p2pos=41;
            else if(p2pos==45)
                p2pos=57;
            else if(p2pos==51)
                p2pos=73;
            else if(p2pos==65)
                p2pos=85;
            else if(p2pos==79)
                p2pos=98;
            else if(p2pos==89)
                p2pos=91;
            else if(p2pos==25)
                p2pos=7;
            else if(p2pos==38)
                p2pos=17;
            else if(p2pos==52)
                p2pos=33;
            else if(p2pos==66)
                p2pos=46;
            else if(p2pos==62)
                p2pos=60;
            else if(p2pos==90)
                p2pos=70;
            else if(p2pos==93)
                p2pos=67;
            else if(p2pos==95)
                p2pos=75;
            else if(p2pos==97)
                p2pos=58;
            else if(p2pos==99)
                p2pos=81;
        }
        System.out.println("Player 2 new position : "+p2pos);
    }
    void winner()
    {
        if(p1pos==100)
        {
            System.out.println("Player 1 wins!");
        }
        else if(p2pos==100)
        {
            System.out.println("Player 2 wins!");
        }
    }
    void main()
    {
        SnL ob=new SnL();
        int step=1;
        while((p1pos<100)||(p2pos<100))
        {
            System.out.println("Chance="+step);
            System.out.println();
            System.out.println("Player 1------------------------->");
            ob.dice();
            ob.Player1();
            System.out.println();
            System.out.println("Player 2------------------------->");
            ob.dice();
            ob.Player2();
            ob.winner();
            System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________");
            step++;
        }
    }
}
import java.awt.Desktop;
import java.io.*;
import java.util.*;

public class Dice
{

    /**
     *
     * @return rolled number
     */
    public static int roll()
    {
        Random r=new Random();
        int v=r.nextInt(7);
        while (v==0||v==7)
            v=r.nextInt(7);
        return v;
    }

    /**
     *
     * @param style to print
     * @throws IOException
     */
    public static void img(String style) throws IOException
    {
    	String dir="C:\\Dice\\"+style+"\\";
    	String r = ""+roll();
    	String path=dir+r+".png";
    	File f=new File(path);
    	Desktop dt=Desktop.getDesktop();
    	dt.open(f);
    }

    /**
     *
     * @param n number to print 
     * @return String in astrises form
     */
    public static String print(int n)
    {
        String toPrint="";
        switch(n)
        {
            case 1:
                toPrint="\n"+
                    " * "+"\n"+
                    "";
            break;

            case 2:
                toPrint="\n"+
                        "* *"+"\n"+
                        "";
            break;

            case 3:
                toPrint=" * "+"\n"+
                        "* *"+"\n"+
                        "";
            break;

            case 4:
                toPrint="* *"+"\n"+
                        "* *"+"\n"+
                        "";
            break;

            case 5:
                toPrint="* *"+"\n"+
                        " * "+"\n"+
                        "* *";
            break;

            case 6:
                toPrint="* *"+"\n"+
                        "* *"+"\n"+
                        "* *";
            break;

        }
        return toPrint;

    }
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String style="Modular";
        System.out.println("Enter your Style Choice to roll");
        System.out.println("0 - Modular");
        System.out.println("1 - Classico");
        System.out.println("2 - Metallica");
        System.out.println("9 - Normal Astrices");
        char in=sc.nextLine().charAt(0);
        while(in=='\''||in=='0'||in=='1'||in=='4'||in=='9')
        {
            switch(in){
                case '1':style="Classico";break;
                case '2':style="Metallica";
                case '9':print(roll());break;
                case 0:default:break;
            }
            if(in!='9'){
            System.out.println("");
            img(style);
            }
            System.out.println("");
            System.out.println("Enter ' to Roll Again OR any to terminate");
            in=sc.nextLine().charAt(0);
            if (in=='\'') {
            } else{
                sc.close();
                break;
            } 
        }
    }

}

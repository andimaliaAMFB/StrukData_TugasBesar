import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
public class GunakanTiket {
    public static Bioskop program = new Bioskop();
    public static BeliTiket buy = new BeliTiket();
    //public static void main(String[]args){
    public static void Use(){
        Scanner pilh = new Scanner(System.in);
        if(program.Tiket != null)
        {
            int plh = 0;
            ArrayList<String> Tiket = new ArrayList<String>();
            ArrayList<Integer>Erase = new ArrayList<Integer>(program.Erased);
            Collections.addAll(Tiket,program.Tiket);
            int i = 1;
            for(String arr: Tiket)
            {
                if(Tiket.get(i)!=null)
                    System.out.println(i+". "+Tiket.get(i));
                i++;
                if(Tiket.get(i)==null)
                    break;
            }
            System.out.println("Program.Erased: "+program.Erased);
            System.out.println("Erase         : "+Erase);
            String [] TiketUsed = new String[program.JumTiket];
            i=0;
            for(Integer ereser: Erase)
            {
                if(Erase.get(i)!=null)
                {
                    System.out.print(Erase.get(i)+", ");
                }
                i++;
                //if(Erase.get(i)==null)
                    //break;
            }
            System.out.println();
            /*for(int x=0;x<program.JumTiket;x++)
            {
                if(Erase.get(i)!=null)
                {
                    System.out.println(Erase.get(i));
                    if(Erase.get(i++)!=null)
                        i++;
                }
                    
                /*if(x==program.Erased.get(j))
                {
                    TiketUsed[x] = null;
                    j++;
                }
                else
                    TiketUsed[x] = Tiket.get(x+1);
            }*/
            do
            {
                System.out.println("0. Keluar dari Menu");
                System.out.print("Tiket Apa Yang Ingin Anda Gunakan?\n  :");
                plh = pilh.nextInt();
                if(plh==0)
                {
                    System.out.println("  >-Keluar Dari Menu-<");
                    break;
                }
                if(Tiket.get(plh)== null)
                    System.out.println("Maaf Tiket Tidak Bisa Digunakan");
                else
                    System.out.println("Tiket Digunakan");
            }while(Tiket.get(plh)== null);
            /*String [] TiketUsed = new String[program.JumTiket];
            System.out.println(program.JumTiket);
            for(int index=0;index<program.JumTiket;index++)
            {
                TiketUsed[index] = Tiket.get(index+1);
            }
            for(int index=0;index<program.JumTiket;index++)
            {
                if(index==plh)
                {
                    if(index<program.JumTiket-1)
                        TiketUsed[index] = TiketUsed[index+1];
                    else
                        TiketUsed[index] = null;
                    plh++;
                }
                if(TiketUsed[index]!=null)
                    System.out.println((index+1)+". "+TiketUsed[index]);
            }*/
            //program.Tiket = TiketUsed;
            i=0;
            boolean sama = false;
            for(Integer ereser: Erase)
            {
                if(Erase.get(i)==plh&&plh!=0)
                {
                    sama=true;
                    System.out.println("plh "+plh+" = "+Erase.get(i)+" Erase.get{"+i+")");
                    break;
                }
                i++;
            }
            if(plh!=0&&!sama)
            {
                Erase.add(plh);
                program.Erased = Erase;
            }
        }
    }
}
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
public class GunakanTiket {
    public static Bioskop program = new Bioskop();
    public static BeliTiket buy = new BeliTiket();
    //public static void main(String[]args){//just for self run
    public static void Use(){
        Scanner pilh = new Scanner(System.in);
        if(program.Tiket != null)
        {
            int plh = 0, i;
            ArrayList<String> Tiket = new ArrayList<String>();
            ArrayList<Integer>Erase = new ArrayList<Integer>(program.Erased);
            Collections.addAll(Tiket,program.Tiket);
            
            String [] TiketUsed = new String[program.JumTiket];
            System.out.println(program.JumTiket);
            for(i=0;i<program.JumTiket;i++)
            {
                TiketUsed[i] = Tiket.get(i+1);
                System.out.println((i+1)+". "+TiketUsed[i]);
            }
            //System.out.println("Program.Erased: "+program.Erased); << see array of number that get erase 
            //System.out.println("Erase         : "+Erase); << see array of number that get erase
            i=0;
            for(Integer ereser: Erase)
            {
                if(Erase.get(i)!=null)
                {
                    //System.out.print(Erase.get(i)+", ");<< number that get null
                    for(int x=0;x<=program.JumTiket;x++)
                    {
                        if(x==Erase.get(i)&&x!=0)
                        {
                            //System.out.println(TiketUsed[x-1]+" (null)");<<see if the data get null
                            TiketUsed[x-1]=null;
                        }
                    }
                }
                i++;
            }
            System.out.println();
            
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
                if(TiketUsed[plh-1]== null)
                    System.out.println("Maaf Tiket Tidak Bisa Digunakan");
                else
                    System.out.println("Tiket Digunakan");
            }while(TiketUsed[plh-1]== null);
            
            //mencegah yang dihapus agar tidak terhapus kembali
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
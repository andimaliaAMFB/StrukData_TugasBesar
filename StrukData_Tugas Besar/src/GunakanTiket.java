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
            int plh;
            ArrayList<String> Tiket = new ArrayList<String>();
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
            do
            {
                System.out.print("Tiket Apa Yang Ingin Anda Gunakan?\n  :");
                plh = pilh.nextInt()-1;
                if(Tiket.get(plh)== null)
                    System.out.println("Maaf Tiket Tidak Bisa Digunakan");
                else
                    System.out.println("Tiket Digunakan");
            }while(Tiket.get(plh)== null);
            String [] TiketUsed = new String[program.JumTiket];
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
            }
            program.JumTiket--;
            program.Tiket = TiketUsed;
        }
    }
}

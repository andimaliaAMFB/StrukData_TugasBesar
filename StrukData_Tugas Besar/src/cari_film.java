import java.util.Map;
import java.util.Scanner;
import java.util.Hashtable;
public class cari_film {
    public static Bioskop program = new Bioskop();
    //public static LihatFilm view = new LihatFilm();
    //public static void main(String[] args) {
    public static void Search(){
        String cari;
        Scanner search = new Scanner(System.in);
        System.out.println("sEnSItive CasE for input");
        System.out.print("Masukkan film yang akan dicari: ");
        cari = search.nextLine();
        
        program.View();//view all first
        
        int size = program.No_Film.size();
        String [] Keyarray = new String[size];
        for(int i = 0;i<size;i++)
        {
            Keyarray[i] = (String) program.No_Film.get(i+1);//now Hashtable, value Genre became array
        }
        int result = BinarySearch(Keyarray, cari, size);
        System.out.println("_____________________________________________________");
        if(result == -1)
            System.out.println("Judul Tidak Ditemukan");
        else
            System.out.println("Judul Ditemukan\n  "+cari+"\n  Genre: "+program.Film_Genre.get(cari));
    }
    static int BinarySearch(String [] Keyarray, String cari, int size){
        int first = 0, last = size - 1;
        while (first <= last) { 
            int m = first + (last - first) / 2; 
            int res = cari.compareTo(Keyarray[m]); 
  
            // Check if x is present at mid 
            if (res == 0) 
                return m; 
            // If x greater, ignore left half 
            if (res > 0) 
                first = m + first; 
            // If x is smaller, ignore right half 
            else
                last = m - first; 
        }
        return -1;
    }
}
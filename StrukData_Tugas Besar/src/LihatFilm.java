import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
public class LihatFilm {
    static String [] Genre = {"G1", "G2","G3"};
    static String [] Judul = {"T1", "T2", "T3"};
    public static Hashtable Film = new Hashtable();
    public static Hashtable NoFilm = new Hashtable();
    public static void FilmSorted(){
    //public static void main(String[]args){
        for(int i=0;i<Genre.length;i++)
        {
            Hashinput(Judul[i],Genre[i]);
        }
        
        int no = 1;
        //Film.put(Judul[0],Genre[0]);
        TreeMap<String, String> Sorted_film = new TreeMap(Film);
        for(Map.Entry<String,String> SF : Sorted_film.entrySet())
        {
            System.out.println(no+". "+SF.getKey()+"\n  Genre: "+SF.getValue());
            NoFilm.put(no,SF.getKey());
            no++;
        }
        
        //example output for Nofilm Hashtable
        //System.out.println(NoFilm.get(1));
    }
    public static void Hashinput(String jdl, String gnr){
        Film.put(jdl,gnr);
    }
}

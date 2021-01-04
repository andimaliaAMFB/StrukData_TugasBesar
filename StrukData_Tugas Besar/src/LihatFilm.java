import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
public class LihatFilm {
    static String [] Genre = {"Drama, CriminalDrama, Criminal", "Drama, Romance","Action, Adventure, SCI-FI"};
    static String [] Judul = {"The Shawshank Redemption", "Titanic", "Black Panther"};
    public static Hashtable Film = new Hashtable();
    public static Hashtable NoFilm = new Hashtable();
    public static void FilmSorted(){
        for(int i=0;i<Genre.length;i++)
        {
            Hashinput(Judul[i],Genre[i]);
        }
        int no = 1;
        //Film.put(Judul[0],Genre[0]);
        TreeMap<String, String> Sorted_film = new TreeMap(Film);
        for(Map.Entry<String,String> SF : Sorted_film.entrySet())
        {
            System.out.println(no+"."+SF.getKey()+"\n  Genre: "+SF.getValue());
            NoFilm.put(no,SF.getKey());
            no++;
        }
        
        //example output for Nofilm Hashtable
        //System.out.println(NoFilm.get(1));//bisa diganti 1,2,3...banyakfilm
    }
    public static void Hashinput(String jdl, String gnr){
        Film.put(jdl,gnr);
    }
}
import java.util.Scanner;
public class BeliTiket {
    public static void main(String[] args){
        BeliTiket beli = new BeliTiket();
        Bioskop program = new Bioskop();
        Scanner input = new Scanner(System.in);
        char YorN;
        
        //program start
        System.out.print("Punya Akun? [Y/N]\n  : ");
        YorN = input.next().charAt(0);
        if(YorN ==  'Y' || YorN == 'y')
        {
            if(program.Akun != null)
            {
                
            }
        }
    }
    //linkedlist Node
    public class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void Add(String data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
        Node current=head;
        int no = -1;
        if(head==null)
        {
            kosong();
        }
        while(current!=null)
        {
            no++;
            if(no!=0)
                System.out.println(no+". "+current.data);
            current=current.next;
        }
    }
    void kosong(){
        System.out.println("Data Kosong");
        return;
    }
}

public class MovieTicket {
    private String movie; private int seat; private double price;
    public MovieTicket(String m,int s,double p){movie=m;seat=s;price=p;}
    public void book(int s,double p){seat=s;price=p;}
    public void display(){System.out.println("Movie: "+movie+" | Seat: "+seat+" | Price: "+price);}
    public static void main(String[] args){
        MovieTicket t=new MovieTicket("Avengers",0,0);
        t.book(12,250); t.display();
    }
}


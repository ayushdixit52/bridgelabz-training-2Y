public class CartItem {
    private String item; private double price; private int qty;
    public CartItem(String i,double p,int q){item=i;price=p;qty=q;}
    public void add(int q){qty+=q;}
    public void remove(int q){qty=Math.max(0,qty-q);}
    public void display(){System.out.println(item+" | "+qty+" | Total: "+(price*qty));}
    public static void main(String[] args){
        CartItem c=new CartItem("Laptop",55000,1);
        c.display(); c.add(2); c.display(); c.remove(1); c.display();
    }
}


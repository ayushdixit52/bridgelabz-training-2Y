package Constructors;


    class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
            return true;
        } else {
            System.out.println(title + " is not available.");
            return false;
        }
    }

    public void display() {
        System.out.println(title + " by " + author + " | Price: " + price + " | Available: " + available);
    }
}


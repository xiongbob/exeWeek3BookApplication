public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //Default constructor
    public Book(){
        System.out.println("Default constructor is called");
    }

    //constructor
    public Book(String title, String author, String description, double price, boolean isInStock){
        setTitle(title);
        setAuthor(author);
        setDescription(description);
        setPrice(price);
        setIsInStock(isInStock);
        System.out.println("The constructor with five args is called");
    }

    public Book(String title, String author, String description){
        setTitle(title);
        setAuthor(author);
        setDescription(description);
        System.out.println("The constructor with three args is called");
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean getIsInStock(){
        return isInStock;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void setIsInStock(boolean newIsInStock){
        this.isInStock = newIsInStock;
    }

    public void getDisplayText(){
        System.out.println("The book title: " + this.title);
        System.out.println("The book author: " + this.author);
        System.out.println("The book description: " + this.description);
    }
}

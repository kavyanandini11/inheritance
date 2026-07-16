class Author{
    String name;
    String email;
    char gender;
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
}
class Book{
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
}
public class BookTest{
    public static void main(String[] args){
        Author a = new Author("kavya", "gorlakvya3@gmail.com", 'f');
        Book b = new Book("java",a,180.0,50);
        System.out.println("Book name:"+b.getName());
        System.out.println("Author name:"+b.getAuthor().getName());
        System.out.println("Author email:"+b.getAuthor().getEmail());
        System.out.println("Author gender:"+b.getAuthor().getGender());
        System.out.println("Book price:"+b.getPrice());
        System.out.println("Book quantity in stock:"+b.getQtyInStock());
 }
}

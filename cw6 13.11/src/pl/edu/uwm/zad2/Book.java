package pl.edu.uwm.zad2;

class Book {
    private String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    /*public Book(){

    }*/ // Taką konstrukcje mogę użyć w celu przypisania
    // przez this w ebook nie przypisze to klasy author
    // która jest protected

}

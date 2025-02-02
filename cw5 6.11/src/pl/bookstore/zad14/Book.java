package pl.bookstore.zad14;

 class Book {
     private String title;
     private String author;
     private int publicationYear;
     private String publisher;
     private int numberOfPages;

     public Book(String title, String author, int publicationYear, String publisher, int numberOfPages){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public void setPublicationYear(int publicationYear) {
         this.publicationYear = publicationYear;
     }

     public int getPublicationYear() {
         return publicationYear;
     }

     public void setPublisher(String publisher) {
         this.publisher = publisher;
     }

     public String getPublisher() {
         return publisher;
     }

     public void setNumberOfPages(int numberOfPages) {
         this.numberOfPages = numberOfPages;
     }

     public int getNumberOfPages() {
         return numberOfPages;
     }

     public void showInformation(){
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("PublicationYear: " + publicationYear);
         System.out.println("Publisher: " + publisher);
         System.out.println("numberOfPages: " + numberOfPages);
     }
 }

package education;

class Library {
    private String name;
    private String location;
    private int books;

    public Library(String name, String location, int books) {
        this.name = name == null || name.isEmpty() ? "Bibloteka Miejska": name;
        this.location = location == null || location.isEmpty() ? "ul. Wiedzy 123, 00-001 Miasteczko": location;
        this.books = books <= 0 ? 1000 : books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location != null && !location.isEmpty()){
            this.location = location;
        }
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
       if(books > 0){
           this.books = books;
       }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": Name: " + name + ". Location: " + location +". Number of books: " + books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        return location.equals(library.location);
    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }
    public void addBooks(int num){
        books += num;
        if(getBooks() > 5000){
            setBooks(5000);
        }
    }
    public static void checkBookCapacity(Library obj){
        System.out.println("Current number of books: " + obj.getBooks() + " is left up to the limit (5,000): " + (5000 - obj.books));
    }

}

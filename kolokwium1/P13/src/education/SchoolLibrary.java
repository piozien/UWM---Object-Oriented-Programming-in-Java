package education;

class SchoolLibrary extends Library {
    private String schoolType;
    private int librarians;

    public SchoolLibrary(String name, String location, int books, String schoolType, int librarians) {
        super(name, location, books);
        this.schoolType = schoolType == null || schoolType.isEmpty() ? "średnia" : schoolType;
        this.librarians = librarians <= 2 ? 3 : librarians;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        if (schoolType != null && !schoolType.isEmpty()) {
            this.schoolType = schoolType;
        }
    }

    public int getLibrarians() {
        return librarians;
    }

    public void setLibrarians(int librarians) {
        if (librarians > 2) {
            this.librarians = librarians;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ". School Type: " + schoolType + ". Number of librarians: " + librarians + ".";
    }

    public void addBooks(int number) {
        int booksadd = super.getBooks() + number;
        if (booksadd > 3000) {
            super.setBooks(3000);
        }
        else{
            super.setBooks(booksadd);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SchoolLibrary that = (SchoolLibrary) o;

        return schoolType.equals(that.schoolType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + schoolType.hashCode();
        return result;
    }
}

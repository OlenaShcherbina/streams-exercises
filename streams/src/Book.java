import java.util.List;

class Book {
    String title;
    List<Author> authors;

    // Constructor, getters, and setters

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }


}

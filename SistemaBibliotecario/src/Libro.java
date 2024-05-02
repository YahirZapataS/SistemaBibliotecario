public class Libro {
    private String title;
    private String author;
    private String genre;
    private int pubYear;
    private int dispCopies;

    public Libro(String title, String author, String genre, int pubYear, int dispCopies) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pubYear = pubYear;
        this.dispCopies = dispCopies;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getDispCopies() {
        return dispCopies;
    }

    public void setDispCopies(int dispCopies) {
        this.dispCopies = dispCopies;
    }
}

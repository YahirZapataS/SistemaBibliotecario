public class LibraryEntry {
    // título, autor, género, año de publicación, y cantidad de copias disponibles.

    private String title;
    private String autor;
    private String genre;
    private int pubYear;
    private int dispoCopies;

    public LibraryEntry(String title, String autor, String genre, int pubYear, int dispoCopies) {
        this.title = title;
        this.autor = autor;
        this.genre = genre;
        this.pubYear = pubYear;
        this.dispoCopies = dispoCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public int getDispoCopies() {
        return dispoCopies;
    }

    public void setDispoCopies(int dispoCopies) {
        this.dispoCopies = dispoCopies;
    }

    @Override
    public String toString() {
        return "Título: " + title + "\nAutor: " + autor + "\nGénero: " +
                genre + "\nAño de publicación: " + pubYear + "\nCopias disponibles: " + dispoCopies;
    }
}
import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    public Album(){    }
    public Album(String artist, String name, Date release_date, int sales, long id, String genre){
        this.genre=genre;
        this.id=id;
        this.artist=artist;
        this.name=name;
        this.release_date=release_date;
        this.sales=sales;
    }
    private String artist;
    private String name;
    private Date release_date;
    private String genre;
    private int sales;
    private long id;

    public void setArtist(String artist){
        this.artist=artist;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getName() {
        return name;
    }
    public Date getRelease_date() {
        return release_date;
    }
    public int getSales() {
        return sales;
    }
    public long getId() {
        return id;
    }
    public String getArtist() {
        return artist;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString(){
        return ("ID: " + id + " name: " + name + " release date: " + release_date + " artist: " + artist + " genre: " + genre + " sales: " + sales);
    }
}

import java.io.Serializable;

public class Quote implements Serializable {
    public Quote(){}
    public Quote(String authorFirstName, String authorLastName, String content, long id, long authorID){
        this.authorFirstName=authorFirstName;
        this.authorID=authorID;
        this.id=id;
        this.authorLastName=authorLastName;
        this.content=content;
    }
    private String authorFirstName;
    private String authorLastName;
    private String content;
    private long id;
    private long authorID;

    public void setId(long id) {
        this.id = id;
    }
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public void setAuthorID(long authorID) {
        this.authorID = authorID;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public long getAuthorID() {
        return authorID;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }
    public long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    public String toString(){
        return ("Quote: " + content + " ID: " + id + " author ID: " + authorID + " Author name: "+ authorFirstName + " " + authorLastName);
    }
}

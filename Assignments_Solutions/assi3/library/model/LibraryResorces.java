package library.model;

public class LibraryResorces{
    private int resourceId;
    private String title;
    private String author;
    static String libraryName = "Nalanda library";
    public static int counter=0;

    LibraryResorces(String title, String author){
        this.title=title;
        this.author=author;
        this.resourceId = counter++;
    }

    public String getTitle(){
        return title;
    }

    public void setTile(String title){
        this.title=title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;

    public int getResourceId(){
        return resourceId;
    }


    public abstract double calculateFine();
}
}
public library.model;

public class DigitalResorces extends LibraryResorces implements (String title, String author){
    super(title,author);
}

@override
public printable(){
    return getTitle();
}
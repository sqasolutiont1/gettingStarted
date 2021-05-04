package Examples.ooConcepts.encapsulation;

public class firstClass {
    private String URL = "http://www.cnn.com";
    private String newURL = "";

    public String getURL() {
        return URL + newURL;
    }

    public void setNewURL(String newURL) {
        this.newURL = newURL;
    }
}

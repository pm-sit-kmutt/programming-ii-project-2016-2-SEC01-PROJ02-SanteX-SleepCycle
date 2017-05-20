package sleepcycle.model;

public class Sound {
    
    private int id;
    private String path;

    public Sound() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Sound >> \nId : " + id 
                + "\nPath : " + path;
    }
    
    
}

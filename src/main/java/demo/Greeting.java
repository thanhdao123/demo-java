package demo;

public class Greeting {

    private final long id;
    private final String content;
    private final String message;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.message = "okok";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getMessage() {
        return message;
    }
}
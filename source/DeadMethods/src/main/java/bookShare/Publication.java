package bookShare;

public class Publication {
    protected String title;
    protected String type;
    protected PublicationStatus status;

    public Publication(String title, String type) {
        this.title = title;
        this.type = type;
        this.status = PublicationStatus.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PublicationStatus getStatus() {
        return status;
    }

    public void setStatus(PublicationStatus status) {
        this.status = status;
    }
}

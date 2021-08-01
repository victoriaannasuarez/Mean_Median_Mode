public class Email extends Document {

    private String email;
    private String sender;
    private String recipient;
    private String title;
    private Document document;

    public Email()
    {


    }
    public Email(String text) {
        super(text);
    }

    public Email(String text, String email, String sender, String recipient, String title, Document document) {
        super(text);
        this.email = email;
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTitle() {
        return title;
    }

    public Document getDocument() {
        return document;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + "\n" +
                " sender='" + sender + "\n" +
                " recipient='" + recipient + "\n" +
                " title='" + title + "\n" +
                " document=" + document +
                '}';
    }



}

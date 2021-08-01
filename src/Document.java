public class Document {
    private String text;


    public Document() {
    }

    public Document(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }
}

public class File extends Document {


    private String pathName;
    private Document document;


    public File(String pathName) {
        this.pathName = pathName;
    }

    public File(String text, String pathName) {
        super(text);
        this.pathName = pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    @Override
    public String toString() {
        return "File{" +
                "pathName='" + pathName + '\'' +
                '}';
    }
}

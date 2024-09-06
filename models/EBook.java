package models;

public class EBook extends Book {
    private int fileSize;

    public EBook(String title, String author, String isbn, boolean available, int fileSize) {
        super(title, author, isbn, available);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + ",File Size: " + fileSize + "MB";
    }

}

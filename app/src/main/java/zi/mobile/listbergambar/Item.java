package zi.mobile.listbergambar;

public class Item {
    private String imageUrl; // Ganti dari int ke String
    private String name;
    private String category;
    private String status;
    private String duration;

    // Constructor
    public Item(String imageUrl, String name, String category, String status, String duration) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.category = category;
        this.status = status;
        this.duration = duration;
    }

    public String getImageUrl() {
        return imageUrl; // Tambahkan getter untuk imageUrl
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public String getDuration() {
        return duration;
    }
}

package base.pkg.model;

public class ProductVariationModel {

    private long variationId;
    private String size;
    private String color;
    private String imageUrls;
    private double price;
    private int quantity;

    public long getVariationId() {return variationId;}
    public void setVariationId(long id) {this.variationId = id;}

    public String getSize() {return size;}
    public void setSize(String size) {this.size = size;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getImageUrls() {return imageUrls;}
    public void setImageUrls(String imageUrls) {this.imageUrls = imageUrls;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
}

class Product {
    String name;
    double price;
    boolean isAvailable;
    double rating;
    int reviewsNumber;
    // Constructor, getters, and setters


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.isAvailable = true;
        this.rating = 5.0;
        this.reviewsNumber = 0;
    }

    public Product(String name, double price, boolean isAvailable, double rating, int reviewsNumber) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.rating = rating;
        this.reviewsNumber = reviewsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getRating() {
        return rating;
    }

    public int getReviewsNumber() {
        return reviewsNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", rating=" + rating +
                ", reviewsNumber=" + reviewsNumber +
                '}';
    }
}

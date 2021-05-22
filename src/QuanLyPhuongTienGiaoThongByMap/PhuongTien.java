package QuanLyPhuongTienGiaoThongByMap;

public class PhuongTien {
    public String brand;
    public int year;
    public int price;
    public String color;

    public PhuongTien() {
    }

    public PhuongTien(String brand, int year, int price, String color) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "brand:'" + brand + '\'' +
                ", year:" + year +
                ", price:" + price +
                ", color:'" + color + '\'' +
                '}';
    }
}

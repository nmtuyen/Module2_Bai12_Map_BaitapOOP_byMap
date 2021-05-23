package QuanLyPhuongTienGiaoThongByMap;

public class Main {
    public static void main(String[] args) {
        QuanLyPhuongTien ql = new QuanLyPhuongTien();
        ql.add(1, new PhuongTien("Honda",2020,1500,"blue"));
        ql.add(2, new PhuongTien("Suzuki",2022,2000,"white"));
        ql.add(3, new PhuongTien("Honda",2018,1750,"gray"));
        ql.print();
        ql.edit(1,new PhuongTien("Yamaha",2019,1600,"yellow"));
        ql.print();
        ql.delete(5);
        ql.print();
    }
}

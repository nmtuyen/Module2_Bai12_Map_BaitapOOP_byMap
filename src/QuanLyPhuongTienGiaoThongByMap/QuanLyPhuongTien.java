package QuanLyPhuongTienGiaoThongByMap;

import QuanLyPhuongTienGiaoThongByMap.PhuongTien;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class QuanLyPhuongTien {
    Map<Integer, PhuongTien> phuongTienMap;

    public QuanLyPhuongTien(Map<Integer, PhuongTien> phuongTienMap) {
        this.phuongTienMap = phuongTienMap;
    }

    public QuanLyPhuongTien() {
        phuongTienMap = new HashMap<>();
    }
    public void add(Integer stt, PhuongTien phuongTien){
        phuongTienMap.put(stt,phuongTien);
    }
    public void print(){
        Set<Integer>keys = phuongTienMap.keySet();
        for (Integer key:keys) {
            System.out.println(phuongTienMap.get(key));
        }
        System.out.println("------------------------");
    }
    public boolean check(Integer key){
        if (phuongTienMap.containsKey(key)){
            return true;
        }return false;
    }
    public void edit(Integer key, PhuongTien phuongTien){
        if (check(key)){
            phuongTienMap.put(key,phuongTien);
        }else
            System.out.println("Không có thông tin phương tiện cần sửa");
    }
    public void delete(Integer key){
        if (check(key)){
            phuongTienMap.remove(key);
        }else
            System.out.println("Không có thông tin laptop cần xóa");
    }
}

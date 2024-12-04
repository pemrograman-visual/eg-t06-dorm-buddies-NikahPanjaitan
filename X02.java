// 12S24011 - Pedro simangunsong
// 12S24041- Nikah Suchia Panjaitan
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[6];
        int i;

        i = 0;
        inisialisasi(nama);
        func_input(nama);
        output(nama);
    }
    
    public static void inisialisasi(String[] nama) {
        nama[0] = " ";
        nama[1] = " ";
        nama[2] = " ";
        nama[3] = " ";
        nama[4] = " ";
        nama[5] = " ";
    }
    
    public static void func_input(int[] nama) {
        int i;

        for (i = 0; i <= 5; i++) {
            nama[i] = " ";
            while (i < 6) {
                nama[i] = input.nextInt();
                if (nama[i] == "---") {
                    i = 6;
                } else {
                    i = i + 1;
                }
            }
        }
    }
    
    public static void output(String[] nama) {
        int i;

        for (i = 0; i <= 5; i++) {
            if (nama[i].equals("---")) {
                i = 6;
            } else {
                System.out.println(nama[i]);
            }
        }
    }
}

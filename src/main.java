import java.util.Scanner;

import Utility.Menu;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        int pil;
        boolean aktif = true;
        System.out.println("==================== Program Mulai ====================");
        System.out.println("===== PERMAINAN KARTU 24 =====");
        while (aktif){
            System.out.println("MENU");
            System.out.println("1. INPUT KEYBOARD\n2. !RANDOM!\n3. Keluar");
            System.out.print("Pilihan: ");
            pil = scan.nextInt();
            if ((pil < 3) && pil > 0) {
                System.out.println("");
                menu.pilihan(pil);
                System.out.println("==================== SELESAI ====================");
            } else if (pil == 3) {
                aktif = false;
            } else {
                System.out.println();
                System.out.println("Masukan tidak sesuai!");
                System.out.println();
            }
        }
        System.out.println("==================== Program Tutup ====================");
        scan.close();
    }
}

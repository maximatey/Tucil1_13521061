package Utility;

import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
import Utility.IO;

public class Menu {
    public Menu() {}

    public void pilihan(int x) {
        Scanner scan = new Scanner(System.in);
        int i,pilsave;
        int count=0;
        double a,b,c,d;
        long start,finish,timeE;
        boolean kartuValid;
        switch (x) {
            case 1:
                count=0;
                kartuValid = true;
                a = scan.next().charAt(0);
                    if ((a > 49) && (a <58)) {
                        a = a-48;
                    }
                    else if (a==49) {
                        a = 10;
                    }
                    else if (a==65) {
                        a = 1;
                    }
                    else if (a==74) {
                        a = 11;
                    }
                    else if (a==81) {
                        a = 12;
                    }
                    else if (a==75) {
                        a = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    b = scan.next().charAt(0);
                    if ((b > 49) && (b <58)) {
                        b = b-48;
                    }
                    else if (b==49) {
                        b = 10;
                    }
                    else if (b==65) {
                        b = 1;
                    }
                    else if (b==74) {
                        b = 11;
                    }
                    else if (b==81) {
                        b = 12;
                    }
                    else if (b==75) {
                        b = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    c = scan.next().charAt(0);
                    if ((c > 49) && (c <58)) {
                        c = c-48;
                    }
                    else if (c==49) {
                        c = 10;
                    }
                    else if (c==65) {
                        c = 1;
                    }
                    else if (c==74) {
                        c = 11;
                    }
                    else if (c==81) {
                        c = 12;
                    }
                    else if (c==75) {
                        c = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    d = scan.next().charAt(0);
                    if ((d > 49) && (d < 58)) {
                        d = d-48;
                    }
                    else if (d==49) {
                        d = 10;
                    }
                    else if (d==65) {
                        d = 1;
                    }
                    else if (d==74) {
                        d = 11;
                    }
                    else if (d==81) {
                        d = 12;
                    }
                    else if (d==75) {
                        d = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    if (kartuValid == false) {
                        System.out.println("Masukan tidak sesuai!");
                    }
                while (kartuValid == false) {
                    kartuValid = true;
                    a = scan.next().charAt(0);
                    if ((a > 49) && (a <58)) {
                        a = a-48;
                    }
                    else if (a==49) {
                        a = 10;
                    }
                    else if (a==65) {
                        a = 1;
                    }
                    else if (a==74) {
                        a = 11;
                    }
                    else if (a==81) {
                        a = 12;
                    }
                    else if (a==75) {
                        a = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    b = scan.next().charAt(0);
                    if ((b > 49) && (b <58)) {
                        b = b-48;
                    }
                    else if (b==49) {
                        b = 10;
                    }
                    else if (b==65) {
                        b = 1;
                    }
                    else if (b==74) {
                        b = 11;
                    }
                    else if (b==81) {
                        b = 12;
                    }
                    else if (b==75) {
                        b = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    c = scan.next().charAt(0);
                    if ((c > 49) && (c <58)) {
                        c = c-48;
                    }
                    else if (c==49) {
                        c = 10;
                    }
                    else if (c==65) {
                        c = 1;
                    }
                    else if (c==74) {
                        c = 11;
                    }
                    else if (c==81) {
                        c = 12;
                    }
                    else if (c==75) {
                        c = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    d = scan.next().charAt(0);
                    if ((d > 49) && (d < 58)) {
                        d = d-48;
                    }
                    else if (d==49) {
                        d = 10;
                    }
                    else if (d==65) {
                        d = 1;
                    }
                    else if (d==74) {
                        d = 11;
                    }
                    else if (d==81) {
                        d = 12;
                    }
                    else if (d==75) {
                        d = 13;
                    }
                    else {
                        kartuValid = false;
                    }

                    if (kartuValid == false) {
                        System.out.println("Masukan tidak sesuai!");
                    }
                }

                Solver m = new Solver(1);
                m.isiArr(a,b,c,d);
                start = System.currentTimeMillis();
                m = m.solproc1();
                m = m.solproc2();
                m = m.solproc3();

                Solver n = new Solver(1);
                n.isiArr(a, b, c, d);
                n = n.solproc1();
                n = n.solproc2n2();
                n = n.solproc3n2();
                finish = System.currentTimeMillis();
                timeE = finish-start;

                System.out.println();

                for (i = 0; i<1536;i++) {
                    if (m.sols[i][0]==24) {
                        System.out.println(m.solstype[i]);
                        count++;
                    }
                }

                for (i = 0; i<1536;i++) {
                    if (n.sols[i][0]==24) {
                        System.out.println(n.solstype[i]);
                        count++;
                    }
                }

                if (count !=0) {
                    System.out.println("Banyaknya solusi adalah " + count);
                }
                else {
                    System.out.println("Tidak ada solusi yang ditemukan.");
                }

                System.out.println("Time Elapsed : " + timeE + " ms");

                System.out.println();

                System.out.println("Apakah ingin menyimpan solusi dalam file?\n1.Ya\n2.Tidak");
                System.out.print("Pilihan: ");

                pilsave = scan.nextInt();
                while ((pilsave<1)||(pilsave>2)) {
                    System.out.println("Masukan tidak sesuai!");
                    System.out.print("Pilihan: ");
                    pilsave = scan.nextInt();
                }

                if (pilsave == 1) {
                    String filename;
                    System.out.print("Masukkan nama file yang ingin dibuat (dalam .txt): ");
                    filename = scan.next();
                    IO.createFile(filename);
                    IO.outputFileSolusi(a,b,c,d,m,n, filename);
                }

                System.out.println();
                break;
            case 2:
                System.out.println("!!!RANDOM!!!");
                count = 0;
                int max = 13;
                int min = 1;
                a = Math.floor(Math.random() *(max - min + 1) + min);
                b = Math.floor(Math.random() *(max - min + 1) + min);
                c = Math.floor(Math.random() *(max - min + 1) + min);
                d = Math.floor(Math.random() *(max - min + 1) + min);

                System.out.println();
                System.out.println(a + " " + b + " " + c + " " + d);

                Solver q = new Solver(1);
                q.isiArr(a,b,c,d);
                start = System.currentTimeMillis();
                q = q.solproc1();
                q = q.solproc2();
                q = q.solproc3();

                Solver r = new Solver(1);
                r.isiArr(a, b, c, d);
                r = r.solproc1();
                r = r.solproc2n2();
                r = r.solproc3n2();
                finish = System.currentTimeMillis();
                timeE = finish-start;

                System.out.println();

                for (i = 0; i<1536;i++) {
                    if (q.sols[i][0]==24) {
                        System.out.println(q.solstype[i]);
                        count++;
                    }
                }

                for (i = 0; i<1536;i++) {
                    if (r.sols[i][0]==24) {
                        System.out.println(r.solstype[i]);
                        count++;
                    }
                }

                if (count !=0) {
                    System.out.println("Banyaknya solusi yang ditemukan adalah " + count);
                }
                else {
                    System.out.println("Tidak ada solusi yang ditemukan.");
                }

                System.out.println("Time Elapsed : " + timeE + " ms");

                System.out.println();

                System.out.println("Apakah ingin menyimpan solusi dalam file?\n1.Ya\n2.Tidak");
                System.out.print("Pilihan: ");

                pilsave = scan.nextInt();
                while ((pilsave<1)||(pilsave>2)) {
                    System.out.println("Masukan tidak sesuai!");
                    System.out.print("Pilihan: ");
                    pilsave = scan.nextInt();
                }

                if (pilsave == 1) {
                    String filename;
                    System.out.print("Masukkan nama file yang ingin dibuat (dalam .txt): ");
                    filename = scan.next();
                    IO.createFile(filename);
                    IO.outputFileSolusi(a,b,c,d,q,r, filename);
                }

                System.out.println();
                break;
        }
    }
}

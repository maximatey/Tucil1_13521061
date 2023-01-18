import java.util.Scanner;

import Utility.Solver;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c,d;
        a = scan. nextInt();
        b = scan. nextInt();
        c = scan. nextInt();
        d = scan. nextInt();
        Solver m = new Solver(1);
        m.isiArr(a,b,c,d);
        m = m.solproc1();
        m = m.solproc2();
        m = m.solproc3();
        for (int i = 0;i<1536;i++){
            if (m.sols[i][0]==24) {
                System.out.println(m.solstype[i]);
            }
        }
        scan.close();
    }
}

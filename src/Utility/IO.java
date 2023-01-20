package Utility;
 
import java.io.*;

import java.io.IOException;
public class IO {
  public static Double split(String f) {
    if (f.split("/").length == 1) {
      return Double.parseDouble(f);
    } else {
      return Double.parseDouble(f.split("/")[0]) / Double.parseDouble(f.split("/")[1]);
    }
  }
    public static void outputFileDouble(Double d, String nama){
      try {
        FileWriter write = new FileWriter("test/output/"+ "output_"+nama);
        write.write(Double.toString(d));
        write.close();

      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public static void createFile(String fname){
        try {
          File myObj = new File("test/" + fname);
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
      }
    }
    
    public static void outputFileSolusi(Double a, Double b, Double c, Double d, Solver p, Solver k, Solver q, Solver o, Solver l, String nama){
        int i,count=0;
        String s,aa,bb,cc,dd,sabcd;
        try {
            FileWriter write = new FileWriter("test/"+ nama);
            aa= Double.toString(a);
            bb= Double.toString(b);
            cc= Double.toString(c);
            dd= Double.toString(d);
            sabcd= aa + " " + bb + " " + cc + " " + dd;
            write.write(sabcd);
            write.write("\n");

            for (i = 0; i<1536;i++){
              if (p.sols[i][0]==24) {
                  write.write(p.solstype[i]);
                  write.write("\n");
                  count++;
              }
              if (k.sols[i][0]==24) {
                  write.write(k.solstype[i]);
                  write.write("\n");
                  count++;
              }
              if (q.sols[i][0]==24) {
                  write.write(q.solstype[i]);
                  write.write("\n");
                  count++;
              }
              if (o.sols[i][0]==24) {
                  write.write(o.solstype[i]);
                  write.write("\n");
                  count++;
              }
              if (l.sols[i][0]==24) {
                  write.write(l.solstype[i]);
                  write.write("\n");
                  count++;
              }
            }

            if (count==0) {
              write.write("Tidak ada solusi yang ditemukan.");
            }
            else {
                s= Integer.toString(count);
                write.write("Jumlah solusi yang ditemukan adalah " + s);
            }
            write.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
}

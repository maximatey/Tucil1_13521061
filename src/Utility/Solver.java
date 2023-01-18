package Utility;

public class Solver{
    public double[][] sols;
    public String[] solstype;

    public Solver(int n){
        switch (n) {
            case 1:
                this.sols = new double[24][4];
                this.solstype = new String[24];
                break;
            case 2:
                this.sols = new double[96][3];
                this.solstype = new String[96];
                break;
            case 3:
                this.sols = new double[384][2];
                this.solstype = new String[384];
                break;
            case 4:
                this.sols = new double[1536][1];
                this.solstype = new String[1536];
                break;
        }
    }

    public void isiArr(double a, double b, double c, double d){
        for(int i=0; i<24; i++){
            this.solstype[i] = "";
        }

        this.sols[0][0] = a;
        this.sols[0][1] = b;
        this.sols[0][2] = c;
        this.sols[0][3] = d;

        this.sols[1][0] = a;
        this.sols[1][1] = b;
        this.sols[1][2] = d;
        this.sols[1][3] = c;
        
        this.sols[2][0] = a;
        this.sols[2][1] = c;
        this.sols[2][2] = b;
        this.sols[2][3] = d;

        this.sols[3][0] = a;
        this.sols[3][1] = c;
        this.sols[3][2] = d;
        this.sols[3][3] = b;

        this.sols[4][0] = a;
        this.sols[4][1] = d;
        this.sols[4][2] = b;
        this.sols[4][3] = c;

        this.sols[5][0] = a;
        this.sols[5][1] = d;
        this.sols[5][2] = c;
        this.sols[5][3] = b;
        
        this.sols[6][0] = b;
        this.sols[6][1] = a;
        this.sols[6][2] = c;
        this.sols[6][3] = d;

        this.sols[7][0] = b;
        this.sols[7][1] = a;
        this.sols[7][2] = d;
        this.sols[7][3] = c;

        this.sols[8][0] = b;
        this.sols[8][1] = c;
        this.sols[8][2] = a;
        this.sols[8][3] = d;

        this.sols[9][0] = b;
        this.sols[9][1] = c;
        this.sols[9][2] = d;
        this.sols[9][3] = a;

        this.sols[10][0] = b;
        this.sols[10][1] = d;
        this.sols[10][2] = a;
        this.sols[10][3] = c;

        this.sols[11][0] = b;
        this.sols[11][1] = d;
        this.sols[11][2] = c;
        this.sols[11][3] = a;

        this.sols[12][0] = c;
        this.sols[12][1] = a;
        this.sols[12][2] = b;
        this.sols[12][3] = d;
        
        this.sols[13][0] = c;
        this.sols[13][1] = a;
        this.sols[13][2] = d;
        this.sols[13][3] = b;

        this.sols[14][0] = c;
        this.sols[14][1] = b;
        this.sols[14][2] = a;
        this.sols[14][3] = d;

        this.sols[15][0] = c;
        this.sols[15][1] = b;
        this.sols[15][2] = d;
        this.sols[15][3] = a;

        this.sols[16][0] = c;
        this.sols[16][1] = d;
        this.sols[16][2] = a;
        this.sols[16][3] = b;

        this.sols[17][0] = c;
        this.sols[17][1] = d;
        this.sols[17][2] = b;
        this.sols[17][3] = a;

        this.sols[18][0] = d;
        this.sols[18][1] = a;
        this.sols[18][2] = b;
        this.sols[18][3] = c;

        this.sols[19][0] = d;
        this.sols[19][1] = a;
        this.sols[19][2] = c;
        this.sols[19][3] = b;

        this.sols[20][0] = d;
        this.sols[20][1] = b;
        this.sols[20][2] = a;
        this.sols[20][3] = c;

        this.sols[21][0] = d;
        this.sols[21][1] = b;
        this.sols[21][2] = c;
        this.sols[21][3] = a;

        this.sols[22][0] = d;
        this.sols[22][1] = c;
        this.sols[22][2] = a;
        this.sols[22][3] = b;

        this.sols[23][0] = d;
        this.sols[23][1] = c;
        this.sols[23][2] = b;
        this.sols[23][3] = a;
    }

    public Solver solproc1(){
        Solver mtemp;
        mtemp = new Solver(2);
        for (int i = 0; i<24; i++){
            mtemp.sols[4*i][0] = this.sols[i][0]+this.sols[i][1];
            mtemp.sols[4*i][1] = this.sols[i][2];
            mtemp.sols[4*i][2] = this.sols[i][3];
            mtemp.solstype[4*i] = "(" +  this.sols[i][0] + " + " + this.sols[i][1] +")";

            mtemp.sols[4*i+1][0] = this.sols[i][0]-this.sols[i][1];
            mtemp.sols[4*i+1][1] = this.sols[i][2];
            mtemp.sols[4*i+1][2] = this.sols[i][3];
            mtemp.solstype[4*i+1] = "(" +  this.sols[i][0] + " - " + this.sols[i][1] +")";

            mtemp.sols[4*i+2][0] = this.sols[i][0]*this.sols[i][1];
            mtemp.sols[4*i+2][1] = this.sols[i][2];
            mtemp.sols[4*i+2][2] = this.sols[i][3];
            mtemp.solstype[4*i+2] = "(" +  this.sols[i][0] + " * " + this.sols[i][1] +")";

            mtemp.sols[4*i+3][0] = this.sols[i][0]/this.sols[i][1];
            mtemp.sols[4*i+3][1] = this.sols[i][2];
            mtemp.sols[4*i+3][2] = this.sols[i][3];
            mtemp.solstype[4*i+3] = "(" +  this.sols[i][0] + " / " + this.sols[i][1] +")";
        }
        return mtemp;
    }

    public Solver solproc2(){
        Solver mtemp;
        mtemp = new Solver(3);
        for (int i = 0; i<96; i++){
            mtemp.sols[4*i][0] = this.sols[i][0]+this.sols[i][1];
            mtemp.sols[4*i][1] = this.sols[i][2];
            mtemp.solstype[4*i] = "(" +  this.solstype[i] + " + " + this.sols[i][1] +")";

            mtemp.sols[4*i+1][0] = this.sols[i][0]-this.sols[i][1];
            mtemp.sols[4*i+1][1] = this.sols[i][2];
            mtemp.solstype[4*i+1] = "(" +  this.solstype[i] + " - " + this.sols[i][1] +")";

            mtemp.sols[4*i+2][0] = this.sols[i][0]*this.sols[i][1];
            mtemp.sols[4*i+2][1] = this.sols[i][2];
            mtemp.solstype[4*i+2] = "(" +  this.solstype[i] + " * " + this.sols[i][1] +")";

            mtemp.sols[4*i+3][0] = this.sols[i][0]/this.sols[i][1];
            mtemp.sols[4*i+3][1] = this.sols[i][2];
            mtemp.solstype[4*i+3] = "(" +  this.solstype[i] + " / " + this.sols[i][1] +")";
        }
        return mtemp;
    }

    public Solver solproc3(){
        Solver mtemp;
        mtemp = new Solver(4);
        for (int i = 0; i<384; i++){
            mtemp.sols[4*i][0] = this.sols[i][0]+this.sols[i][1];
            mtemp.solstype[4*i] = "(" +  this.solstype[i] + " + " + this.sols[i][1] +")";

            mtemp.sols[4*i+1][0] = this.sols[i][0]-this.sols[i][1];
            mtemp.solstype[4*i+1] = "(" +  this.solstype[i] + " - " + this.sols[i][1] +")";

            mtemp.sols[4*i+2][0] = this.sols[i][0]*this.sols[i][1];
            mtemp.solstype[4*i+2] = "(" +  this.solstype[i] + " * " + this.sols[i][1] +")";

            mtemp.sols[4*i+3][0] = this.sols[i][0]/this.sols[i][1];
            mtemp.solstype[4*i+3] = "(" +  this.solstype[i] + " / " + this.sols[i][1] +")";
        }
        return mtemp;
    }

    public void displayL(){
        for (int i =0; i<1536;i++){
            System.out.print("[");
            for (int j=0;j<1;j++) {
                System.out.print(this.sols[i][j]);
                System.out.print(",");
            }
            System.out.print("]\n");
        }
    }
}

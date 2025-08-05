import java.util.Scanner;

class java {
    public void javadeveloper(){
        String array[][]=new String [5][51];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "   ";
            }
        }
        // (your array assignments stay exactly the same)
        //J
        array[0][0] = "__ ";
        array[0][1] = "__ ";
        array[0][2] = "__ ";
        array[1][0] = "   ";
        array[1][1] = " | ";
        array[1][2] = "   ";
        array[2][0] = " \\ ";
        array[2][1] = " | ";
        array[2][2] = "   ";
        //A
        int startCol = 4;
        array[0][startCol + 0] = "   ";
        array[0][startCol + 1] = "/  ";
        array[0][startCol + 2] = "\\  ";

        array[1][startCol + 0] = "/  ";
        array[1][startCol + 1] = "   ";
        array[1][startCol + 2] = "\\  ";

        array[2][startCol + 0] = "|  ";
        array[2][startCol + 1] = "_  ";
        array[2][startCol + 2] = "|  ";

        array[3][startCol + 0] = "|  ";
        array[3][startCol + 1] = "   ";
        array[3][startCol + 2] = "|  ";

        array[4][startCol + 0] = "|  ";
        array[4][startCol + 1] = "   ";
        array[4][startCol + 2] = "|  ";
        // V
        int z=8;
        array[0][z+0] = "\\  ";
        array[0][z+1] = "   ";
        array[0][z+2] = "/  ";

        array[1][z+0] = "   ";
        array[1][z+1] = "\\  ";
        array[1][z+2] = "/  ";

        array[2][z+0] = "   ";
        array[2][z+1] = "/  ";
        array[2][z+2] = "   ";
//A
        int a=12;
        array[0][a + 0] = "   ";
        array[0][a + 1] = "/  ";
        array[0][a + 2] = "\\  ";

        array[1][a + 0] = "/  ";
        array[1][a + 1] = "   ";
        array[1][a + 2] = "\\  ";

        array[2][a + 0] = "|  ";
        array[2][a + 1] = "_  ";
        array[2][a + 2] = "|  ";

        array[3][a + 0] = "|  ";
        array[3][a + 1] = "   ";
        array[3][a + 2] = "|  ";

        array[4][a + 0] = "|  ";
        array[4][a + 1] = "   ";
        array[4][a + 2] = "|  ";
        // D
        int d=16;
        array[0][d+0] = "|  ";
        array[0][d+1] = "\\  ";
        array[0][d+2] = "   ";
        array[1][d+0] = "|  ";
        array[1][d+1] = "/  ";
        array[1][d+2] = "   ";
        array[2][d+0] = "|/ ";
        array[2][d+1] = "   ";
        array[2][d+2] = "   ";
        // E
        int e=20;
        array[0][e+0] = "|  ";
        array[0][e+1] = "-- ";
        array[0][e+2] = "   ";
        array[1][e+0] = "|  ";
        array[1][e+1] = "-- ";
        array[1][e+2] = "   ";
        array[2][e+0] = "|  ";
        array[2][e+1] = "-- ";
        array[2][e+2] = "   ";
        //V
        int  z1=24;
        array[0][z1+0] = "\\  ";
        array[0][z1+1] = "   ";
        array[0][z1+2] = "/  ";

        array[1][z1+0] = "   ";
        array[1][z1+1] = "\\  ";
        array[1][z1+2] = "/  ";

        array[2][z1+0] = "   ";
        array[2][z1+1] = "/  ";
        array[2][z1+2] = "   ";
        //E DEVE
        int e1=28;
        array[0][e1+0] = "|  ";
        array[0][e1+1] = "-- ";
        array[0][e1+2] = "   ";
        array[1][e1+0] = "|  ";
        array[1][e1+1] = "-- ";
        array[1][e1+2] = "   ";
        array[2][e1+0] = "|  ";
        array[2][e1+1] = "-- ";
        array[2][e1+2] = "   ";
        //L
        int l=32;
        array[0][l+0] = "|  ";
        array[0][l+1] = "   ";
        array[0][l+2] = "   ";
        array[1][l+0] = "|  ";
        array[1][l+1] = "   ";
        array[1][l+2] = "   ";
        array[2][l+0] = "|  ";
        array[2][l+1] = "---";
        array[2][l+2] = "   ";
//O
        int o=36;
        array[0][o+0] = "   ";
        array[0][o+1] = "___";
        array[0][o+2] = "   ";

        array[1][o+0] = "!  ";
        array[1][o+1] = "   ";
        array[1][o+2] = "!  ";

        array[2][o+0] = "!  ";
        array[2][o+1] = "   ";
        array[2][o+2] = "!  ";

        array[3][o+0] = "!  ";
        array[3][o+1] = "   ";
        array[3][o+2] = "!  ";

        array[4][o+0] = "   ";
        array[4][o+1] = "‾‾‾";
        array[4][o+2] = "   ";
        //P
        int p=40;
        array[0][p+0] = "!  ";
        array[0][p+1] = "___";
        array[0][p+2] = "   ";

        array[1][p+0] = "!  ";
        array[1][p+1] = "   ";
        array[1][p+2] = "!  ";

        array[2][p+0] = "!  ";
        array[2][p+1] = "___";
        array[2][p+2] = "   ";

        array[3][p+0] = "!  ";
        array[3][p+1] = "   ";
        array[3][p+2] = "   ";

        array[4][p+0] = "!  ";
        array[4][p+1] = "   ";
        array[4][p+2] = "   ";
        //E
        int e2=44;
        array[0][e2+0] = "|  ";
        array[0][e2+1] = "-- ";
        array[0][e2+2] = "   ";
        array[1][e2+0] = "|  ";
        array[1][e2+1] = "-- ";
        array[1][e2+2] = "   ";
        array[2][e2+0] = "|  ";
        array[2][e2+1] = "-- ";
        array[2][e2+2] = "   ";
        //R
        int r=48;
        array[0][r+0] = "|  ";  array[0][r+1] = "|  ";  array[0][r+2] = "|  ";
        // Row 1
        array[1][r+0] = "|  ";  array[1][r+1] = "   ";  array[1][r+2] = "|  ";
        // Row 2
        array[2][r+0] = "|  ";  array[2][r+1] = "|  ";  array[2][r+2] = "|  ";
        // Row 3
        array[3][r+0] = "|  ";  array[3][r+1] = "|  ";  array[3][r+2] = "   ";
        // Row 4
        array[4][r+0] = "|  ";  array[4][r+1] = "   ";  array[4][r+2] = "|  ";

        // Print with one extra space after every 3 cells to separate characters
        for(int i=0;i<5;i++){
            for (int j = 0; j <51 ; j++) {
                System.out.print(array[i][j]);
                // after every character block of width 3, print a space
                if ((j+1) % 3 == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            // pause 500 milliseconds after printing each row
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }}
public class Java_Developer{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("WHO I M ?");
        a = sc.nextLine();
        System.out.println("WRONG");
        java jv = new java();
        jv.javadeveloper();
    }

}

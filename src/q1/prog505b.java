package q1;

import java.io.*;
import java.util.*;

public class prog505b {
    public static double testAverage(int index, String[][] enter) {
        double average = 0;
        for (int x=0;x<3;x++){
            average += Double.parseDouble(enter[x][index+2]);
        }
        average=average/3;
        average = (double)((int)(average*100))/100;
        return average;
    }
    
    public static void main(String[] args) {
        try {
            Scanner datas = new Scanner(new File("Langdat/prog505b.dat"));
            String[][] info = new String[3][9];
            int[] grades = new int[5];
            String[] lettergrade = new String[5];
            lettergrade[0]="A";
            lettergrade[1]="B";
            lettergrade[2]="C";
            lettergrade[3]="D";
            lettergrade[4]="F";

            while (datas.hasNextLine()) {
                for (int x = 0; x < 3; x++) {
                    double temp = 0;
                    for (int y = 0; y < 7; y++) {
                        info[x][y] = datas.nextLine().toString();
                        System.out.print(info[x][y] + " ");
                        if (y > 1) {
                            temp += Integer.parseInt(info[x][y]);
                        }

                    }
                    temp = temp / 5;
                    info[x][7] = "" + temp;

                    if (Double.parseDouble(info[x][7]) <= 60) {
                        info[x][8] = "F";
                        grades[4]++;
                    } else if (Double.parseDouble(info[x][7]) <= 70) {
                        info[x][8] = "D";
                        grades[3]++;
                    } else if (Double.parseDouble(info[x][7]) <= 80) {
                        info[x][8] = "C";
                        grades[2]++;
                    } else if (Double.parseDouble(info[x][7]) <= 90) {
                        info[x][8] = "B";
                        grades[1]++;
                    } else {
                        info[x][8] = "A";
                        grades[0]++;
                    }

                    System.out.println("   "+info[x][7] + " " + info[x][8]);
                }
            }
            System.out.println();
            for (int x = 0; x < 5; x++){
                if(testAverage(x, info)%1==0){
                System.out.println("Test"+(x+1)+": "+(int)testAverage(x, info)+"        "+lettergrade[x]+" "+grades[x]);
                } else{
                System.out.println("Test"+(x+1)+": "+testAverage(x, info)+"     "+lettergrade[x]+" "+grades[x]);
                }
                
            }
            datas.close();
            

        } catch (

        Exception e) {
            System.out.println(e);
        }
    }
}
/*
Sam Lilly 80 77 82 86 90    83.0 B
Fred Biggie 70 72 88 90 93    82.6 B
Sally Awesome 92 91 85 99 93    92.0 A

Test1: 80.66     A 1
Test2: 80        B 2
Test3: 85        C 0
Test4: 91.66     D 0
 */
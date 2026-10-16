package q1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class prog705x {
    public static String findHiddenLetter(int[] code, ArrayList<String> poem){
        String result;
        result = poem.get(code[0]-1);
        String[] words = result.split(" ");
        result = words[code[1]-1];
        result = result.substring(code[2]-1,code[2] );
        return result;
    }
    public static void main(String[] args) {
        try {
            Scanner datas = new Scanner(new File("Langdat/prog705x.txt"));
            Scanner poem = new Scanner(new File("Langdat/prog512h.dat"));
            ArrayList<String> numbers = new ArrayList<>();
            ArrayList<String> pome = new ArrayList<>();
            while (datas.hasNextLine()) {
                numbers.add(datas.nextLine());
            }
            while (poem.hasNextLine()) {
                pome.add(poem.nextLine());
            }
            System.out.println();
            for (int x =0; x<numbers.size();x++){
                int[] split= new int[3];
                String temp=numbers.get(x);
                
                split[0]=Integer.parseInt(temp.substring(0, 2));
                split[1]=Integer.parseInt(temp.substring(2, 3));
                split[2]=Integer.parseInt(temp.substring(3));
                System.out.print(findHiddenLetter(split, pome)+"");  
                
            }
            System.out.println();

            datas.close();
            poem.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

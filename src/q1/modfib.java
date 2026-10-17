package q1;


public class modfib {
    public static int modfibonacci(int in) {
        if (in == 1) {
            return 3;
        } else if(in == 2){
            return 5;
        } else if (in == 3){
            return 8;
        }else{
            return (modfibonacci(in-1)+modfibonacci(in-2)+modfibonacci(in-3));
        }
    }

    public static void main(String[] args) {
        
    }
}

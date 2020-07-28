public class Ex02Operatori {
    public static void main(String [] args){
        int x = 10;
        int y = 20;
        
        boolean b1 = (x == (y-10));
        System.out.println(b1);
        
        int w = ((x+y)*10+3)*x;
        System.out.print(w);
    }
}
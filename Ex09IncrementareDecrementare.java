public class Ex09IncrementareDecrementare{
    public static void main(String [] args){
        int x=10;
        int y=5;
        
        y = x++ + 5;
        System.out.println(x);
        System.out.println(y);
        
        y = ++x + 5;
        System.out.println(x);
        System.out.println(y);
        
        x = ++x + 5;
        System.out.println(x);
        
        x = x++ + 5;
        System.out.println(x);
    }
}
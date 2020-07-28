public class Ex08OperatoriTernarElvis{
    public static void main (String [] args){
        int x=10;
        int y=20;
        int z;
        
        z= x>y?100:200;
        System.out.println(z);
        
        z= x>y?100:y<400?60:40;
        System.out.println(z);
    }
}
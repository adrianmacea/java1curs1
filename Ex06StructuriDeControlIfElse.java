public class Ex06StructuriDeControlIfElse{
    public static void main(String [] args){
        int h1=10,m1=30,s1=45;
        int h2=20,m2=30,s2=30;
        
        if(s1+s2 >= 60){
            s1 = s1+s2-60;
            m1 = m1+1;
        }else{
            s1 = s1+s2;
        }
        
        if(m1+m2 >= 60){
            m1 = m1+m2-60;
            h1 = h1+1;
        }else{
            m1=m1+m2;
        }
        
        h1 = h1+h2;
        
        System.out.print(h1+" "+m1+" "+s1);
    }
}
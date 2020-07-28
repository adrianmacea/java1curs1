/**
 * Aceasta este ultima clasa a cursului.
 * @author John Doe
 * @version 1.1
 */
public class Ex12StructuriDeControlForSiComments{
    /**
     * Metoda principala a acestei clase.
     */
    public static void main(String [] args){
        for(int i=1;i<11;i++){// un for are 3 parti separate de gilimele (in paranteze)
            System.out.println(i);
        }
        /*
         * Acesta este
         * un comentariu 
         * pe mai multe linii
         */
        int i=1;
        for (;i<11;i++){
            /*
             * Urmeaza
             * o afisare
             */
            System.out.println(i);
        }
        
        i=1;
        for(;i<11;){
            System.out.println(i);
            i++;
        }
        
        i=1;
        for(;;){
            System.out.println(i);
            i++;
            if (i==11) break;
        }
        
        for(int j=0,k=10;j<k;j++,k-=2){
            System.out.println(j=k);
        }
    }
}
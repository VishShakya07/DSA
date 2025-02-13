import java.util.Arrays;
public class Minus {
    public static void main(String[] args) {
        int[] A  = {1,3,6,8,11,12,16,28,32};
        int[] A_minus_1 = {1,3,6,8,12,16,28,32};

        findMissingElement(A, A_minus_1);

        
    }
    public static void findMissingElement(int[]A, int[]A_minus_1) {
    for(int i=0; i<A.length; i++){
        boolean found = false;
        for(int j=0; j<A_minus_1.length; j++){
            
            if(A[i] == A_minus_1[j]) {
                 found = true;
                 break;
            }
        }
        if(!found) {
            System.out.println("The missing element is: "+A[i]);
            return;
        }
    }
    }
}
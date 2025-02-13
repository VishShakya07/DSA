import java.util.*;
public class OddEven{
public static void main(String[] args) {
int arr[] = {4,6,10,8,12,3,5,7,9,11};
int firstodd = -1;
int lasteven = -1;
for(int i=0; i<arr.length-1; i++){
    if(arr[i] % 2 != 0 && firstodd == -1) {
        firstodd = arr[i];
    }
    if(arr[i] % 2 == 0) {
        lasteven = arr[i];
    }
}
if(firstodd != -1) {
    System.out.println("Firstodd "+firstodd);
} else {
    System.out.println("no odd Number found");
}
if(lasteven != -1) {
    System.out.println("Lasteven "+lasteven);
}else {
    System.out.println("no even Number found");
}
}
}
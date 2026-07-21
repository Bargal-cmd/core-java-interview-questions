

public class ArrayPratice {
   static  int searchElement(int num){
    System.out.println("hello");
        int[] arr= {2,34,5,6,7,3};
        for(int i=0; i<arr.length;i++){
            if(num==arr[i]){
                return i;
            }
         
        }
        return -1;
        
     }

     public static void main(String[] args) {
       System.out.println( searchElement(89));
    }
    
}

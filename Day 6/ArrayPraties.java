

public class ArrayPraties {

 int findSecondLargestNo(int arr[]){
int Flarge=arr[0];
int Slarge=Integer.MIN_VALUE;
//{23,45,56,45,2,3,5,67,89,75,75,89}

   for (int i = 0; i < arr.length; i++) {
    if(arr[i]>Flarge){
        Slarge=Flarge;
        Flarge=arr[i];


    }else if(arr[i]>Slarge && Flarge!=Slarge){
        Slarge=arr[i];
    }
    
   }
return 9;
 }
    public static void main(String[] args) {
        int arr[]={23,45,56,45,2,3,5,67,89};
    }
    
}

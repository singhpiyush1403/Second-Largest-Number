public class Main{
    public static void main(String args[]){
        int [] a = {2,4,6,7,8,3,5};
        int temp;
        for(int i=0; i<a.length; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i]< a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        // for(int i=0; i<a.length; i++){
        // System.out.print(a[i]+" ");
        System.out.print("second largest element number is " + a[1]);
    }
    }




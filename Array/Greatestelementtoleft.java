public class Greatestelementtoleft {

    public static void greatestelemntleft(int arr[]){
        int n=arr.length;
        for(int i=0; i<n;i++){
            int f=0;
            for(int j=i-1; j>=0; j--){
                if(arr[i]<arr[j]){
                    System.out.println(arr[j]);
                    f++;
                    break;
                    
                }
               
            }
            if(f==0){
                System.out.println("-1");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,3,5,2,9,7,8,11};
        greatestelemntleft(arr);



        
    }
    
}

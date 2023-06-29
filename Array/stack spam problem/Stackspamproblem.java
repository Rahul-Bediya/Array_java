public class Stackspamproblem {

    public static void stackspam(int arr[]){
        int n=arr.length;

        System.out.println("span of each stock for each day");

        for(int i=0; i<n; i++){
            int c=1;
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    c++;
                }
                else{
                    break;
                }
            }
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,23,6,34,5,23,3,4,2,7,5};
        stackspam(arr);
        
    }
    
}

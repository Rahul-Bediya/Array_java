int print2largest(int arr[], int n) {
        // code here
         int max = Integer.MIN_VALUE;
                 int secondMax = Integer.MIN_VALUE;
                 
                for(int i = 0; i<n ; i++){
                    
                    if(arr[i]>max)
                    {
                        secondMax = max;
                        max = arr[i];
                    }
                    if(arr[i] > secondMax && arr[i] !=max ){
                        secondMax = arr[i];
                    }
                }
                
                if (secondMax == Integer.MIN_VALUE) {
            return -1; // Or any appropriate value indicating no second largest element
        }

                
                return secondMax;
    }

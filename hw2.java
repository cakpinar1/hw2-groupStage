package hw2;


public class hw2 
{
    public static void main(String[] args) {
        int[] arr = new int [5];
    
        for(int i=0; i<arr.length; i++){
            int x = (int) ( Math.random() * 100 );
            arr[i] = x;
        }   
        
        for(int i=0; i<arr.length; i++){
            if( i== 0)
            {
                System.out.print( "{" + arr[i] + ", " );
            }
            else if ( i== arr.length-1 )
            {
                System.out.print( arr[i] + "}");
            }
            else
            System.out.print(arr[i] + ", ");

        }
        
         String op;
            do
            {
                System.out.println ( "" );
                System.out.println ( "1- Find the minimum and the maximum of the array" );
                System.out.println ( "2- Find the average of the array" );
                System.out.println ( "3- Find the sum of elements with odd- and even-numbered indexes" );
                System.out.println ( "4- Exit" );
                System.out.println ( "" );

                System.out.print( "Select an operation: " );
                op = in.next();

                if ( op.equals("1") )
                {
                    public int findMin(int[] list){
                       int minArray = 100;
                       for(int i=0; i<list.length; i++){
                           if(list[i]<minArray){
                           minArray = list[i];
                           }
                       }
                    return minArray;
                    }
                    public int findMax(int[] list){
                        int maxArray = 0;
                        for(int i=0; i<list.length; i++){
                            if(list[i]>maxArray){
                            maxArray = list[i];
                            }
                        }
                    return maxArray;
                    }
                }
                else if ( op.equals("2") )
                {
                    public static int[] average(int[] arr) {
                        int sum = 0;
                        int avg = 0;
                        int[] output = new int[arr.length];

                        for (int i = 0; i < arr.length; i++){
                            sum += arr[i];
                        }
                        avg = sum/arr.length;

                        for (int j = 0; j < arr.length; j++) {
                             output[j] = (arr[j] - avg);
                        }
                        return output;
                        
                        for(int i=0; i<output.length; i++){
                            if( i== 0)
                            {
                                System.out.print( "{" + output[i] + ", " );
                               }
                            else if ( i== output.length-1 )
                            {
                                System.out.print( output[i] + "}");
                               }
                            else
                                System.out.print(output[i] + ", ");

                            }
       
    }
    
                }
                else if ( op.equals("3") )
                {
                    int sumOdd=0;
                    int sumEven=0;

                        public int sumOddIndx(int[]list){

                            for(int i=0;i<list.length;i++ ){
                                if(i%2!=0){
                                    sumOdd=sumOdd+list[i];
                                }
                            }
                            return sumOdd;
                        }

                        public int sumEvenIndx(int[]list){

                            for(int i=0;i<list.length;i++ ){
                                if(i%2==0){
                                    sumEven=sumEven+list[i];
                                }
                            }
                            return sumEven;                         
                        }
                    System.out.println("sum of Odd indexes:"+sumOdd);
                     System.out.println("sum of Even indexes:"+sumEven);
                }


            } while( !(op.equals("4")));
            
    }
    
}

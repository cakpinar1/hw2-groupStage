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

                }
                else if ( op.equals("2") )
                {

                }
                else if ( op.equals("3") )
                {

                }


            } while( !(op.equals("4")));
            
    }
    
}

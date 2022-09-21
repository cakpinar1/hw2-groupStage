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
    }
    
}

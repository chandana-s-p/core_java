class TernaryOperatorAssignment{
public static void main(String[] args){
   int a=50;
   int b=100;
   int c=150;
   int result = c > (a > b ? a : b) ? c : (( a > b ) ? a : b );
   int result1 = c < (a < b ? a : b) ? c : (( a < b ) ? a : b );
System.out.println(" largest of " +a+ " & " +b+ " & " +c+ " is : "+result);
System.out.println(" smallest of " +a+ " & " +b+ " & " +c+ " is : "+result1);
}
}
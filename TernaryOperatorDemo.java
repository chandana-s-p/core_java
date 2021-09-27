class TernaryOperatorDemo{
public static void main(String[] args){
   int x=100;
   int y=200;
   int result = x > y ? x : y;
   int result1 = x < y ? x : y;
System.out.println(" largest of " +x+ " & " +y+ " is : "+result);
System.out.println(" smallest of " +x+ " & " +y+ " is : "+result1);
}
}
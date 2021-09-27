class NestedTernaryOperatorAssignment{
public static void main(String[] args){
  int a=100;
  int b=60;
  int c=200;
  int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
System.out.println(" Largest Number : " +largest);
}
}

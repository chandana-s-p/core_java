class LogicalOperatorAssignment1{
public static void main(String[] args){
  int x=200;
  int y=50;
  int z=100;
System.out.println(x>y && y>z);
System.out.println(z>y && z<x);
System.out.println((y+200)<x && (y+150)<z );
System.out.println(x==y || x>z);
System.out.println(y==z || z==x);
}
}
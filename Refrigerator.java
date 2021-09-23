class Refrigerator{
     String name;
     int cost;
     String color;
     int temp;
     
void keepTheFoodCold(){
   System.out.println("If temperature is " +temp+ "food that is properly handled and stored...");
}

void speedChilling(){
   System.out.println(name +"refrigerator is good for speed chilling");
}

public static void main(String[] args){
  Refrigerator r=new Refrigerator();
  r.name="LG";
  r.temp=5;
  r.color="SILVER";

  r.keepTheFoodCold();
  r.speedChilling();
}
}
class Cycle{
     int speed;
     int cost;
     String color;
     int gear;
     void speedUp(){
     System.out.println("SPEED:"+speed);
     }
     void changeGear(){
     System.out.println("GEAR:"+gear);
     }
public static void main(String[] args){
  Cycle c=new Cycle();
  c.speed=40;
  c.cost=10000;
  c.color="BLUE";
  c.gear=2;

  c.speedUp();
  c.changeGear();
}
}
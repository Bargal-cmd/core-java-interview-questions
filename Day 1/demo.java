class Plane {
    void fly(){
        System.out.println("Planes are flying in sky....");
    }
    void takeoff(){
        System.out.println("Take of time...");
    }

}
class CargoPlane extends Plane{
     void fly(){
        System.out.println("cargo plane flying in low height....");
    }
  void cargocarry(){
    System.out.println("Cargo carry foods,medical,etc...");

  }
    void takeoff(){
        System.out.println("Take of time is more...");
    }
}
class PassengerPlane extends Plane{
     void fly(){
        System.out.println("passenger plane flying in medium height....");
    }
   void  passengerCarry(){
 System.out.println("passengerplane carry passenger...");
    }
      void takeoff(){
        System.out.println("Take of time sightly less...");
    }

}
class FighterPlane extends Plane {
     void fly(){
        System.out.println("Fighter planes are flying high atitude height....");
    }
    void fighterCarry(){
        System.out.println("fighter plane carry weapan...");

    }
      void takeoff(){
        System.out.println("Take of time is very Less...");
    }

}
class Airport{
    void permit(Plane ref){
        ref.fly();
        ref.takeoff();

    }
}

public class demo{
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Airport ap = new Airport();
        ap.permit(pp);
        pp.fly();
        ap.permit(cp);
        cp.fly();
        ap.permit(fp);
        fp.fly();
      
        
    }
}
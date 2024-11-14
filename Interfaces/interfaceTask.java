package Interfaces;

interface ElectricVehicle{
  void charge();
}

interface GasVehicle {
  void refuel();
}

interface HybridVehicle {
  void doBoth();
}

class Tesla implements ElectricVehicle, HybridVehicle{
  private int batteryLevel;

  public Tesla(int batteryLevel){
    this.batteryLevel = batteryLevel;
  }
  @Override
  public void charge(){
    batteryLevel += 5;
    System.out.println("Tesla is charging" + batteryLevel);
  }

  @Override
  public void doBoth(){
    System.out.println("I dont know how tesla is hybrid");
  }

  public int getBatteryLevel(){
    return batteryLevel;
  }
}

class ToyotaPrius implements HybridVehicle, GasVehicle{
  private int fuelLevel;

  public ToyotaPrius(int fuelLevel) {
    this.fuelLevel = fuelLevel;
  }
  @Override
  public void doBoth(){
    System.out.println("Toyota Prius is Electric also?? Damnnn");
  }

  @Override 
  public void refuel(){
    fuelLevel += 5;
    System.out.println("Refueling Toyota Prius" + fuelLevel);
  }

  public int getFuelLevel(){
    return fuelLevel;
  }
}

public class interfaceTask{
  public static void main(String[] args) {
    Tesla t = new Tesla(10);
    System.out.println(t.getBatteryLevel());
    t.charge();
    t.doBoth();
    System.out.println(t.getBatteryLevel());
    

    ToyotaPrius tp = new ToyotaPrius(10);
    System.out.println(tp.getFuelLevel());
    tp.doBoth();
    tp.refuel();
    System.out.println(tp.getFuelLevel());
  }
}
public class Honda implements BikeInterface {
    public static void main(String args[]) {
        Honda obj = new Honda();
        System.out.println("Model Name : "+obj.modelName());
        System.out.println("Cubic Capacity : "+obj.cc());
        System.out.println("Horse Power : "+obj.horsePower());
        System.out.println("Fuel Type : "+obj.fuelType());
        System.out.println("Weight : "+obj.weight());
        System.out.println("Brake Type : "+obj.brakeType());
        System.out.println("Is Traction Control available : "+obj.tractionControl());
        System.out.println("Chassis Number : "+obj.chassisNumber());
    }

    public String modelName() {
        return "Honda CB350";
    }

    public int cc() {
        return 350;
    }


    public int horsePower() {
        return 27;
    }


    public String fuelType() {
        return "Petrol";
    }


    public int weight() {
        return 170;
    }


    public String brakeType() {
        return "ABS Disc Brakes";
    }


    public boolean tractionControl() {
        return false;
    }


    public String chassisNumber() {
        return "HCB3540SLOP";


    }
}

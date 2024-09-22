public class Triumph implements BikeInterface {

    public static void main(String args[]) {
        Triumph obj = new Triumph();
        System.out.println("Model Name : " + obj.modelName());
        System.out.println("Cubic Capacity : " + obj.cc());
        System.out.println("Horse Power : " + obj.horsePower());
        System.out.println("Fuel Type : " + obj.fuelType());
        System.out.println("Weight : " + obj.weight());
        System.out.println("Brake Type : " + obj.brakeType());
        System.out.println("Is Traction Control available : " + obj.tractionControl());
        System.out.println("Chassis Number : " + obj.chassisNumber());
    }

    public String modelName() {
        return "Triumph Scrambler 400X";
    }

    public int cc() {
        return 400;
    }


    public int horsePower() {
        return 40;
    }


    public String fuelType() {
        return "Petrol";
    }


    public int weight() {
        return 190;
    }


    public String brakeType() {
        return "ABS Dual-Disc Brakes";
    }


    public boolean tractionControl() {
        return true;
    }


    public String chassisNumber() {
        return "ASG4586H34";


    }
}

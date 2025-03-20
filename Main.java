public class Main {
    
    public static void main(String args[]){
        Car car1 = new Car("Toyota", "Camry", "$30000");
        car1.displayCarDetail();
        // car.runCar();
        Car car2 = new Car("Honda", "Civic", "$25000");
        car2.displayCarDetail();

        Car car3 = new Car("Ford", "Mustang", "$50000");
        car3.displayCarDetail();
    }
}

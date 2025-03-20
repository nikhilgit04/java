class Car{
    public String brand;
    public String model;
    public String price;
    
    // public Car(){

    // }

    public Car(String brand, String model, String price){
        // System.out.println("This is constructor");
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarDetail(){
        System.out.print(" Brand :" + this.brand);
        System.out.print(" Model :" + this.model);
        System.out.print(" Price :" + this.price);
        System.out.println("");

    }

    public void runCar(){
        System.out.println("The " + this.brand + " " + this.model + " Car is running");
        // System.out.println("Model :" + this.model);
        // System.out.println("Price :" + this.price);
    }

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

// instance variable - attributes - property
// methods - function
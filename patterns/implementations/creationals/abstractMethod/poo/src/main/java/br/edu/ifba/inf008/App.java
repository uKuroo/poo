package br.edu.ifba.inf008;

import br.edu.ifba.inf008.abstact.Car;
import br.edu.ifba.inf008.abstact.Motocycle;
import br.edu.ifba.inf008.factory.ExpensiveVehicleFactory;
import br.edu.ifba.inf008.interfaces.VehicleFactory;

public class App 
{
    public static void main(String[] args)
    {
        VehicleFactory factory = new ExpensiveVehicleFactory();

        Car car = factory.createCar();
        Motocycle motocycle = factory.createMotocycle();

        car.showType();
        motocycle.showType();
    }
}

package br.edu.ifba.inf008.factory;

import br.edu.ifba.inf008.abstact.Car;
import br.edu.ifba.inf008.abstact.Motocycle;
import br.edu.ifba.inf008.concret.expensive.ExpensiveCar;
import br.edu.ifba.inf008.concret.expensive.ExpensiveMotocycle;
import br.edu.ifba.inf008.interfaces.VehicleFactory;

public class ExpensiveVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar() {
        return new ExpensiveCar();
    }

    @Override
    public Motocycle createMotocycle() {
        return new ExpensiveMotocycle();
    }

}

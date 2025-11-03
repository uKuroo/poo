package br.edu.ifba.inf008.factory;

import br.edu.ifba.inf008.abstact.Car;
import br.edu.ifba.inf008.abstact.Motocycle;
import br.edu.ifba.inf008.concret.economic.EconomicCar;
import br.edu.ifba.inf008.concret.economic.EconomicMotocycle;
import br.edu.ifba.inf008.interfaces.VehicleFactory;

public class EconomicVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar() {
        return new EconomicCar();
    }

    @Override
    public Motocycle createMotocycle() {
        return new EconomicMotocycle();
    }

}

package br.edu.ifba.inf008.interfaces;

import br.edu.ifba.inf008.abstact.Car;
import br.edu.ifba.inf008.abstact.Motocycle;

public interface VehicleFactory {
    Car createCar();
    Motocycle createMotocycle();
}

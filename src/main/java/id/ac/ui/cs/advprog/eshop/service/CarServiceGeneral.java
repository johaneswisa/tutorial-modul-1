package id.ac.ui.cs.advprog.eshop.service;
import id.ac.ui.cs.advprog.eshop.model.Car;
import java.util.List;
public interface CarServiceGeneral {
    public Car create(Car car);
    public List<Car> findAll();
}



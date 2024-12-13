package pe.edu.i202330948.cl3_spring_gebhardt_sigmund.service;

import pe.edu.i202330948.cl3_spring_gebhardt_sigmund.dto.CarDetailDto;
import pe.edu.i202330948.cl3_spring_gebhardt_sigmund.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;

}

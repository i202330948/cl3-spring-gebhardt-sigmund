package pe.edu.i202330948.cl3_spring_gebhardt_sigmund.response;

import pe.edu.i202330948.cl3_spring_gebhardt_sigmund.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}

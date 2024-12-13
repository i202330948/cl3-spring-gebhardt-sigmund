package pe.edu.i202330948.cl3_spring_gebhardt_sigmund.response;

import pe.edu.i202330948.cl3_spring_gebhardt_sigmund.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto car) {
}

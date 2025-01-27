package utez.edu.mx.cleancheck.controller.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class UserDto {

    @NotBlank(message = "El nombre es requerido")
    private String name;

    @NotBlank(message = "El correo electronico paterno es requerido")
    @Email(message = "El correo electronico no es valido")
    private String email;

    @NotBlank(message = "La contraseña es requerida")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;
}

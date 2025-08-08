package utez.edu.mx.sinv.controllers.auth.dto;

import lombok.Value;
import utez.edu.mx.sinv.models.role.Role;
import utez.edu.mx.sinv.models.user.Users;

@Value
public class SignedDto {
    String token;
    String tokenType;
    Users user;
    Role roles;
}
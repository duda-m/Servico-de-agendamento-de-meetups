package com.bootcamp.microservicemeetup.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationDTO {

    private Integer id;

    @NotEmpty
    private String name;

    /*@NotEmpty
    private String email;

    @NotEmpty
    private String password;*/

    @NotEmpty
    private String dateOfRegistration;

    @NotEmpty
    private String registration;

}

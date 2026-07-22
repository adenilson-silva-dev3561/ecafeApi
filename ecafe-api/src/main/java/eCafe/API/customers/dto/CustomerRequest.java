package eCafe.API.customers.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CustomerRequest(

        @NotBlank(message = "Nome é obrigatório")
        String name,

        @NotBlank(message = "Email é obrigatório")
        String email,

        @NotBlank(message = "Telefone é obrigatório")
        String phone,

        @NotBlank(message = "Cpf é obrigatório")
        String cpf,

        @NotNull(message = "Data de nascimento é obrigatório")
        LocalDate birth_date,

        @NotNull(message = "Campo active não pode ser null!")
        Boolean active

){}

package eCafe.API.customers.dto;

import java.time.LocalDate;

public record CustomerResponse(

        Long id,
        String name,
        String email,
        String phone,
        LocalDate createdAt,
        String cpf,
        LocalDate birthDate,
        boolean active

) {}

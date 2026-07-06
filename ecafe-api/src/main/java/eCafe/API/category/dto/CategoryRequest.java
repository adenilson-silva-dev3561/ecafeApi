package eCafe.API.category.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoryRequest (
        @NotBlank(message = "Nome é obrigatório!")
        String name,

        @NotBlank(message = "A descrição é obrigatória!")
        String description
){}

package eCafe.API.product.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequest(
        @NotNull(message = "Categoria é obrigatória!")
        Long categoryId,

        @NotBlank(message = "Nome é obrigatório!")
        String name,

        @NotBlank(message = "A descrição é obrigatória!")
        String description,

        @NotNull(message = "Preço é obrigatório!")
        @Positive(message = "Preço deve ser maior que zero!")
        @Digits(integer = 10, fraction = 2, message = "Preço inválido!")
        BigDecimal price,

        @NotNull(message = "Quantidade em estoque é obrigatória!")
        @PositiveOrZero(message = "Quantidade em estoque não pode ser negativa!")
        Integer stockQuantity,

        @NotNull(message = "Status ativo é obrigatório!")
        Boolean active
) {
}

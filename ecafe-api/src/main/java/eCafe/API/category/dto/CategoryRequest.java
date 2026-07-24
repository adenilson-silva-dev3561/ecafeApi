package eCafe.API.category.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Dados para cadastro de category")
public record CategoryRequest(

        @Schema(description = "Cafe", example = "Cafés Tradicionais")
        @NotBlank(message = "Nome é obrigatório!")
        String name,

        @Schema(description = "Descrição da categoria.", example = "Cafés produzidos com grãos selecionados, de alta qualidade e sabor diferenciado.")
        @NotBlank(message = "A descrição é obrigatória!")
        String description
) {
}

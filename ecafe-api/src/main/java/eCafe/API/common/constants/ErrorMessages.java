package eCafe.API.common.constants;

public final class ErrorMessages {

    private ErrorMessages() {
        throw new IllegalStateException("Classe utilitária");
    }

    public static final String CATEGORY_NOT_FOUND =
            "Categoria não encontrada. Id=";

    public static final String CATEGORY_ALREADY_EXISTS =
            "Já existe uma categoria com esse nome.";

    public static final String PRODUCT_NOT_FOUND =
            "Produto não encontrado. Id=";

    public static final String PRODUCT_ALREADY_EXISTS =
            "Já existe um produto com esse nome.";
}
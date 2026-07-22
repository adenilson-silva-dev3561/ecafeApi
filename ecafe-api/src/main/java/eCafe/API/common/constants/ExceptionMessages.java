package eCafe.API.common.constants;

public final class ExceptionMessages {

    private ExceptionMessages() {
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

    public static final String CUSTOMER_ALREADY_EXISTS =
            "Este CPF já possui cadastro ativo.";

    public static final String CUSTOMER_NOT_FOUND =
            "Cliente não encontrado. ID={}";

}
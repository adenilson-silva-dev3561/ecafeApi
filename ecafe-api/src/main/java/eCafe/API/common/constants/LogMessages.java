package eCafe.API.common.constants;

public final class LogMessages {

    private LogMessages() {
        throw new IllegalStateException("Classe utilitária");
    }

    public static final String CATEGORY_CREATE_START =
            "Iniciando cadastro da categoria '{}'.";
    public static final String CATEGORY_CREATE_SUCCESS =
            "Categoria cadastrada com sucesso. Id={}";

    public static final String CATEGORY_UPDATE_START =
            "Atualizando categoria. Id={}";
    public static final String CATEGORY_UPDATE_SUCCESS =
            "Categoria atualizada com sucesso. Id={}";

    public static final String CATEGORY_DELETE_START =
            "Solicitada exclusão da categoria. Id={}";
    public static final String CATEGORY_DELETE_SUCCESS =
            "Categoria '{}' removida com sucesso.";

    public static final String CATEGORY_FIND_ALL =
            "Buscando todas as categorias.";

    public static final String CATEGORY_FIND_BY_ID =
            "Buscando categoria. Id={}";

    public static final String CATEGORY_NOT_FOUND =
            "Categoria não encontrada. Id={}";

    public static final String CATEGORY_ALREADY_EXISTS =
            "Tentativa de cadastrar categoria já existente '{}'.";
    public static final String CATEGORY_ALREADY_EXISTS_UPDATE =
            "Tentativa de atualizar categoria para um nome já existente '{}'.";

    public static final String PRODUCT_CREATE_START =
            "Iniciando cadastro do produto '{}'.";
    public static final String PRODUCT_CREATE_SUCCESS =
            "Produto cadastrado com sucesso. Id={}";

    public static final String PRODUCT_UPDATE_START =
            "Atualizando produto. Id={}";
    public static final String PRODUCT_UPDATE_SUCCESS =
            "Produto atualizado com sucesso. Id={}";

    public static final String PRODUCT_DELETE_START =
            "Solicitada exclusão do produto. Id={}";
    public static final String PRODUCT_DELETE_SUCCESS =
            "Produto '{}' removido com sucesso.";

    public static final String PRODUCT_FIND_ALL =
            "Buscando todos os produtos.";

    public static final String PRODUCT_FIND_BY_ID =
            "Buscando produto. Id={}";

    public static final String PRODUCT_NOT_FOUND =
            "Produto não encontrado. Id={}";

    public static final String PRODUCT_ALREADY_EXISTS =
            "Tentativa de cadastrar produto já existente '{}'.";

    public static  final String PRODUCT_FOUND_SUCCESSFULLY =
            "Produto encontrado com sucesso! Id: '{}'";
}
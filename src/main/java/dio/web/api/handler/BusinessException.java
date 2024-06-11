package dio.web.api.handler;

public class BusinessException extends RuntimeException {
  public BusinessException(String mensagem) {
    super(mensagem);
  }

  public BusinessException(String mensagem, Object... params) { // criar conteudo dinamico
    super(String.format(mensagem, params));
  }
}

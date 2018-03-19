package sigaWeb.core;

import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import sigaMOD.core.AbstractEntity;
import sigaSRV.enumerator.TipoOperacao;
import sigaWeb.autenticacao.Credencial;



public abstract class AbstractWebBean<T extends AbstractEntity> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//TODO: ALTERAR VISIBILIDADE
		
	protected List<T> listagem;
	
	protected T filtro;
	
	protected T objeto;
	

	protected String OUTCOME_DETAIL = "detail";

	protected String OUTCOME_FORM = "form";

	protected String OUTCOME_LISTA = "list";
	
	protected TipoOperacao tipoOperacao;
	
	@Inject
	protected Credencial credenciais;
		
	protected void adicionarMensagemInfo(String message, Object... params) {
		Messages.addInfo(null, message, params);
	}

	protected void adicionarMensagemAviso(String message, Object... params) {
		Messages.addWarn(null, message, params);
	}

	protected void adicionarMensagemErro(String message, Object... params) {
		Messages.addError(null, message, params);
	}

	protected static HttpServletResponse getResponse() {
		return Faces.getResponse();
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	
	protected void preRender() {
		
	}
	
}

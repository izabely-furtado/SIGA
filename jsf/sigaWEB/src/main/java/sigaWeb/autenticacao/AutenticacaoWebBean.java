package sigaWeb.autenticacao;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;

import sigaMOD.entity.Usuario;
import sigaSRV.bo.IUsuarioBO;
import sigaSRV.exception.BusinessException;
import sigaWeb.core.AbstractWebBean;

@Named("autenticacaoWebBean")
@SessionScoped
public class AutenticacaoWebBean extends AbstractWebBean<Usuario> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//TODO: VERIFICAR PQ SESSION SCOPED NAO ESTA FUNCIONANDO
	private Credencial credenciais;
	
	@Inject
	private transient IUsuarioBO usuarioBO;
	
	private String originalURL;
	
	private static final String URL_AFTER_LOGIN = "/pages/home/home.jsf";

	private static final String URL_AFTER_LOGOUT = "/pages/home/home.jsf";

	public void preRenderView() {	
		credenciais = new Credencial();
		armazenarURLOriginal();
	}

	private void armazenarURLOriginal() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		originalURL = (String) externalContext.getRequestMap().get(RequestDispatcher.FORWARD_REQUEST_URI);

		if (originalURL != null) {
			String originalQuery = (String) externalContext.getRequestMap().get(RequestDispatcher.FORWARD_QUERY_STRING);
			if (originalQuery != null) 
				originalURL += "?" + originalQuery;
		}

	}
	
	public String login() throws IOException {

		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext externalContext = context.getExternalContext();

		try {
			usuarioBO.autenticar(credenciais.getUsername(), credenciais.getPassword());
		}catch(BusinessException e) {
			adicionarMensagemErro(e.getErro().getDescricao());
			return null;
		}catch(Exception e) {
			adicionarMensagemAviso("Ocorreu um erro ao efetuar o login. Favor entrar em contato com a área responsável");
			return null;
		}
		
		credenciais.setLogado(true);
		
//		if (originalURL == null) 
//			originalURL = externalContext.getRequestContextPath() + URL_AFTER_LOGIN;
		
		externalContext.redirect(originalURL);
		return null;
	}
	
	public void logout() throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		externalContext.redirect(externalContext.getRequestContextPath() + URL_AFTER_LOGOUT);
	}

	public Credencial getCredenciais() {
		return credenciais;
	}

	
	
	
}

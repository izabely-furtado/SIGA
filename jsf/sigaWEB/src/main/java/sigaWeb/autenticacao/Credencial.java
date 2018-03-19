package sigaWeb.autenticacao;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@SessionScoped
@ManagedBean(name="credencial")
public class Credencial implements Serializable{

	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;

	private List<Long> funcionalidadesPermitidas;
	
	private boolean logado;
	
	private Long idViveiro;
	
	public Credencial() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Long> getFuncionalidadesPermitidas() {
		return funcionalidadesPermitidas;
	}

	public void setFuncionalidadesPermitidas(List<Long> funcionalidadesPermitidas) {
		this.funcionalidadesPermitidas = funcionalidadesPermitidas;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public Long getIdViveiro() {
		return idViveiro;
	}

	public void setIdViveiro(Long idViveiro) {
		this.idViveiro = idViveiro;
	}

}

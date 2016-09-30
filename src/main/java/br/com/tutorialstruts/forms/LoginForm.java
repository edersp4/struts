package br.com.tutorialstruts.forms;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
	private String usuario;
	private String senha;
	private boolean podeAcessar;

	public boolean isPodeAcessar() {
		return podeAcessar;
	}

	public void setPodeAcessar(boolean podeAcessar) {
		this.podeAcessar = podeAcessar;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}

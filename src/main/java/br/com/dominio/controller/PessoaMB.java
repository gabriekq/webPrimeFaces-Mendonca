package br.com.dominio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.sun.faces.action.RequestMapping;

import br.com.dominio.model.Pessoa;


// usar escopo de sessao
@Named("bean")
@SessionScoped
public class PessoaMB implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private Conversation conversation;
	
	
	@Inject
	private Pessoa pessoa;
	
	
	private String text;
	
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public String adicionar(){
		
		
		pessoas.add(pessoa);
		limpar();
		
		return null;
	}
	
	

	public String ListarTodos(){
		
		return "paginas/Listar.xhtml";
		
	}
	
	
	public String Menu(){
		return "CadastroPessoa.xhtml";
	}
	
	

	private void limpar(){
		
		pessoa = new Pessoa();
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public List<Pessoa> getPessoas() {
		return pessoas;
	}


	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}



   public void AjaxBehaviorEvent(){
	   this.pessoa.getNome();
	   
   }
	
	
	
}

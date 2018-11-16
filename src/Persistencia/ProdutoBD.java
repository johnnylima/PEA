package Persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

import Dominio.Produto;
import Enum.ETipoUsuario;

public class ProdutoBD implements IBaseBD<Produto>{
	private ArrayList<Produto> _produtos = new ArrayList<Produto>();
	
	public void Inserir(Produto novoProduto) {
		if(LoginBD.getSession() != null) {
			if(LoginBD.getSession().getTipoUsuario() == ETipoUsuario.Gerente) {
				LerXml();
				_produtos.add(novoProduto);
				SalvarXml();
			}
		}
	}
	
	public ArrayList<Produto> GetAll(){
		LerXml();
		return _produtos;
	}
	
	public void Excluir(int id) {
		if(LoginBD.getSession() != null) {
			if(LoginBD.getSession().getTipoUsuario() == ETipoUsuario.Gerente) {
				LerXml();
				_produtos.remove(id);
				SalvarXml();
			}
		}
	}
	
	public Produto GetById(int id) {
		LerXml();
		return _produtos.get(id);
	}
	
	public void LerXml() {
		File arquivo = new File("Produtos.xml");
		if(arquivo.exists()) {
			XStream xstream = new XStream();
			xstream.alias("Produto", Produto.class);
			_produtos = (ArrayList<Produto>)xstream.fromXML(arquivo);
		} else {
			_produtos = new ArrayList<Produto>();
		}
	}
	
	public void SalvarXml() {
		XStream xstream = new XStream();
		xstream.alias("Produto", Produto.class);
		try {
			FileWriter gravar = new FileWriter("Produtos.xml");
			gravar.write(xstream.toXML(_produtos));
			gravar.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

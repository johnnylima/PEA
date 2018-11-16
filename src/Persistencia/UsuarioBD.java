package Persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

import Dominio.Usuario;

public class UsuarioBD implements IBaseBD<Usuario>{
	private ArrayList<Usuario> _usuarios = new ArrayList<Usuario>();
	
	public void Inserir(Usuario novoUsuario) {
		LerXml();
		_usuarios.add(novoUsuario);
		SalvarXml();
	}
	
	public void Excluir(int id) {
		LerXml();
		_usuarios.remove(id);
		SalvarXml();
	}
	
	//Retorna um usuario pela chave
	public Usuario GetById(int id) {
		LerXml();
		if(_usuarios.get(id) != null) {
			return _usuarios.get(id);
		} else {
			return null;
		}
	}
	
	//Retorna a chave de todo mundo
	public ArrayList<Usuario> GetAll(){
		LerXml();
		return _usuarios;
	}
	
	public void LerXml() {
		File arquivo = new File("Usuarios.xml");
		if(arquivo.exists()) {
			XStream xstream = new XStream();
			xstream.alias("Usuario", Usuario.class);
			_usuarios = (ArrayList<Usuario>)xstream.fromXML(arquivo);
		} else {
			_usuarios = new ArrayList<Usuario>();
		}
	}
	
	public void SalvarXml() {
		XStream xstream = new XStream();
		xstream.alias("Usuario", Usuario.class);
		try {
			FileWriter gravar = new FileWriter("Usuarios.xml");
			gravar.write(xstream.toXML(_usuarios));
			gravar.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

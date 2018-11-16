package Persistencia;

import java.io.File;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

import Dominio.Usuario;

public class LoginBD {

    private static Usuario Session = null;
	private static ArrayList<Usuario> _usuarios = new ArrayList<Usuario>();
	
	public static boolean Logar(String login, String senha) {
		LerXml();
		for(int i = 0; i < _usuarios.size(); i++) {
		Usuario user = _usuarios.get(i);
			if(user.getLogin().equals(login) && user.getSenha().equals(senha)) {
				Session = user;
				return true;
			}
		}
		return false;
	}
	
	public static Usuario getSession() {
		return Session;
	}
	
	public static void LerXml() {
		File arquivo = new File("Usuarios.xml");
		if(arquivo.exists()) {
			XStream xstream = new XStream();
			xstream.alias("Usuario", Usuario.class);
			_usuarios = (ArrayList<Usuario>)xstream.fromXML(arquivo);
		} else {
			_usuarios = new ArrayList<Usuario>();
		}
	}
}

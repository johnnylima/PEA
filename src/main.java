import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import Dominio.*;
import Persistencia.*;
import Enum.*;

public class main {

	public static void main(String[] args) {

		//Usuario user = new Usuario("julio","123",ETipoUsuario.Gerente);
		//UsuarioBD userbd= new UsuarioBD();
		//userbd.Inserir(user);
		LoginBD.Logar("julio", "123");
		//System.out.println(UsuarioBD.GetById(0).getLogin());
		//UsuarioBD.Excluir(1);
		//if(UsuarioBD.GetById(1) != null) {
		//	System.out.println(UsuarioBD.GetById(1).getLogin());
		//}
		
		//Produto prod = new Produto("Eminem","disco azul",ECategoriaProduto.CD,10,50);
		//ProdutoBD prodbd = new ProdutoBD();
		//prodbd.Inserir(prod);
	
		//ProdutoBD a = new ProdutoBD(); 
		
		//for(Produto list : a.GetAll()) {
		//	System.out.println(list.getNome());
		//	System.out.println(list.getEstoque().getQuantidadeDisponivel());
		//}
		
		//System.out.println(LoginBD.getSession().getLogin());
	}

}

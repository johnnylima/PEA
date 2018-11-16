package Persistencia;

import java.util.ArrayList;


public interface IBaseBD<Tipo> {
	void Inserir(Tipo objeto);
	void Excluir(int id);
	Tipo GetById(int id);
	ArrayList<Tipo> GetAll();
}

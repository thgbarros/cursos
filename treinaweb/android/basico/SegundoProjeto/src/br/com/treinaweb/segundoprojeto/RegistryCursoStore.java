package br.com.treinaweb.segundoprojeto;

import java.util.ArrayList;
import java.util.List;

public class RegistryCursoStore {

	private static RegistryCursoStore _theInstance;
	private List<Curso> cursos;
	/**
	 * 
	 */
	public RegistryCursoStore() {
		cursos = new ArrayList<Curso>();
		//Para o list já possuir um conteúdo
		cursos.add(new Curso("Android básico"));
		cursos.add(new Curso("Android intermediário"));
		cursos.add(new Curso("Android avançado"));
	}
	
	public static RegistryCursoStore getInstance(){
		if (_theInstance == null){
			synchronized (RegistryCursoStore.class) {
				if (_theInstance == null){
					_theInstance = new RegistryCursoStore();
				}
			}
		}
		return _theInstance;
	}
	
	public static List<Curso> getCursos(){
		return getInstance().cursos;
	}
	
	public static void addCursos(Curso curso){
		getInstance().cursos.add(curso);
	}
}

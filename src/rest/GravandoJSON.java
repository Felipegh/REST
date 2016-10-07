package rest;

import java.util.ArrayList;
import com.google.gson.Gson;

    //classe com exemplo de uso do JSON
	//converte objeto Filme para uma string JSON
	public class GravandoJSON {
		
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) {

	    	//instancia um filme e preenche suas propriedades
	    	Filme f = new Filme(); 
			f.titulo = "JSON x XML";
			f.ano = 2012;
			f.generos = new ArrayList();
			f.generos.add("Aventura");
			f.generos.add("Ação");
			f.generos.add("Ficção");
	    	
			//instancia um objeto da classe Gson	    	
			Gson gson = new Gson(); 
			
			//pega os dados do filme, converte para JSON e armazena em string
			String aux = gson.toJson(f);
			
			//imprime os resultados
			System.out.println(aux);
	     }
}
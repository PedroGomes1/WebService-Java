package rs;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.Pessoa;


@Path("substituir")
public class SubstituirResource {

     static List<Pessoa> pessoas = new ArrayList<Pessoa>();
     
     int tamanhoLista = pessoas.size();
     
     
    public SubstituirResource() {
        
        //Verificação para não duplicar registros os que já foram adicionados
        if (tamanhoLista == 0) {
        pessoas.add(new Pessoa("Pedro"));
        pessoas.add(new Pessoa("Samuel"));
        pessoas.add(new Pessoa("Igor"));
        }
    }

    @POST
    @Produces("text/html")
    public String alterar(
                      @FormParam("nomePessoa") String nome,
                      @FormParam("indicePessoa") int posicao) {
            
            //Verificação para não adicionar índices inválidos
            if(posicao>=0 && posicao < pessoas.size()) {
            //Substituindo o nome
            pessoas.get(posicao).setNome(nome);     
            return "Nome substituido com sucesso";
            }
            return "Nao foi possivel atualizar";
    }
        
    
    @GET
    @Produces("text/html")
    public String verifica() {  
        
        StringBuilder info  = new StringBuilder();
        
        //Percorrer a lista
        for (Pessoa x: pessoas) {   
                //retornar as pessoas cadastradas
               return pessoas.toString();
            }
        return "";
}
}

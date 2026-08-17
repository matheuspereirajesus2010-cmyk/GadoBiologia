package Model;

import java.util.ArrayList;

public class CadastroGado {
    ArrayList<Gado> gados = new ArrayList<>();

    public void Cadastar(int id, String tipo, String sexo, int idade){
        if(gados.isEmpty()){
            System.out.println("LISTA DE GADO ESTÁ VAZIA!!!");
        }
        Gado newGado = new Gado(id,tipo,sexo,idade);
        gados.add(newGado);
        gados.mostrar();
    }

    public void Deletar(int id){
        for(Gado G : gados ){
            if(G.getId() == id){
                gados.remove(id);
            }
            System.out.println("GADO NÃO LOCALIZADO!");
        }

        public void Listar(){
            if(gados.isEmpty()){
                System.out.println("LISTA DE GADOS ESTÁ VAZIA!!!");
            }
            for(Gado g : gados){
                g.mostrar();
            }
        }

    }




}

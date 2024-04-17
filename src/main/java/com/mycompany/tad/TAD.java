

package com.mycompany.tad;

import classes.ClienteDAO;

import classes.Cliente;


public class TAD {

    public static void main(String[] args) {
       
              
        /*Vetor vt = new Vetor(10);
        
        vt.inserir(10);
        vt.imprimir();
        
        Lista ls = new Lista(10);
        ls.inserir(5);
        ls.inserir(20);
        ls.imprimir();
        
        UmMonteDeNumero obj = FabricaDeLista.getLista();
        
        obj.inserir(10);
        obj.inserir(15);
        obj.inserir(25);
        obj.imprimir();
        
        
        ArrayList v = new ArrayList<Vetor>();
        */
        
        ClienteDAO da = new ClienteDAO();
        
     
        
        Cliente c3 = new Cliente();
        c3.setId(3);
        c3.setNome("João");
        c3.setEndereco("Rua 3");
        c3.setCpf("77777");
       
        da.inserir(c3);
 
        
      boolean retorno =  da.excluir(5);
      
      if(retorno==false){
        System.out.println("Registro não encontrado");
      }
        
        c3.setId(1);
        da.alterar(c3);
        
        da.imprimirLista();
        
       
        
        
    }
}

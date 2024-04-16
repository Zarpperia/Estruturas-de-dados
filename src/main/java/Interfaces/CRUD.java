
package Interfaces;

import classes.Cliente;
import java.util.ArrayList;


public interface CRUD {
    
    public boolean inserir (Cliente cli);
    public boolean alterar (Cliente cli);
    public boolean excluir (int id);
    public ArrayList<Cliente> buscarTodos();
    
    
}

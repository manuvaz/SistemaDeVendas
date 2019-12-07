
package br.edu.ifms.loja.cliente.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.cliente.datamodel.Cliente;

/**
 *
 * @author Manoel
 */
public class ClienteDAO extends GenericDAO<Cliente> {
    
    public ClienteDAO() {
        super(Cliente.class);
    }
    
}

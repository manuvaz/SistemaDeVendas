
package br.edu.ifms.loja.produto.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.produto.datamodel.Produto;

/**
 *
 * @author Manoel
 */
public class ProdutoDao extends GenericDAO<Produto>{
    
    public ProdutoDao() {
        super(Produto.class);
    }
    
}

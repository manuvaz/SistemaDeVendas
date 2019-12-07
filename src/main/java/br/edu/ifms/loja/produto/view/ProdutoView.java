
package br.edu.ifms.loja.produto.view;

import javax.swing.JDialog;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author Manoel
 */
public class ProdutoView extends GenericCRUDView{

    private JDialog janela;
    
    
    
    public ProdutoView(JPanel formulario) {
        super(formulario);
        
        janela = new JDialog();
        janela.add(this);
        janela.setModal(true);
        janela.setTitle("Produto");
        janela.setSize(800,700);
        
    }
    
    @Override
    public String[] configurarCamposDeBusca() {
    return new String[0];
    }
    
    public void setVisible(boolean b) {
        janela.setVisible(b);
    }
    
}

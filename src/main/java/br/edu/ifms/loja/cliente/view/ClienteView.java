
package br.edu.ifms.loja.cliente.view;

import javax.swing.JDialog;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author Manoel
 */
public class ClienteView extends GenericCRUDView{

    private JDialog janela;
    
    public ClienteView(JPanel formulario) {
        super(formulario);
        janela = new JDialog();
        janela.setSize(900, 800);
        janela.setModal(true);
        janela.add(this);
        janela.setTitle("Cliente");
        
        
    }

    @Override
    public String[] configurarCamposDeBusca() {
        return new String [0];
    }
    
    public void SetVisible(boolean b){
        janela.setVisible(b);
    }
}

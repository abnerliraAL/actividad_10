package controller;
import model.ModelRegistro;
import view.ViewRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alons
 */
public class ControllerRegistro implements ActionListener{
    
    private final ModelRegistro modelRegistro;
    private final ViewRegistro viewRegistro;
    
    public ControllerRegistro(ModelRegistro modelRegistro, ViewRegistro viewRegistro){
        this.modelRegistro = modelRegistro;
        this.viewRegistro = viewRegistro;
        viewRegistro.jb_guardar.addActionListener(this);
        initView();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewRegistro.jb_guardar){
            modelRegistro.setPath("C:\\Users\\VisionaryMH\\Documents\\Escuela\\Aplicaciones_Dos\\base.csv");
            modelRegistro.setTxt(modelRegistro.getText(viewRegistro.jtf_nombre.getText(),viewRegistro.jtf_Correo_electronico.getText()));
            modelRegistro.readFile(modelRegistro.getPath(), modelRegistro.getTxt());
            JOptionPane.showMessageDialog(viewRegistro, "Registro Guardado");
            viewRegistro.jtf_nombre.setText(null);
            viewRegistro.jtf_Correo_electronico.setText(null);
        }
    }

    private void initView() {
     viewRegistro.setTitle("Agenda CSV");
     viewRegistro.setResizable(false);
     viewRegistro.setLocationRelativeTo(null);
     viewRegistro.setVisible(true);
    }    
}

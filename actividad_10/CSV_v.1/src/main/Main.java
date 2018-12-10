package main;
import model.ModelRegistro;
import view.ViewRegistro;
import controller.ControllerRegistro;
/**
 *
 * @author alons
 */
public class Main {
    private static ModelRegistro modelRegistro;
    private static ViewRegistro viewRegistro;
    private static ControllerRegistro controllerRegistro;
    /**
     * Metodo main de la aplicación
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelRegistro = new ModelRegistro();
        viewRegistro = new ViewRegistro();
        controllerRegistro = new ControllerRegistro(modelRegistro, viewRegistro);
    }    
}
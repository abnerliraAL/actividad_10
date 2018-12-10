package model;
import java.io.*;
/**
 *
 * @author usuario1
 */
public class ModelRegistro {
    private String Path;
    private String Txt;

    public String getPath() {
        System.out.println("getPath");
        return Path;
    }

    public void setPath(String Path) {
        System.out.println("setPath");
        this.Path = Path;
    }

    public String getTxt() {
        System.out.println("getTxt");
        return Txt;
    }

    public void setTxt(String Txt) {
        System.out.println("setTxt");
        this.Txt = Txt;
    }

    public String getText(String name, String email){
        String txt=name+";"+email+"\n";
        System.out.println(txt);
        return txt;
    }

    public void readFile(String path, String txt){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try(PrintWriter printWriter = new PrintWriter(fileWriter)){
                System.out.println("--------");
                System.out.println(txt);
                printWriter.println(txt);
                printWriter.close();
            }        
        }catch(IOException err){
            System.err.println("error "+err.getMessage());
        }
    }
}

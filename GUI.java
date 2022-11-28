
import javax.swing.JOptionPane;
public class GUI {
    
    public static void main(String[] args){

       String name = JOptionPane.showInputDialog("isminizi giriniz: ");
          JOptionPane.showMessageDialog(null, "Hello: " + name);

       int yas = Integer.parseInt(JOptionPane.showInputDialog("Yaşınızı girin: "));
          JOptionPane.showMessageDialog(null,"Senin yaşın: " + yas);

       double boy = Double.parseDouble(JOptionPane.showInputDialog("Boyunuzu girin: "));
          JOptionPane.showMessageDialog(null, "Senin boyun: " + boy);
    }
}


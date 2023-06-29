import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(){
        this.setBounds(60, 440, 100, 50);
        Font fonte = new Font("Arial", Font.BOLD, 24);
        this.setFont(fonte);
        //this.setOpaque(false);
        //this.setContentAreaFilled(false);
        //this.setBorderPainted(false);
    }
}

import javax.swing.*;
import java.awt.*;

public class Minecraft extends JFrame {
    static JFrame F = new Minecraft();
    Screen ScreenObj = new Screen();

    public Minecraft(){
        add(ScreenObj);
        setUndecorated(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}

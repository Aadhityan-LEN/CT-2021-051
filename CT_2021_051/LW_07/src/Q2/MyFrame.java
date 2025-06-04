package Q2;
import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 450;

    public MyFrame(){
        setTitle("Blue Frame");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);

        //set contentPane for setBackground colour
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}



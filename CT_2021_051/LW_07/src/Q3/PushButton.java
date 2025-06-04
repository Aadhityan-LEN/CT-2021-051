package Q3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class PushButton extends JFrame{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 450;

    public PushButton(){
        setTitle("Click Push Button");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton pushButton = new JButton("click here");
        pushButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You clicked me");
                System.out.println("Clicked");
            }
        });
        add(pushButton);
    }
}



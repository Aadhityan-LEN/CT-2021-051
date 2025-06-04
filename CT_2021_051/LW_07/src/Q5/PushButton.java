package Q5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class PushButton extends JFrame{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 450;

    public PushButton(){
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GREEN);

        JButton pushButton = new JButton("OFF");
        pushButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pushButton.getText().equals("OFF")){
                    getContentPane().setBackground(Color.red);
                    pushButton.setText("ON");
                }else {
                    getContentPane().setBackground(Color.GREEN);
                    pushButton.setText("OFF");
                }
            }
        });
        add(pushButton);
        setLayout(null);
        pushButton.setBounds(100,100,100,30);
    }
}



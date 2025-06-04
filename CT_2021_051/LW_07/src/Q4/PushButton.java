package Q4;
import javax.swing.*;
import java.awt.event.ActionEvent;

class PushButton extends JFrame{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 450;

    public PushButton(){
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*title*/
        JTextField inputTitle =new JTextField();
        /*push button*/
        JButton pushButton = new JButton("Replace title");
        pushButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle(inputTitle.getText());
            }
        });
        add(inputTitle);
        add(pushButton);

        setLayout(null);
        inputTitle.setBounds(50,50,200,30);
        pushButton.setBounds(100,100,200,30);

    }
}



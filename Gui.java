/*
 * Created by JFormDesigner on Wed Jan 15 14:01:36 PST 2020
 */

package Power;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author unknown
 */
public class Gui extends JPanel {
    public Gui() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - David
        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane();
        textArea2 = new JTextArea();
        button1 = new JButton();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea2);
        }

        //---- button1 ----
        button1.setText("get page");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - David
    private JTextArea textArea1;
    private JScrollPane scrollPane1;
    private JTextArea textArea2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

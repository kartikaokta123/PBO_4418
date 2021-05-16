/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package javaawt;

/**
 *
 * @author ASUS PC
 */
import java.awt.*;
import java.awt.event.*;
public class AwtControlDemo {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    
    public AwtControlDemo(){
        prepareGUI();
    }
    
    private void prepareGUI(){
        mainFrame = new Frame("JAVA AWT CONTOH");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);
        
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        
    }
    private void showEventDemo(){
        headerLabel.setText("Control in action: button");
        
        Button okButton = new Button("Okey");
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");
        
        okButton.setActionCommand("Okey");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");
        
        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        
        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);
        
        mainFrame.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if( command.equals( "Okey" )) {
                statusLabel.setText("Ok button clicked.");
            }
            else if( command.equals( "Submit" )) {
                statusLabel.setText("Submit button clicked.");
            }
            else {
                statusLabel.setText("Cancel button clicked.");
            }
        }
    }
    public static void main(String[] args) {
        AwtControlDemo awtControlDemo = new AwtControlDemo();
        awtControlDemo.showEventDemo();
    }

}

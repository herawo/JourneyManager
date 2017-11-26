package agencevoyage.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import agencevoyage.model.JourneyManager;
import agencevoyage.model.UserManager;
import agencevoyage.view.LogginScreen;

public class OverallGUI{
    private JPanel contentPane;
    private LogginScreen panel1;

    private void displayGUI(){
        JFrame frame = new JFrame("Agence de voyage");
        UserManager.getInstance().retrieveUser();
        JourneyManager.getInstance().retrieveJourneyList();
        frame.setPreferredSize(new Dimension(450, 350));
        frame.setMinimumSize(new Dimension(450, 350));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                UserManager.getInstance().saveUser();
                JourneyManager.getInstance().saveJourneyList();
                e.getWindow().dispose();
            }
        });
        contentPane = new JPanel();
        contentPane.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        );
        contentPane.setLayout(new CardLayout());
        panel1 = new LogginScreen(contentPane,frame);
        contentPane.add(panel1, "Panel 1"); 
        frame.setContentPane(contentPane);
        frame.pack();   
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new OverallGUI().displayGUI();
                
            }
        });
    }
}
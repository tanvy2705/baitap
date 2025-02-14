package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {
    JFrame mainView;
    JTextArea textArea;
    JButton clearButton;
    JButton exitButton;
    FlowLayout flowLayout;
    BorderLayout borderLayout;
    JPanel bottonPanel;

    public MainView() {
        mainView = new JFrame();
        mainView.setTitle("Đẹp Trai");
        mainView.setSize(800, 600);

        //components
        textArea = new JTextArea();
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        //Panelis
        bottonPanel = new JPanel();
        //add
        mainView.add(textArea);
        mainView.setVisible(true);


       clearButton.addActionListener(new ActionListener() {
        //
        public void actionPerformed(ActionEvent e) {
            textArea.setText("");
        }
       });
       exitButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
       flowLayout = new FlowLayout();
       bottonPanel.setLayout(flowLayout);
       borderLayout = new BorderLayout();
       mainView.setLayout(flowLayout);
       //
        mainView.add(textArea, BorderLayout.CENTER);
        bottonPanel.add(clearButton);
        bottonPanel.add(exitButton);
        mainView.add(bottonPanel, BorderLayout.SOUTH);
        mainView.setVisible(true);


    }
}

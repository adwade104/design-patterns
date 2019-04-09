package com.wade.adam.pattern.memento.banas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver extends JFrame {

    private Caretaker caretaker = new Caretaker();
    private Originator originator = new Originator();

    private int currentArticle;
    private int saveFiles;

    private JPanel panel;

    private JLabel label;

    private ButtonListener saveListener;
    private ButtonListener undoListener;
    private ButtonListener redoListener;

    private JButton saveButton;
    private JButton undoButton;
    private JButton redoButton;

    private JTextArea article = new JTextArea(40, 60);

    public static void main(String[] args){
        new Driver();
    }

    public Driver() {

        this.setSize(750,750);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        label = new JLabel("Article");

        panel.add(label);
        panel.add(article);

        saveListener = new ButtonListener();
        undoListener = new ButtonListener();
        redoListener = new ButtonListener();

        saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);

        undoButton = new JButton("Undo");
        undoButton.addActionListener(undoListener);

        redoButton = new JButton("Redo");
        redoButton.addActionListener(redoListener);

        panel.add(saveButton);
        panel.add(undoButton);
        panel.add(redoButton);

        this.add(panel);
        this.setVisible(true);

    }

    private class ButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == saveButton){
                String textInTextArea = article.getText();
                originator.setArticle(textInTextArea);
                caretaker.addMemento(originator.storeInMemento());
                saveFiles++;
                currentArticle++;

                System.out.println("Save Files " + saveFiles);

                undoButton.setEnabled(true);
            }
            else if(e.getSource() == undoButton){

                if(currentArticle >= 1){
                    currentArticle--;

                    String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));

                    article.setText(textBoxString);

                    redoButton.setEnabled(true);
                }
                else{

                    undoButton.setEnabled(false);

                }

            }
            else if(e.getSource() == redoButton){

                if((saveFiles - 1) > currentArticle){

                    currentArticle++;

                    String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));

                    article.setText(textBoxString);

                    undoButton.setEnabled(true);

                }
                else {

                    redoButton.setEnabled(false);

                }

            }

        }
    }

}

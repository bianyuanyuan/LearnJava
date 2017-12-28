package com.org.io;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

class QuizCard {
}

public class QuizCardBuilder {
    private ArrayList<QuizCard> cardList;

    public void go() {
        //create and show
    }

    private class NextCardListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            //add and clearnup
        }
    }

    private class SaveMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            //save
        }
    }

    public class NewMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //clearnup
        }
    }

    private void saveFile(File file) {
        //
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter(file));
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        QuizCardBuilder builder =new QuizCardBuilder();
        builder.go();
    }
}

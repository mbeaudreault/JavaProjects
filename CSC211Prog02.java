/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc211project02;
import javax.swing.JFrame;

/**
 *
 * @author bougi
 */
public class CSC211Prog02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException
    {
        JFrame project2Window = new JFrame();
        project2Window.setSize(1024, 800); // width x height 
        project2Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        project2Window.setTitle("Project 2: Let's Play Catch!"); 
        
        // This is the panel for this Lab
        Project02Panel playPanel = new Project02Panel(); 
        project2Window.add(playPanel); 
        
        project2Window.setVisible(true); 
        
        // Launch the ball animation
        playPanel.playCatch();
    }

}

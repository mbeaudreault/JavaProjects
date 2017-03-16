/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc211project02;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;
import java.time.LocalDateTime;



/**
 *
 * @author bougi
 */
//create a class that extends jpanel to be drawn on 
public class Project02Panel extends JPanel{
    //initialze two drawable students matt and ashley
    DrawableStudent matt;
    DrawableStudent ashley;
    
    //Constructor for drawable student objects matt and ashley
    public Project02Panel()
    {
        //Make matt a drawable student named matt, give him a new drawabletextbok 
        //named csc211 at a point 20,400 color the book green, color matt red
        //and place matt at point 60 200
        matt = new DrawableStudent("Matt",
                new DrawableTextbook("Csc 211", 500, new Point(20,400), Color.GREEN),
                Color.RED, new Point(60,200));
        //Make ashley a drawable student named ashely, give ashely a new drawabletextbook
        //named music at the point 760,400, color the book blue
        //Color ashely's shirt pint and set her at the point 800,200
        ashley = new DrawableStudent("Ashley",
                new DrawableTextbook ("Music", 800, new Point(760,400),Color.BLUE),
                Color.PINK, new Point(800, 200));
    }
    //Method that will draw both objects matt and ashley
    public void paintComponent(Graphics pen)
    {
        super.paintComponent(pen);
        //draw ashely first so matt's book will pass infont of ashley not 
        //behind
        ashley.draw(pen);
        matt.draw(pen);
        
    }
    //Place catch method makes one of the object thow his or her book 
    // so they can begin playing catch
    public void playCatch() throws InterruptedException
    {
        //time is the maximum amount of time that the loop can run. Current time plus number of seconds gives max.
       LocalDateTime time = LocalDateTime.now().plusSeconds(20);
       
       //Take the current time as is
       LocalDateTime newTime = LocalDateTime.now();
       
       //start with matt throwing his book to give one book an initial velocity
       matt.tossBook();
       //while less than 20 seconds has gone by
       while(time.compareTo(newTime) > 0)
       {
           //repaint on top of the panel
           repaint();
           //add some delay time so this does not happen too quickly
           Thread.sleep(10);
           //take the time again to see if it is time for them to stop playing catch
           newTime = LocalDateTime.now();
       }
    }
}

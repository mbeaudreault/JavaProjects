/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc211project02;

/**
 * Represents a university student that caries a textbook
 * Student can read the textbook and gain knowledge. 
 * @author Tim Henry
 * @version CSC211 Project 1 Solution
 * 
 */
public class Student
{
    // Student name
    // Default: "Pat Zhang-Garcia"
    protected String name;
    
    // Textbook carried by student
    protected Textbook book;
    
    // Student's health
    // Default: 1.0
    // range: 0 <= health <= 1.0
    protected double health; 
    
    // Student's knowledge gained from book
    // Default: 0
    // min: 0; max: There is none!
    protected int knowledge;  

    // ***********************************
    // Constructors
    /** 
     * Default student initialization
     */
    public Student()
    {
        this("Pat Zhang-Garcia", new Textbook());
    }
    
    /** 
     * Specific student initialization and 
     * assigns name and a pre-defined textbooks to the student
     * @param someName name of student
     * @param someBook textbook student will carry
     */
    public Student(String someName, Textbook someBook)
    {
        name = someName;
        book = someBook;
        health = 1.0;
        knowledge = 0;        
    }

    // ***********************************
    // Accessor methods
    /**
     * Accessor method for student name
     * @return name of student
     */
   public String getName()
    {
        return name;
    }

    /**
     * Accessor method for book title/subject
     * @return book subject data field
     */
    public Textbook getBook()
    {
        return book;
    }

    /**
     * Accessor method for student's current knowledge
     * @return knowledge data field
     */
    public int getKnowledge()
    {
        return knowledge;
    }

    /**
     * Accessor method for student's current health status
     * @return student's health data field
     */
    public double getHealth()
    {
       return health; 
    }

    // ***********************************
    // Mutator Methods    
    /**
     * Setter for student name, no validation on name
     * @param someName the new name of student
     */
    public void setName(String someName)
    {
        name = someName;
    }

   /**
     * Setter for textbook , no validation on book
     * @param someBook the new textbook the student is carrying
     */
    public void setBook(Textbook someBook)
    {
        book = someBook;
    }
    
    /**
     * Has student read book to increase knowledge
     * @param numPages how many pages the student should read
     */
    public void learnSomething(int numPages)
    {
        knowledge += book.readPages(numPages);
    }
}


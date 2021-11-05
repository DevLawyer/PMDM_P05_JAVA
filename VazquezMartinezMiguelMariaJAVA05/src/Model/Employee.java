package Model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Employee {

    // ATTRIBUTES //////////////////////////////////////////////////////////////
    private int number;
    private String name;
    private String surname;
    private String picture;
    private float salary;
    private float maxSalary;
    private GregorianCalendar entryDate;
    
    
    // CONSTRUCTOR /////////////////////////////////////////////////////////////
    public Employee(String number, String name, String surname, String picture, String salary, String maxSalary, String entryDate){
        this.setNumber(number);
        this.setName(name);
        this.setSurname(surname);
        this.setPicture(picture);
        this.setSalary(salary);
        this.setMaxSalary(maxSalary);
        this.setEntryDate(entryDate);
    }
    
    
    // SETTERS /////////////////////////////////////////////////////////////////
    private void setNumber(String number){
        try{
            this.number = Integer.parseInt(number);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor para NUMERO es erroneo.");
        }
    }
    
    private void setName(String name){
        this.name = name;
    }
        
    private void setSurname(String surname){
        this.surname = surname;
    }
            
    private void setPicture(String picture){
        this.picture = picture;
    }
                
    private void setSalary(String salary){
        try{
            this.salary = Float.parseFloat(salary);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor para SALARIO es erroneo.");
        }        
    }
                    
    private void setMaxSalary(String maxSalary){
        try{
            this.maxSalary = Float.parseFloat(maxSalary);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor para SALARIO MAXIMO es erroneo.");
        }        
    }
                        
    private void setEntryDate(String entryDate){
        String[] auxDate = entryDate.split("/");
        
        this.entryDate = new GregorianCalendar(
                                                Integer.parseInt(auxDate[0]), 
                                                Integer.parseInt(auxDate[1]), 
                                                Integer.parseInt(auxDate[2]));
    }
    
    
    // GETTERS /////////////////////////////////////////////////////////////////
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public BufferedImage getPicture(){
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(picture));
        } catch (IOException ex) {
            try {
                myPicture = ImageIO.read(new File("default.jpg"));
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(null, "Error al cargar la imagen.");
            }
        }
        
        return myPicture;
    }
    
    public float getSalary(){
        return salary;
    }
    
    public float getMaxSalary(){
        return maxSalary;
    }
    
    public String getEntrydate(){
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        return formatDate.format(entryDate.getTime());        
    }
    
    @Override
    public String toString(){
        return "";
    }
    
}

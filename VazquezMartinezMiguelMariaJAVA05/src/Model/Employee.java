/**
* 
* @author Miguel Maria Vazquez Martinez
* Fifth practice of module PMDM.
* 
*/

package Model;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Employee {

    /**
     * Attributes.
     */
    private int number;
    private String name;
    private String surname;
    private String picture;
    private float salary;
    private float maxSalary;
    private GregorianCalendar entryDate;
    
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Employee(String number, String name, String surname, String picture, String salary, String maxSalary, String entryDate){
        /**
         * Constructor to create an object of this class which recieve a few String parameters.
         * 
         * @param number Number of the new employee. This number must be diferente.
         * @param name
         * @param surname
         * @param picture
         * @param salary
         * @param maxSalary
         * @param entryDate The entry date has the following format yyyy-MM-dd.
         */
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
        /**
         * This method parse the String number parameter to int number attribute and save it.
         * 
         * @param number
         */
        try{
            this.number = Integer.parseInt(number);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor para NUMERO es erroneo.");
        }
    }
    
    private void setName(String name){
        /**
         * This method save the String name parameter into String name attribute.
         * 
         * @param name
         */
        this.name = name;
    }
        
    private void setSurname(String surname){
        /**
         * This method save the String surname parameter into String surname attribute.
         * 
         * @param surname
         */
        this.surname = surname;
    }
            
    private void setPicture(String picture){
        /**
         * This method save the String picture parameter into String picture attribute.
         * 
         * @param picture
         */
        this.picture = picture;
    }
                
    private void setSalary(String salary){
        /**
         * This method parse the String salary parameter to float salary attirbute and save it.
         * 
         * @param salary
         */
        try{
            this.salary = Float.parseFloat(salary);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor para SALARIO es erroneo.");
        }        
    }
                    
    private void setMaxSalary(String maxSalary){
        /**
         * This method parse the String maxSalary parameter to float maxSalary attirbute and save it.
         * 
         * @param maxSalary
         */
        try{
            this.maxSalary = Float.parseFloat(maxSalary);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor para SALARIO MAXIMO es erroneo.");
        }        
    }
                        
    private void setEntryDate(String entryDate){
        /**
         * This method split the String entryDate parameter and create and save an object 
         * of Gregorian Calendar class.
         * 
         * @param entryDate
         */
        String[] auxDate = entryDate.split("-");
        
        this.entryDate = new GregorianCalendar(
                                                Integer.parseInt(auxDate[0]), 
                                                Integer.parseInt(auxDate[1]), 
                                                Integer.parseInt(auxDate[2]));
    }
    
    
    // GETTERS /////////////////////////////////////////////////////////////////
    public int getNumber(){
        /**
         * This method return the value of number attribute.
         * 
         * @return number
         */
        return number;
    }
    
    public String getName(){
        /**
         * This method return the value of name attribute.
         * 
         * @return name
         */
        return name;
    }
    
    public String getSurname(){
        /**
         * This method return the value of surname attribute.
         * 
         * @return surname
         */
        return surname;
    }
    
    public String getPicture(){
        /**
         * This method return the value of picture attribute.
         * 
         * @return picture
         */
        return picture;
    }
    
    public float getSalary(){
        /**
         * This method return the value of salary attribute.
         * 
         * @return salary
         */        
        return salary;
    }
    
    public float getMaxSalary(){
        /**
         * This method return the value of maxSalary attribute.
         * 
         * @return maxSalary
         */        
        return maxSalary;
    }
    
    public String getEntrydate(){
        /**
         * This method return the value of entryDate attribute as a format String.
         * 
         * @return entryDate with the following format dd/MM/yyyy.
         */             
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        return formatDate.format(entryDate.getTime());        
    }
    
    @Override
    public String toString(){
        /**
         * This method return the content of the object as a String.
         * 
         * @return String object.
         */             
        return Integer.toString(this.number)+";"+
                this.name+";"+
                this.surname+";"+
                Float.toString(this.salary)+";"+
                Float.toString(this.maxSalary)+";"+
                sdf.format(entryDate.getTime());
    }
    
}

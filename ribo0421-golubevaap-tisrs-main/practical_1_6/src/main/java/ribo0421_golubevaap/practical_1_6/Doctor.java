/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_golubevaap.practical_1_6;

/**
 *
 * @author user
 */
public class Doctor {
    private String name;
    private int age;
    private String education;
    
    public Doctor(String name,int age,String education){
        this.name = name;
        this.age = age;
        this.education = education; 
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getEducation(){
        return this.education;
    }
    
    public String writeRecipe(String recipe){
        return "";
    }
}

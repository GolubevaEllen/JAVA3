/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_golubevaap.practical_1_6;

/**
 *
 * @author user
 */
public class Surgery extends Doctor {
    private int work_exp;

    public Surgery(int work_exp, String name, int age, String education) {
        super(name, age, education);
        this.work_exp = work_exp;
    }
    
    public int getWorkexp() {
        return this.work_exp;
    }

    @Override
    public String writeRecipe(String recipe){
        String str = "";
        for (int i = 0; i < recipe.length(); i++) {
            str += Character.toUpperCase(recipe.charAt(i));
        }
        return str;
    }
}
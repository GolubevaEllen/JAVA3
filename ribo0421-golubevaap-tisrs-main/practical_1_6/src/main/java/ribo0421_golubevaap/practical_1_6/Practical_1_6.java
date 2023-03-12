/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ribo0421_golubevaap.practical_1_6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practical_1_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Имя: ");
        String name = scan.nextLine();
        System.out.println("Возраст: ");
        int age  = scan.nextInt();
        System.out.println("Степень образования: ");
        String education  = scan.nextLine();
        System.out.println("Он терапевт? (true/false): ");
        boolean therapist  = scan.nextBoolean();
        if (therapist) {
            System.out.println("Опыт работы: ");
            int work_exp = scan.nextInt();
            Therapist ther = new Therapist(work_exp, name, age, education);
            System.out.println();
            System.out.println(ther.getName()+", "+ther.getAge()+", " +
                    ther.getEducation()+", "+ ther.getWorkexp());
            System.out.println("Рецепт: ");
            String recipe = scan.nextLine();
            System.out.println(ther.writeRecipe(recipe));
        }
        else {
          System.out.println("Он хирург? (true/false): ");
          boolean surgery  = scan.nextBoolean(); 
          if (surgery){
            System.out.println("Опыт работы: ");
            int work_exp = scan.nextInt();
            Surgery surg = new Surgery(work_exp, name, age, education);
            System.out.println();
            System.out.println(surg.getName()+", "+surg.getAge()+", " +
                    surg.getEducation()+", "+ surg.getWorkexp());
            System.out.println("Рецепт: ");
            String recipe = scan.nextLine();
            System.out.println(surg.writeRecipe(recipe));
          }
          else {
                Doctor doc = new Doctor(name, age, education);
                System.out.println(doc.getName()+", "+doc.getAge()+", " +
                    doc.getEducation()); 
          }
        }
    }
}

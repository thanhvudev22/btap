/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teaches3;

import java.util.Scanner;

/**
 *
 * @author VAN DU
 */
public class Teaches3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap vao mot gia tri: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Day la mot so nguyen: " + number);
            } else {
                System.out.println("Day khong phai la so nguyen.");
            }
            // TODO code application logic here
        }
    }
       
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacher2;

import java.util.Scanner;

/**
 *
 * @author VAN DU
 */
public class Teacher2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap vao mot ky tu: ");
            
            if (scanner.hasNext()) {
                System.out.println("Ky tu nhap vao la chuoi.");
            } else {
                System.out.println("Ky tu nhap vao khong phai la chuoi.");
            }
        }
    }
        // TODO code application logic here
    
    
}

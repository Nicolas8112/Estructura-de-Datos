package Recursion;

import javax.swing.*;
import java.util.Scanner;

public class Recursion {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String text = "1";
        int entrada = 0;
        int cont = 2;
        int result = 1;

        entrada = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Ingrese el limite"));


        while(cont<=entrada) {

            text += "+" + cont;

            result += cont;


            cont++;

        }

        JOptionPane.showMessageDialog(null, text + "=" + result);







    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Application;

import java.util.*;

/**
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
* @date 01/05/2024
* @brief Class Program
 */
public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Inicializando Variaveis
        int x1,x2,x3,y1,y2,y3;
        double distance;
        double inclination1,inclination2;
        
        System.out.println("Digite as coordenadas dos Pontos:");
        System.out.println("Ponto 1:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Ponto 2:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Ponto 3:");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        
        
        inclination1 =  (double) (y2-y1)/(x2-x1);
        inclination2 =  (double) (y3-y1)/(x3-x1);
        
        
        //Verificando se são Colineares, Caso seja Imprime a distancia, Caso não informa que não estão alinhados
        if(inclination1 == inclination2){
            distance = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
            System.out.println("Distancia: " + distance);
        } else {
            System.out.println("Pontos não alinhados");
        }       
        
        //Fechando o Scanner
        sc.close();
    }
}

/*
 * Copyright (C) 2024 Josias Junior Santos  <josiajrsantos@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista1;

/**
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
* @date 04/03/2024
* @brief Class Ex13
 */
import java.util.Scanner;
public class Ex13 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        String [] mensagem = new String [N];
        for ( int i = 0; i < N; i++){
            mensagem[i] = sc.nextLine();       
        }
        for (String palavra : mensagem) {
            String palavraCriptografada = "";
            
            for(int j = 0; j < palavra.length(); j++){
                char caractere = palavra.charAt(j);
                
                char novoCaractere = criptografarCaractere(caractere);
                palavraCriptografada += novoCaractere;              
            }
            String invertida = "";
           for(int i = palavraCriptografada.length() - 1; i >= 0; i--){
               invertida = invertida + palavraCriptografada.charAt(i);
   }
        int meio = invertida.length()/2;
       String primeiraMetade = invertida.substring(0, meio);
       String segundaMetade = invertida.substring(meio);   
       String palavraCriptografada2 ="";
       for(int i = 0; i < segundaMetade.length();i++){
           char caractere2 = segundaMetade.charAt(i);
           char novoCaractere2 = criptografarCaractere2(caractere2);
           palavraCriptografada2 += novoCaractere2;
       }
       System.out.println(primeiraMetade+palavraCriptografada2);
        }
}
    
   public static char criptografarCaractere(char caractere) {
    if (caractere >= 'a' && caractere <= 'z') {
        return (char) ('a' + (caractere - 'a' + 3) % 127);
    } else if (caractere >= 'A' && caractere <= 'Z') {
        return (char) ('A' + (caractere - 'A' + 3) % 127);
    } else {
        return caractere;
    }
}

    private static char criptografarCaractere2(char caractere2) {
      if (caractere2 >= 'a' && caractere2 <= 'z') {
        return (char) ('a' + (caractere2 - 'a' - 1) % 127);
    } else if (caractere2 >= 'A' && caractere2 <= 'Z') {
        return (char) ('A' + (caractere2 - 'A' - 1) % 127);
    } else if (caractere2 >= '!' && caractere2 <= '~'){
        return (char) ('!' + (caractere2 - '!' - 1) % 127 );
    } else {
        return caractere2;
    }
    }
}

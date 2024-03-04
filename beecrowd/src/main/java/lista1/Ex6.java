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
* @brief Class Ex6
 */
import java.util.Arrays;
import java.util.Scanner;
public class Ex6 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores);
        for (int valor : valores) {
            System.out.println(valor);
        }
        System.out.println();
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        
        sc.close();
    }
}

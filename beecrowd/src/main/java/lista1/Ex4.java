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
* @brief Class Ex4
 */
import java.util.Scanner;
public class Ex4 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		if( x >= 0 && x <= 25) {
		System.out.println("Intervalo [0,25]");
		} 
		else if( x >= 25 && x <= 50) {
		System.out.println("Intervalo (25,50]");
		}
		else if( x >= 50 && x <= 75) {
		System.out.println("Intervalo (50,75]");
		}
		else if( x >= 75 && x <= 100) {
		System.out.println("Intervalo (75,100]");
		}
		else {
		System.out.println("Fora de intervalo");
		}
		sc.close();
	}
}

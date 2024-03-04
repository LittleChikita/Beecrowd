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
* @brief Class Ex10
 */
import java.util.Scanner;
public class Ex10 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1;
        while (sc.hasNext()) {
            N = sc.nextInt();
            int Nivel = 0;
            for (int i = 0; i < N; i++) {
                int V = sc.nextInt();
                if (V >= 20) {
                    Nivel = 3;
                } else if (V >= 10 && V < 20 && Nivel < 3) {
                    Nivel = 2;
                } else if (V < 10 && Nivel < 2) {
                    Nivel = 1;
                }
            }
            if (Nivel > 0) {
                System.out.println(Nivel);
            }
        }
        sc.close();
    }
}

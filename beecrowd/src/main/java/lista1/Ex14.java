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
 * @brief Class Ex14
 */
import java.util.Scanner;

public class Ex14 {

    static class Pilha {

        int[] vetor;
        int topo;

        Pilha() {
            vetor = new int[MAX];
            topo = -1;
        }

        void push(int id) {
            vetor[++topo] = id;
        }

        void pop() {
            topo--;
        }
    }

    static final int MAX = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int vagoes = sc.nextInt();
            if (vagoes == 0) {
                break;
            }

            while (true) {
                Pilha p = new Pilha();
                int entrando = 1, deuruim = 0, zero = 0;

                for (int i = 0; i < vagoes && deuruim == 0 && zero == 0; i++) {
                    int fora = sc.nextInt();

                    if (fora == 0) {
                        zero = 1;
                        break;
                    }

                    while (true) {
                        if (fora == entrando) {
                            entrando++;
                            break;
                        } else if (fora > entrando) {
                            p.push(entrando);
                            entrando++;
                        } else {
                            if (p.vetor[p.topo] == fora) {
                                p.pop();
                            } else {
                                deuruim = 1;
                                for (; i < vagoes - 1; i++) {
                                    sc.nextInt();
                                }
                            }
                            break;
                        }
                    }
                }

                if (zero == 0) {
                    if (deuruim == 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    break;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

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
 * @brief Class Ex12
 */
import java.util.*;

public class Ex12 {

    static final int INF = 999999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int[][] dist = new int[4005][26];
            List<List<Pair>> adj = new ArrayList<>();
            Map<String, Integer> m = new HashMap<>();
            int marcaVertice = 1;

            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            String origem = sc.next();
            String destino = sc.next();

            m.put(origem, 1);
            m.put(destino, 2);
            marcaVertice = 3;

            for (int i = 0; i < (2 * n + 10); i++) {
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < n; i++) {
                String s1 = sc.next();
                String s2 = sc.next();
                String s3 = sc.next();
                int x, y;
                if (!m.containsKey(s1)) {
                    m.put(s1, marcaVertice);
                    x = marcaVertice;
                    marcaVertice++;
                } else {
                    x = m.get(s1);
                }
                if (!m.containsKey(s2)) {
                    m.put(s2, marcaVertice);
                    y = marcaVertice;
                    marcaVertice++;
                } else {
                    y = m.get(s2);
                }

                adj.get(x).add(new Pair(y, s3));
                adj.get(y).add(new Pair(x, s3));
            }

            for (int i = 0; i < 4005; i++) {
                Arrays.fill(dist[i], INF);
            }

            for (int i = 0; i < 26; i++) {
                dist[1][i] = 0;
            }

            PriorityQueue<Triple> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.first));
            pq.add(new Triple(0, 1, 'a'));

            while (!pq.isEmpty()) {
                Triple front = pq.poll();
                int d = front.first;
                int v = front.second;
                char cx = front.third;
                for (Pair pair : adj.get(v)) {
                    char c = pair.second.charAt(0);
                    if (v != 1 && c == cx) {
                        continue;
                    }

                    if (dist[pair.first][c - 'a'] >= dist[v][cx - 'a'] + pair.second.length()) {
                        dist[pair.first][c - 'a'] = dist[v][cx - 'a'] + pair.second.length();
                        pq.add(new Triple(dist[pair.first][c - 'a'], pair.first, c));
                    }
                }
            }

            int mn = INF;
            for (int i = 0; i < 26; i++) {
                mn = Math.min(mn, dist[2][i]);
            }

            if (mn == INF) {
                System.out.println("impossivel");
            } else {
                System.out.println(mn);
            }

            m.clear();
            adj.clear();
        }
        sc.close();
    }

    static class Pair {

        int first;
        String second;

        Pair(int first, String second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Triple {

        int first;
        int second;
        char third;

        Triple(int first, int second, char third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
}

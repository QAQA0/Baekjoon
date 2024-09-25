import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class tomato {
        int x;
        int y;
        int count;

        tomato(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    static int n;
    static int m;
    static Queue<tomato> que = new LinkedList<>();
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] map;
    static int day = 0;
    static int zeroCount = 0;
    static int totalCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) {
                    zeroCount++;
                } else if (map[i][j] == 1) {
                    que.add(new tomato(i, j, 0));
                }
            }
        }

        bfs();
        if (zeroCount == 0) {
            System.out.println(0);
        } else if (zeroCount == totalCount) {
            System.out.println(day);
        } else{
            System.out.println(-1);
        }
    }

    private static void bfs() {
        while (!que.isEmpty()) {
            tomato t = que.poll();

            for (int i = 0; i < 4; i++) {
                if (t.x + dx[i] >= 0 && t.x + dx[i] < n && t.y + dy[i] >= 0 && t.y + dy[i] < m) {
                    if(map[t.x + dx[i]][t.y + dy[i]] == 0) {
                        que.add(new tomato(t.x + dx[i], t.y + dy[i], t.count + 1));
                        map[t.x + dx[i]][t.y + dy[i]] = 1;
                        day = t.count + 1;
                        totalCount++;
                    }
                }
            }
        }
    }
}
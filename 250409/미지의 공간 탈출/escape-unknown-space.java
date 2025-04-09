import java.io.*;
import java.util.*;

/*
아이디어: bfs
포인트: 시간정육면체 어떻게 저장? + 사방탐색이 어떻게 함?

*/
public class Main {
    static class Point{
        int type;       // 미지, 동, 서, 남, 북, 윗면
        int cnt;        // 시간
        int x;
        int y;

        public Point(int type, int cnt, int x, int y){
            this.type = type;
            this.cnt = cnt;
            this.x = x;
            this.y = y;
        }
    }

    static int n, m, f;     // 미지공간, 시간정육면체, 이상현상수
    static int [][] map;
    static List<int[][]> list = new ArrayList<>();
    static Queue<Point> que = new LinkedList<>();
    static int [] escape = new int[2];
    static int [] dx = {-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        escape = new int[2];
        // 미지 공간 setting
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2){     // 출발 위치
                    escape[0] = i;
                    escape[1] = j;
                }
            }
        }

        // 0:동, 1:서, 2:남, 3:북, 4:윗면
        for(int i = 0; i < 5; i++){
            list.add(new ArrayList<>());
        }

        // 시간 정육면체 setting

        for(int i = 0; i < 5; i++){
            int [][] tmp = new int[m][m];
            for(int j = 0; j < m; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < m; k++){
                    tmp[j][k] = Integer.parseInt(st.nextToken());

                    if(tmp[j][k] == 2){     // 시작 위치
                        que.add(new Point(i, 0, j, k));     // 방면 위치, 시간, 현재 위치
                    }
                }

            }
            list.get(i).add(tmp);
        }

        int answer = bfs();
    }

    static int bfs(){
        // 미지: -1, 0:동, 1:서, 2:남, 3:북, 4:윗면
        int minTime = Integer.MAX_VALUE;

        while(!que.isEmpty()){
            Point p = que.poll();

            if(p.x == escape[0] && p.y == escape[1]){
                minTime = Math.max(minTime, p.cnt);
                continue;
            }

            for(int i = 0; i < 4; i++){
                int dx = 
            }
        }
    }
}
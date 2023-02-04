package Homeworks.HW5;

import java.util.*;

public class HW5 {
    public static void main(String[] args) {
        int[][] map = CreateMap();
        printMap(map);
        int[] beginCoord = setBegin(map);
        int[] endCoord = setEnd(map);
        GiveMeWave(map, beginCoord, endCoord);
        printMap(map);
    }

    private static void GiveMeWave(int[][] map, int[] begin, int[] end) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(begin);
        while (!q.isEmpty()){
            int[] next;
            int[] current = q.poll();
            if (current[1] != 0 && map[current[1] - 1][current[0]] == 0) {
                map[current[1] - 1][current[0]] = map[current[1]][current[0]] + 1;
                next = new int[]{current[0], current[1] - 1};
                q.add(next);
            }

            if (current[0] != map[0].length - 1 && map[current[1]][current[0] + 1] == 0) {
                map[current[1]][current[0] + 1] = map[current[1]][current[0]] + 1;
                next = new int[]{current[0] + 1, current[1]};
                q.add(next);
            }

            if (current[1] != map.length - 1 && map[current[1] + 1][current[0]] == 0) {
                map[current[1] + 1][current[0]] = map[current[1]][current[0]] + 1;
                next = new int[]{current[0], current[1] + 1};
                q.add(next);
            }

            if (current[0] != 0 && map[current[1]][current[0] - 1] == 0) {
                map[current[1]][current[0] - 1] = map[current[1]][current[0]] + 1;
                next = new int[]{current[0] - 1, current[1]};
                q.add(next);
            }
        }
        List<Integer> endCalc = new ArrayList<>();

        if(end[1] + 1 != map.length && map[end[1] + 1][end[0]] != -1) {
            endCalc.add(map[end[1] + 1][end[0]]);
        }
        if(end[1] - 1 != 0 && map[end[1] - 1][end[0]] != -1) {
            endCalc.add(map[end[1] - 1][end[0]]);
        }
        if(end[0] + 1 != map[0].length && map[end[1]][end[0] + 1] != -1) {
            endCalc.add(map[end[1]][end[0] + 1]);
        }
        if(end[0] - 1 != 0 && map[end[1]][end[0] - 1] != -1) {
            endCalc.add(map[end[1]][end[0] - 1]);
        }

        int shortestWay = Collections.min(endCalc);
        System.out.printf("Наименьшее расстояние от точки с координатами (%d;%d) до точки с координатами (%d;%d)  равно %d \n",
                begin[1] + 1, begin[0] + 1, end[1] + 1, end[0] + 1, shortestWay);
        }

    private static int[] setEnd(int[][] map) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты точки выхода через пробел x(1 - 8) y(1 - 11):");
        String[] exitPos = scan.nextLine().split(" ");
        int[] endPos = new int[2];
        for (int i = 0; i < exitPos.length; i++) {
            endPos[i] = Integer.parseInt(exitPos[i]) - 1;
        }
            map[endPos[1]][endPos[0]] = -2;
        return endPos;
    }

    private static void printMap(int[][] map) {
        for (int[] ints : map) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[] setBegin(int[][] map) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты точки начала через пробел x(1 - 8) y(1 - 11):");
        String[] playerPos = scan.nextLine().split(" ");
        int[] beginPos = new int[2];
        for (int i = 0; i < playerPos.length; i++) {
            beginPos[i] = Integer.parseInt(playerPos[i]) - 1;
        }
        map[beginPos[1]][beginPos[0]] = 1;

        return beginPos;
    }

    private static int[][] CreateMap() {
        return new int[][] {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, -1, 0, 0, 0, 0, 0 },
                { 0, 0, -1, 0, -1, 0, -1, 0 },
                { 0, 0, -1, 0, 0, 0, -1, 0 },
                { 0, 0, -1, 0, 0, 0, -1, 0 },
                { 0, -1, -1, -1, -1, -1, -1, 0 },
                { 0, 0, -1, 0, 0, 0, -1, 0 },
                { 0, 0, -1, 0, 0, 0, -1, 0 },
                { 0, 0, 0, 0, 0, 0, -1, 0 },
                { 0, 0, 0, 0, 0, 0, -1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 }
        };

    }
}



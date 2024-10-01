//package com.qProject.queue.InterviewProblems;
//
////**
//// problem statement : Given a rectangle with left bottom as (0,0) and right top as (x,y).
//// there are n circles such that their centers lie inside the rectangle. Radius of each circle is R
//// Job is to find if its possible to reach from (0,0) -> (x,y)
////
//// *
////
//
//
//import java.util.ArrayList;
//
//public class ValidPath_Graphs {
//    static int[] idxX = {0, 1, 0, -1, -1, -1, 1, 1};
//    static int[] idxY = {1, 0, -1, 0, -1, 1, -1, 1};
//    public static void main(String[] args) {
//
//    }
//
//    public static boolean isInsideCircle(int x, int y, int centerX, int centerY, int radius){
//        return ((x-centerX)*(x-centerX) + (y-centerY)*(y-centerY) <= radius*radius)? true: false;
//    }
//
////    public static boolean dfs(int[][] grid, int[][] visited, int startX, int startY, int destinationX, int destinationY) {
////        if(grid[startX][startY] == -1) {
////            return false;
////        }
////        visited[startX][startY] = -1;
////        if (startX == destinationX && startY == destinationY) {
////            return true;
////        }
////
////        for (int i =0; i <= 8; i++){
////            int newStart = startX+idxX[i];
////            int newEnd = startY+idxY[i];
////        }
////
////
////
////    }
//
//    public static String isValidPath(int x, int y, int N, int R, ArrayList<Integer> ithCircleX, ArrayList<Integer> ithCircleY) {
//        int[][] grid = new int[x+1][y+1];
//        int[][] visited = new int[x+1][y+1];
//        for (int i=0; i<= x; i++) {
//            for (int j=0; j < y; j++) {
//                for(int k =0; k < N; k++) {
//                    if (isInsideCircle(i, j, ithCircleX.get(k),ithCircleY.get(k), R)) {
//                        grid[i][j] = -1;
//                        break;
//                    }
//
//                }
//            }
//        }
//        if(dfs(grid, visited, 0, 0, x, y)) {
//            return "YES";
//        }
//        else {
//            return "NO";
//        }
//
//    }
//}

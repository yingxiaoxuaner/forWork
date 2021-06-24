package com.qiyi.datastructure.sparsearray;
import java.io.*;

public class StoreData {
    public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    //创建原始的二维数组 11*11
    //0表示没有棋子，1表示黑子，2表示蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[6][1] = 1;
        chessArr1[7][9] = 2;
        chessArr1[2][8] = 2;
    //输出原始的二维数组
        System.out.println("原始的二维数组：");
        for(int[] row : chessArr1) {
            for(int data : row)
                System.out.printf("%d\t",data);
                System.out.println();
        }
        //将二维数组转稀疏数组的思想
        //1.先遍历二维数组，得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for(int j = 0; j < 11; j++) {
                if(chessArr1[i][j]!=0) {
                    sum++;
                }
                }
        }
        //2.创建对应的稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;//记录行数
        sparseArr[0][1] = 11;//记录列数
        sparseArr[0][2] = sum;//记录非零元素的个数
        //遍历二维数组，将非0字符的值存放到稀疏数组中
        int count = 0;//用于记录是第几个非0数据
        for (int i = 0; i < 11; i++) {
            for(int j = 0; j < 11; j++) {
                if(chessArr1[i][j]!=0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        //输出稀疏数组的形式
        System.out.println();
        File file = new File("./map.data");//相对路径上一级
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));//字符流
        FileOutputStream fos = new FileOutputStream(file);//字节流
        System.out.println("得到的稀疏数组为~");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
            String str = ""+sparseArr[i][0]+" "+sparseArr[i][1]+" "+sparseArr[i][2];
            fos.write(str.getBytes());
            bw.write(str);
            if(i == sparseArr.length-1) break;
            fos.write("\r\n".getBytes());
                //bw.newLine();
            bw.write("\r\n");
        }
        fos.close();
        bw.close();
 }
 }
package com.qiyi.datastructure.sparsearray;

import java.awt.*;
import java.io.*;


/**
 * 稀疏数组
 *
 */
public class SparseArray {
    public static void main(String[] args){
        //创建一个原始的二维数组
        //0 表示没有棋子，1表示黑子，2表示白子
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        //输出原始的二维数组
        System.out.println("这是原始的二维矩阵");
        for (int[] row:chessArr) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //转化成稀疏矩阵
        //1.先遍历二维数组得到非0数据的值
        int sum = 0;//记录非零值
        for(int i = 0; i < 11; i++)//11即chessArr.lenth
            for(int j = 0; j < 11; j++)//11即chessArr[0].length
            {
                if(chessArr[i][j] != 0){
                    sum++;
                }
            }
//        System.out.println(sum);
        int sparseArr[][] = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组将非零值存入稀疏数组
        int count = 0;//用于记录是第几个非0数据
        for(int i = 0; i < 11; i++)
            for(int j = 0; j < 11; j++){
                if(chessArr[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        //输出稀疏数组
        System.out.println();
        System.out.println("得到的稀疏数组为：");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
            //System.out.println(sparseArr[i][0]+"\t"+sparseArr[i][1]+"\t"+sparseArr[i][2]);
            System.out.println();//在printf后加\n也可
        }
        //将稀疏数组恢复成二维数组
        //1.先读取稀疏数组的第一行，创建原始二维数组
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        //2、再读取稀疏数组后几行的数据，并赋值
        for(int i = 1; i < sparseArr.length; i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }


        //输出恢复后的二维数组
        System.out.println();
        System.out.println("恢复后的二维数组：");
        for (int[] row:chessArr2) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
    //有文件写入读取新方法
    public static void newMethod() throws Exception{
        //创建一个原始的二维数组 11*11
        //0 表示没有棋子  1 表示黑子  2  表示蓝子
        int chessArr1[][]=new int[11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        chessArr1[3][4]=5;
        //输出二维数组
        System.out.println("原始的二维数组-----");
        for (int[] row:chessArr1 ) {
            for (int data:row ) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组转为稀疏数组
        //1.遍历二维数组，得到非0的数据的个数
        int sum=0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum的个数:"+sum);

        //创建稀疏数组
        int sparseArr[][]=new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0]=chessArr1.length;
        sparseArr[0][1]=chessArr1.length;
        sparseArr[0][2]=sum;

        //遍历二维数组，将非0的值存放到sparseArr中
        int count=0;//用于记录非零数据
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=chessArr1[i][j];
                }
            }
        }

        // 保存稀疏数组
        File file = new File("map.data");
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter write = new OutputStreamWriter(fos, "UTF-8");

        //输出稀疏数组
        System.out.println();
        System.out.println("输出稀疏数组-----");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
            if (i == sparseArr.length - 1) {
                write.append(sparseArr[i][0] + "," + sparseArr[i][1] + "," + sparseArr[i][2]);
            } else {
                write.append(sparseArr[i][0] + "," + sparseArr[i][1] + "," + sparseArr[i][2] + ",");
            }
        }

        System.out.println("写入文件中...");
        write.close();
        fos.close();


        System.out.println("打开文件中...");
        Desktop.getDesktop().open(file);

        System.out.println("-------读取map.data");
        // 创建 FileReader 对象
        FileInputStream fis = new FileInputStream(file);

        InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());// 转成char加到StringBuffer对象中
        }

        System.out.println(sb.toString());
        reader.close();// 关闭读取流
        fis.close();// 关闭输入流,释放系统资源

        //创建新的稀疏数组
        String[] str = sb.toString().split(",");
        int chessArr2[][]= new int[str.length / 3][3];

        // 给稀疏数组赋值
        int i = 0;
        for (String s : str) {
            chessArr2[i/3][i % 3]=Integer.parseInt(s);
            i++;
        }

        // 1. 读取稀疏数组的第一行,根据第一行的数据,创建原始的二维数组
        int chessArr22[][] = new int[chessArr2[0][0]][chessArr2[0][1]];

        // 2. 在读取稀疏数组后几行的数据,并赋给 原始的二维数组 即可.
        for (int i3 = 1; i3 < chessArr2.length; i3++) {
            chessArr22[chessArr2[i3][0]][chessArr2[i3][1]] = chessArr2[i3][2];
        }

        //输出恢复后的二维数组
        System.out.println("恢复后的二维数组-----");
        for (int[] row:chessArr2 ) {
            for (int data:row ) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}


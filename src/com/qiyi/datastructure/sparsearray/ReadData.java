package com.qiyi.datastructure.sparsearray;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadData {
    public static void main(String[] args)throws Exception{
        //ʹ��BufferedReader��ȡ�ļ��������ַ�������
        BufferedReader br = new BufferedReader(new FileReader("./map.data"));
        String firstLine = br.readLine();//���ж�ȡ
        int raws = Integer.parseInt(firstLine.split(" ")[0]);
        int cols = Integer.parseInt(firstLine.split(" ")[1]);
        int num  =  Integer.parseInt(firstLine.split(" ")[2]);
        int chessArr2[][] = new int[raws][cols];
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
            raws = Integer.parseInt(line.split(" ")[0]);
            cols = Integer.parseInt(line.split(" ")[1]);
            num = Integer.parseInt(line.split(" ")[2]);
            chessArr2[raws][cols] = num;
        }
        System.out.println("����ָ���Ķ�ά���飺 ");
        for (int[] row : chessArr2){
            for (int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        br.close();
    }
}


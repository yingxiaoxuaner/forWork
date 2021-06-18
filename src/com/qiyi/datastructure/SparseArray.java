package com.qiyi.datastructure;

import java.awt.*;
import java.io.*;


/**
 * ϡ������
 *
 */
public class SparseArray {
    public static void main(String[] args){
        //����һ��ԭʼ�Ķ�ά����
        //0 ��ʾû�����ӣ�1��ʾ���ӣ�2��ʾ����
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        //���ԭʼ�Ķ�ά����
        System.out.println("����ԭʼ�Ķ�ά����");
        for (int[] row:chessArr) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //ת����ϡ�����
        //1.�ȱ�����ά����õ���0���ݵ�ֵ
        int sum = 0;//��¼����ֵ
        for(int i = 0; i < 11; i++)//11��chessArr.lenth
            for(int j = 0; j < 11; j++)//11��chessArr[0].length
            {
                if(chessArr[i][j] != 0){
                    sum++;
                }
            }
//        System.out.println(sum);
        int sparseArr[][] = new int[sum+1][3];
        //��ϡ�����鸳ֵ
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //������ά���齫����ֵ����ϡ������
        int count = 0;//���ڼ�¼�ǵڼ�����0����
        for(int i = 0; i < 11; i++)
            for(int j = 0; j < 11; j++){
                if(chessArr[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        //���ϡ������
        System.out.println();
        System.out.println("�õ���ϡ������Ϊ��");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
            //System.out.println(sparseArr[i][0]+"\t"+sparseArr[i][1]+"\t"+sparseArr[i][2]);
            System.out.println();//��printf���\nҲ��
        }
        //��ϡ������ָ��ɶ�ά����
        //1.�ȶ�ȡϡ������ĵ�һ�У�����ԭʼ��ά����
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        //2���ٶ�ȡϡ��������е����ݣ�����ֵ
        for(int i = 1; i < sparseArr.length; i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }


        //����ָ���Ķ�ά����
        System.out.println();
        System.out.println("�ָ���Ķ�ά���飺");
        for (int[] row:chessArr2) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
    //���ļ�д���ȡ�·���
    public static void newMethod() throws Exception{
        //����һ��ԭʼ�Ķ�ά���� 11*11
        //0 ��ʾû������  1 ��ʾ����  2  ��ʾ����
        int chessArr1[][]=new int[11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        chessArr1[3][4]=5;
        //�����ά����
        System.out.println("ԭʼ�Ķ�ά����-----");
        for (int[] row:chessArr1 ) {
            for (int data:row ) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //����ά����תΪϡ������
        //1.������ά���飬�õ���0�����ݵĸ���
        int sum=0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum�ĸ���:"+sum);

        //����ϡ������
        int sparseArr[][]=new int[sum+1][3];
        //��ϡ�����鸳ֵ
        sparseArr[0][0]=chessArr1.length;
        sparseArr[0][1]=chessArr1.length;
        sparseArr[0][2]=sum;

        //������ά���飬����0��ֵ��ŵ�sparseArr��
        int count=0;//���ڼ�¼��������
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

        // ����ϡ������
        File file = new File("map.data");
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter write = new OutputStreamWriter(fos, "UTF-8");

        //���ϡ������
        System.out.println();
        System.out.println("���ϡ������-----");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
            if (i == sparseArr.length - 1) {
                write.append(sparseArr[i][0] + "," + sparseArr[i][1] + "," + sparseArr[i][2]);
            } else {
                write.append(sparseArr[i][0] + "," + sparseArr[i][1] + "," + sparseArr[i][2] + ",");
            }
        }

        System.out.println("д���ļ���...");
        write.close();
        fos.close();


        System.out.println("���ļ���...");
        Desktop.getDesktop().open(file);

        System.out.println("-------��ȡmap.data");
        // ���� FileReader ����
        FileInputStream fis = new FileInputStream(file);

        InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());// ת��char�ӵ�StringBuffer������
        }

        System.out.println(sb.toString());
        reader.close();// �رն�ȡ��
        fis.close();// �ر�������,�ͷ�ϵͳ��Դ

        //�����µ�ϡ������
        String[] str = sb.toString().split(",");
        int chessArr2[][]= new int[str.length / 3][3];

        // ��ϡ�����鸳ֵ
        int i = 0;
        for (String s : str) {
            chessArr2[i/3][i % 3]=Integer.parseInt(s);
            i++;
        }

        // 1. ��ȡϡ������ĵ�һ��,���ݵ�һ�е�����,����ԭʼ�Ķ�ά����
        int chessArr22[][] = new int[chessArr2[0][0]][chessArr2[0][1]];

        // 2. �ڶ�ȡϡ��������е�����,������ ԭʼ�Ķ�ά���� ����.
        for (int i3 = 1; i3 < chessArr2.length; i3++) {
            chessArr22[chessArr2[i3][0]][chessArr2[i3][1]] = chessArr2[i3][2];
        }

        //����ָ���Ķ�ά����
        System.out.println("�ָ���Ķ�ά����-----");
        for (int[] row:chessArr2 ) {
            for (int data:row ) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}


package com.qiyi.datastructure.sparsearray;
import java.io.*;

public class StoreData {
    public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    //����ԭʼ�Ķ�ά���� 11*11
    //0��ʾû�����ӣ�1��ʾ���ӣ�2��ʾ����
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[6][1] = 1;
        chessArr1[7][9] = 2;
        chessArr1[2][8] = 2;
    //���ԭʼ�Ķ�ά����
        System.out.println("ԭʼ�Ķ�ά���飺");
        for(int[] row : chessArr1) {
            for(int data : row)
                System.out.printf("%d\t",data);
                System.out.println();
        }
        //����ά����תϡ�������˼��
        //1.�ȱ�����ά���飬�õ���0���ݵĸ���
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for(int j = 0; j < 11; j++) {
                if(chessArr1[i][j]!=0) {
                    sum++;
                }
                }
        }
        //2.������Ӧ��ϡ������
        int sparseArr[][] = new int[sum+1][3];
        //��ϡ�����鸳ֵ
        sparseArr[0][0] = 11;//��¼����
        sparseArr[0][1] = 11;//��¼����
        sparseArr[0][2] = sum;//��¼����Ԫ�صĸ���
        //������ά���飬����0�ַ���ֵ��ŵ�ϡ��������
        int count = 0;//���ڼ�¼�ǵڼ�����0����
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
        //���ϡ���������ʽ
        System.out.println();
        File file = new File("./map.data");//���·����һ��
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));//�ַ���
        FileOutputStream fos = new FileOutputStream(file);//�ֽ���
        System.out.println("�õ���ϡ������Ϊ~");
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
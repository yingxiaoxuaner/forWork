package com.qiyi.offer.q1;
/**
 *��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳����������*��һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 *[
 *  [1,2,8,9],
 *  [2,4,9,12],
 *  [4,7,10,13],
 *  [6,8,11,15]
 *]
 *���� target = 7������ true��
 *
 *���� target = 3������ false��
 *�������
 */
public class S1 {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0)
            return false;
        for(int i = 0; i < array.length;i++)
            for(int j = 0; j < array[0].length;j++)
                if(array[i][j] == target)
                    return true;
        return false;
    }
}
//ʱ�临�Ӷ�O(n2)
//�ռ临�Ӷ�O(1)
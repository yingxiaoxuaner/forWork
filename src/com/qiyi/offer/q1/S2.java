package com.qiyi.offer.q1;

/**
 * �����¿�ʼ��
 */
public class S2 {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || array[0].length == 0)
            return false;

        int i = array.length - 1;
        int j = 0;
        while(i >= 0 && j < array[0].length) {
            if(array[i][j] == target)
                return true;
            else if(array[i][j] > target)
                i--;
            else
                j++;
        }
        return false;
    }
}
//ʱ�临�Ӷ�O(�и߼��п�)
//�ռ临�Ӷ�O(1)
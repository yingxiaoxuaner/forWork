package qiyi.offer.q1;
/**
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完*成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *[
 *  [1,2,8,9],
 *  [2,4,9,12],
 *  [4,7,10,13],
 *  [6,8,11,15]
 *]
 *给定 target = 7，返回 true。
 *
 *给定 target = 3，返回 false。
 *暴力求解
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
//时间复杂度O(n2)
//空间复杂度O(1)
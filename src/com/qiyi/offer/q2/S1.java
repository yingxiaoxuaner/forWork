package com.qiyi.offer.q2;
/**
 *
 *����
 *��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���Ϊ*We%20Are%20Happy��
 *ʾ��1
 *���룺
 *"We Are Happy"
 *����
 *����ֵ��
 *"We%20Are%20Happy"
 * ����replaceAll����
 */



public class S1 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param s string�ַ���
     * @return string�ַ���
     */
    public String replaceSpace(String s) {
        if (s == null || "".equals(s))
            return s;
        return s.replaceAll(" ", "%20");
    }
}

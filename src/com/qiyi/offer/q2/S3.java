package com.qiyi.offer.q2;

/**
 *����split����
 */
public class S3 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     *
     * @param s string�ַ���
     * @return string�ַ���
     */
    public String replaceSpace (String s) {
        StringBuilder sb = new StringBuilder();
        if(s == null || "".equals(s))
            return s;
        String[] strs = s.split("");
        for(String str : strs)
        {
            //if(str == " ")
            if(" ".equals(str))
                sb.append("%20");
            else
                sb.append(str);
        }
        return sb.toString();
    }
}
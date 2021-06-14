package qiyi.offer.q2;
/**
 *
 *描述
 *请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为*We%20Are%20Happy。
 *示例1
 *输入：
 *"We Are Happy"
 *复制
 *返回值：
 *"We%20Are%20Happy"
 * 调用replaceAll方法
 */



public class S1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace(String s) {
        if (s == null || "".equals(s))
            return s;
        return s.replaceAll(" ", "%20");
    }
}

package 剑指offer.Day3;
/*
*请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
*
* */
public class replaceWhitespace {
    public String replaceSpace(String s) {
        while (s.contains(" ")){
            s = s.replace(" ","%20");
        }
        return s;
    }
}

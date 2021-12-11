package com.example.nantest_2021_10_21.util;

import java.util.Date;

public class TestFormat {
    public static void main(String[] args) {
        System.out.printf("Hi,%s %n", "小超");
        System.out.printf("Hi,%s %s %s %n", "小超", "是个", "大帅哥");
        System.out.printf("字母c的大写是：%c %n", 'C');
        System.out.printf("布尔结果是：%b %n", "小超".equals("帅哥"));
        System.out.printf("100的一半是：%d %n", 100 / 2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50 * 0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50 * 0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50 * 0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50 * 0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');
        System.out.printf("3.141592453保留2位小数是%.2f %n", 3.141592453);
        Date date = new Date();
        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n", date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n", date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR%n", date);

        //+号的用法
        String str;
        str = String.format("数字的正负表示：%+d %d %+d %d", 8, 8, -8, -8);
        System.out.println(str);
        //-的用法
        str = String.format("左对齐：%-6d", 8);
        System.out.println(str);
        //0的用法
        str = String.format("缺位补零：%06d", 8);
        System.out.println(str);
        //' '空格的用法
        str = String.format("缺位补空格：% 6d", 8);
        System.out.println(str);
        str = String.format("缺位补空格：% 6d", -8);
        System.out.println(str);
        //,的用法
        str = String.format("数字分组：%,d", 123456789);
        System.out.println(str);
        //(的用法
        str = String.format("括号用法：%(d", -8888);
        System.out.println(str);
        str = String.format("括号用法：%(d", 8888);
        System.out.println(str);
        //#的用法
        str = String.format("#括号用法(十六进制)：%#x", 12);
        System.out.println(str);
        str = String.format("#括号用法(八进制)：%#o", 12);
        System.out.println(str);
        //<的用法
        str = String.format("<括号用法：%f %<3.1f", 3.14, 3.2);
        //"%<3.1f"作用的对象是前一个"%f"所作用的对象
        System.out.println(str);

    }
}

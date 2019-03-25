package org.spring.springboot.ArithJunitTest;

/**
 * Created with IntelliJ IDEA.
 * User: Rich  yaoyuntao
 * Date: 2019/3/25
 * Time: 14:55
 * Description: No Description
 */
public class Calculator {
    public int add(int x, int y) { //加法
        return x + y;
    }

    public int sub(int x, int y) { //减法
        return x - y;
    }

    public int mul(int x, int y) { //乘法
        return x * y;
    }

    public int div(int x, int y) { //除法
        return x / y;
    }

    public String div2(int x, int y) { //除法  做了异常判断
        String str = null;
        try {
            if(y==0){
                str="除数不能为0";
            }else {
                int z = x / y;
                str = Integer.toString(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public void loop(int x, int y) { //死循环
        for (; ; )
            x = y;
    }

    public void unCompleted(int x, int y) { //未完成的模块:例如平方、开方等等
        //还在开发中
    }


//    public static void main(String[] args) { // 传统代码测试
//        int a = 8;
//        int b = 2;
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(a, b));
//        System.out.println(calculator.sub(a, b));
//        System.out.println(calculator.mul(a, b));
//        System.out.println(calculator.div(a, b));
//        System.out.println(calculator.div2(a,0));
//    }
}
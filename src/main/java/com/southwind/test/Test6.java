package com.southwind.test;

/**
 * 1.（1）区别&和&&的区别，输出输出异常信息为null，则 if的条件 null != str  &  str.equals("") & 两边的都会执行；判断正常，没有执行 str.equals("")，即&&具有短路功能。
 * （2）&和&&都是逻辑运算符，都是判断两边同时真则为真，否则为假；但是&&当第一个条件不成之后，后面的条件都不执行了，而&则还是继续执行，直到整个条件语句执行完为止
 */
public class Test6 {
    public static void main(String[] args) {

        try {
            String str = null;
            if(  null != str  &  str.equals("")){

            }
        } catch (Exception e) {
            System.out.println("输出异常信息为"+e.getMessage()+"，则 if的条件 null != str  &  str.equals(\"\") & 两边的都会执行");
        }
        try {
            String str = null;
            if(  null != str  &&  str.equals("")  ){//会输出异常信息，即表明后面的str.equals("")也执行了
            }else{
                System.out.println("判断正常，没有执行 str.equals(\"\")，即&&具有短路功能");
            }
        } catch (Exception e) {
            System.out.println("输出异常信息"+e.getMessage());
        }
    }
}

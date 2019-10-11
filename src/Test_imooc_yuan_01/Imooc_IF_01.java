package Test_imooc_yuan_01;

import java.util.Scanner;

public class Imooc_IF_01 {
    public static void main(String[] args){
      //int n=10;
        //从键盘接收数据
        System.out.println("请输入一个整数：");
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
      if(n%2==0){
          System.out.println(n+"是偶数");
      }else {
          System.out.println(n+"是奇数");
      }
    }
}

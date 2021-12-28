package cal;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

            Calcu2 cc=new Calcu2();

        System.out.println("숫자를 입력하세요.");
        while(true) {
            Scanner qq = new Scanner(System.in);
            try {
                cc.setQ(Integer.parseInt(qq.nextLine()));
            }catch(Exception e1){
                System.out.println("숫자만 정확하게 입력!!");
                continue;
            }break;
        }

        while(true) {
            System.out.println("연산자(+,-,*,/,%)를 입력하세요.");

            Scanner ww = new Scanner(System.in);
            try {
                cc.setW(String.valueOf(ww.nextLine()));
                if(!cc.getW().equals("+")&&!cc.getW().equals("-")&&!cc.getW().equals("*")&&!cc.getW().equals("/")&&!cc.getW().equals("%")){
                    System.out.println("정확한 연산자를 입력!");
                    continue;
                }

            }catch(Exception e2){
                System.out.println("연산자 확인!");
                continue ;
            }break;


        }

        while(true) {
            System.out.println("여기도 숫자를 입력하세요.");
            Scanner rr = new Scanner(System.in);
            try {
                cc.setR(Integer.parseInt(rr.nextLine()));
            }catch(Exception e3){
                System.out.println("숫자를 정확하게 입력!!");
               continue;
            }break;

        }





























    }




























}

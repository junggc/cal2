package cal;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Calcu cal = new Calcu();


        System.out.println("숫자를 입력하세요.");
        while(true) {
            Scanner num_1 = new Scanner(System.in);
            try {
                cal.setA(Integer.parseInt(num_1.nextLine()));
            } catch (Exception e) {
                System.out.println("숫자를 정확하게 입력하세요.");
                continue;
            }break;
        }

        System.out.println("연산자를 입력하세요.");
        while(true) {
            Scanner yonsan = new Scanner(System.in);
            try {
                cal.setB(String.valueOf(yonsan.nextLine()));

                if(!cal.getB().equals("+")&&!cal.getB().equals("-")&&!cal.getB().equals("*")&&!cal.getB().equals("/")&&!cal.getB().equals("%")){


                }

            } catch (Exception e2) {
                System.out.println("+,-,*,/.% 연산자를 입력하세요.");
                continue;
            }break;
        }
        System.out.println("여기도 숫자만 입력하세요");
        while(true) {
            Scanner num_2 = new Scanner(System.in);
            try {
                cal.setC(Integer.parseInt(num_2.nextLine()));

            } catch (Exception e4) {
                System.out.println("정확하게 숫자만 입력 하세요.");
                continue;
            }
            break;
        }

        if(cal.getB().equals("+")){
            System.out.println("계산결과는 " + (cal.getA() + cal.getC()) +" 입니다.");
        }else if(cal.getB().equals("-")){
            System.out.println("계산결과는 " + (cal.getA() - cal.getC()) + " 입니다.");
        }else if(cal.getB().equals("*")){
            System.out.println("계산결과는 " + (cal.getA() * cal.getC()) + " 입니다.");
        }else if(cal.getB().equals("/")){
            System.out.println("계산결과는 " + (cal.getA() / cal.getC()) + " 입니다.");
        }else if(cal.getB().equals("%")){
            System.out.println("계산결과는 " + (cal.getA() % cal.getC()) + " 입니다.");
        }












    }
}

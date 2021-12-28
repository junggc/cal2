package cal;

import java.util.Scanner;

public class Calculator5 {
    public static void main(String[]args) {

        Calcu5 calcu5 = new Calcu5();

        System.out.println("첫번째 숫자를 입력하세요.");
        while (true) {
            Scanner scan = new Scanner(System.in);
            try {
                calcu5.setFirst_num(Integer.parseInt(scan.nextLine()));
            } catch (Exception e) {
                System.out.println("숫자만 정확히 입력하세요.");
                continue;
            }break;
        }


        System.out.println("사용할 연산자(+,-,*,/,%)중 하나를 입력하세요.");
           while(true) {
               Scanner scan1 = new Scanner(System.in);

               calcu5.setOperator(scan1.nextLine());

               if (!(calcu5.getOperator().equals("+") || calcu5.getOperator().equals("-") || calcu5.getOperator().equals("*") || calcu5.getOperator().equals("/") || calcu5.getOperator().equals("%"))) {
                   System.out.println("연산자를 정확하게 입력하세요.");
                   continue;
               }break;
           }


        System.out.println("두번째 숫자를 입력하세요.");
        while(true) {
            Scanner scan2 = new Scanner(System.in);
            try {
                calcu5.setSecond_num(scan2.nextInt());
            } catch (Exception e5) {
                System.out.println("정확히 두번째 숫자를 입력하세요.");
                continue;
            }
            break;
        }

        switch(calcu5.getOperator()){
                case ("+"):
                    System.out.println("계산 결과 "+(calcu5.getFirst_num()+calcu5.getSecond_num()));
                   break;
                case ("-"):
                    System.out.println("계산 결과 "+(calcu5.getFirst_num()-calcu5.getSecond_num()));
                    break;
                case ("*"):
                    System.out.println("계산 결과 "+(calcu5.getFirst_num()*calcu5.getSecond_num()));
                    break;
                case ("/"):
                    System.out.println("계산 결과 "+(calcu5.getFirst_num()/calcu5.getSecond_num()));
                    break;
                case ("%"):
                    System.out.println("계산 결과 "+(calcu5.getFirst_num()%calcu5.getSecond_num()));
                    break;

        }

















    }




}

package cal;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[]args) {
        Calcu3 cl = new Calcu3();

        System.out.println("숫자를 입력하세요.");
        while (true) {
            Scanner f1 = new Scanner(System.in);
            try {
                cl.setS(Integer.parseInt(f1.nextLine()));
            } catch (Exception e) {
                System.out.println("숫자를 정확하게 입력하세요.");
                continue;
            }break;
        }
        System.out.println("연산자(+.-.*./.%)를 입력하세요");
        while(true) {
            Scanner f2 = new Scanner(System.in);
            try {
                cl.setT(String.valueOf(f2.nextLine()));
                if(!(cl.getT().equals("+") || cl.getT().equals("-") || cl.getT().equals("*") || cl.getT().equals("/") || cl.getT().equals("%"))){
                    System.out.println("");
                    continue;
                }

            } catch (Exception e2) {
                System.out.println("정확한 연산자를 입력 하세요.");
                continue;
            }break;
        }

        System.out.println("다음 숫자를 입력 하세요.");
        while(true) {
            Scanner f3 = new Scanner(System.in);
            try {
                cl.setU(Integer.parseInt(f3.nextLine()));
            } catch (Exception e3) {
                System.out.println("다음숫자를 정확히 입력하세요.");
                continue;
            }break;
        }
        if(cl.getT().equals("+")){
            System.out.println("계산 결과는 "+ (cl.getS() + cl.getU()) + " 입니다.");
        }else if(cl.getT().equals("-")){
            System.out.println("계산 결과는 "+ (cl.getS() - cl.getU()) + " 입니다.");
        }else if(cl.getT().equals("*")){
            System.out.println("계산 결과는 "+ (cl.getS() * cl.getU()) + " 입니다.");
        }else if(cl.getT().equals("/")){
            System.out.println("계산 결과는 "+ (cl.getS() / cl.getU()) + " 입니다.");
        }else if(cl.getT().equals("%")){
            System.out.println("계산 결과는 "+ (cl.getS() % cl.getU()) + " 입니다.");
        }


































    }


}

import java.util.Scanner;

/**
 * @(non-javadoc)
 * 
 * @author zeonghun
 * @since 230313
 */
public class Main {
    public static void main(String[] args) {
        IsPrime prime = new IsPrime();
        Scanner sc = new Scanner(System.in);
        try { // 예외 발생시 catch 블록 실행
            System.out.print("숫자를 입력하세요: ");
            int num = sc.nextInt(); // // 키보드로 입력한 문자를 받아옴
            prime.prime(num); // prime 메소드로 num1 전달
        } catch (Exception e) {
            System.out.println("숫자만 입력하세요.");
        } finally {
            sc.close();
        }
    }
}
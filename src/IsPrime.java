/**
 * @brief 소수의 개수를 구하는 메소드
 * 
 * @param n 소수의 개수를 찾을 숫자
 * 
 * @author zeonghun
 * @since 230313
 */
public class IsPrime {
    public void prime(int n) {
        int answer = 0; // 소수 개수
        for (int i = 2; i <= n; i++) {
            int cnt = 0; // 나누어지는 수의 개수를 카운트
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                answer++;
            }
        }
        System.out.println(n+"의 소수의 개수는 "+answer+"개 입니다.");
    }
}
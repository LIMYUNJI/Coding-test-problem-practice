/*(주어진 문자열에서 특정 "폭발 문자열(bomb)"이 나오면 그 부분을 지우고, 없을 때까지 반복하는 문제*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] origin = br.readLine().toCharArray();
        char[] bomb = br.readLine().toCharArray();
        int bombLen = bomb.length;

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : origin) {
            stack.addLast(c); // 스택에 문자 추가

            // 폭발 문자열 길이만큼 스택의 끝을 확인
            if (stack.size() >= bombLen) {
                boolean isBomb = true;
                int idx = bombLen - 1;

                for (Character ch : new ArrayDeque<>(stack).descendingIterator()) {
                    if (bomb[idx] != ch) {
                        isBomb = false;
                        break;
                    }
                    idx--;
                    if (idx < 0) break;
                }

                // 폭발 문자열과 같다면 제거
                if (isBomb) {
                    for (int i = 0; i < bombLen; i++) {
                        stack.removeLast();
                    }
                }
            }
        }

        // 남은 문자들을 출력
        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}

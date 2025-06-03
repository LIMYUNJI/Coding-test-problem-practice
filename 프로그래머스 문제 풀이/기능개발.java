/*
각 기능은 먼저 완성되어야 그 다음 기능이 배포될 수 있다.
progresses[i]는 i번째 기능의 진도 (%), speeds[i]는 하루에 작업 가능한 양이다.
각 기능은 100%가 되어야 배포 가능하다.
하루 단위로 계산하고, 한 번에 여러 기능을 배포할 수 있다.
배포마다 몇 개의 기능이 배포되는지를 배열로 반환한다.
*/


import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        
        // 각 기능이 완료되기까지 걸리는 일 수 계산
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            days[i] = (int) Math.ceil((double) remain / speeds[i]);
        }

        // 배포 로직
        int current = days[0];
        int count = 1;
        
        for (int i = 1; i < days.length; i++) {
            if (days[i] <= current) {
                count++;  // 같이 배포 가능
            } else {
                result.add(count);
                current = days[i];  // 기준 갱신
                count = 1;
            }
        }
        
        result.add(count);  // 마지막 배포
        
        // 리스트를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}

import java.util.Stack;

public class DeliveryBoxProblem {

    /**
     * 메인 컨베이어 벨트와 보조 컨베이어 벨트(스택)를 사용하여
     * 주어진 순서(order)대로 트럭에 실을 수 있는 최대 상자 개수를 계산합니다.
     *
     * @param order 트럭에 실어야 하는 상자의 원하는 순서를 담은 배열. (1부터 시작하는 상자 번호)
     * @return 트럭에 실을 수 있는 최대 상자 개수.
     */
    public int solution(int[] order) {
        int n = order.length;
        Stack<Integer> auxiliaryBelt = new Stack<>(); 
        int currentBoxOnMainBelt = 1; 
        int orderIndex = 0; 
        int loadedBoxesCount = 0; 

        while (orderIndex < n) {
            int desiredBox = order[orderIndex];
            if (currentBoxOnMainBelt == desiredBox) {
                loadedBoxesCount++;
                currentBoxOnMainBelt++;
                orderIndex++;
            }
            else if (!auxiliaryBelt.isEmpty() && auxiliaryBelt.peek() == desiredBox) {
                loadedBoxesCount++; 
                auxiliaryBelt.pop();
                orderIndex++; 
            }
            else if (currentBoxOnMainBelt < desiredBox) {.
                while (currentBoxOnMainBelt < desiredBox) {
                    auxiliaryBelt.push(currentBoxOnMainBelt);
                    currentBoxOnMainBelt++;
                }
                if (currentBoxOnMainBelt == desiredBox) {
                    loadedBoxesCount++;
                    currentBoxOnMainBelt++;
                    orderIndex++;
                } else {
                    break;
                }
            }
   
            else {
                break;
            }
        }
        return loadedBoxesCount;
    }

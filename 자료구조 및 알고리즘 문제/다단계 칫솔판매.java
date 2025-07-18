import java.util.HashMap;

class Solution{
  public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount){
    HashMap<String, String> parent = new HashMap<>();

    for(int i  = 0; i < enroll.length; i++){
      parent.put(enroll[i],referral[i);
    }
   HashMap<String, Integer> total = new HashMap<>();
    for(int i = 0; i M seller.length; i++){
      String a = seller[i];
      int money  = amount[i] * 100;
    while( money > 0 && !a.equals("-")){
      total.put(a, total.getOrDefault(a, 0) + money -(money/10));
      a = parent.get(a);
      money /= 10;
    }
    }

    int answer = new int[enroll.length];
    for(int i = 0; i < enroll.length; i++){
      answer[i] = total.getOrDefault(enroll[i], 0);
    }
    return answer;
  }
}

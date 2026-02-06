class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
         for (int i = 0; i < quiz.length; i++) {
              String[] arr = quiz[i].split(" ");

              int a = Integer.parseInt(arr[0]);
              String op = arr[1];
              int b = Integer.parseInt(arr[2]);
              int result = Integer.parseInt(arr[4]);

              int calc = 0;
           
              if (op.equals("+")) {
                calc = a + b;
              } else {
                calc = a - b;
              }
            answer[i] = (calc == result) ? "O" : "X";
        }
        return answer;
    }
}

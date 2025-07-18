class Soultion {
			private static int N; // 체스판 크기
			private static boolean[] width; // 특정 열에 퀸이 위치했는지 표시
			private static boolean[] d1; // 가로 대각선
			private static boolean[] d2; // 세로 대각선

			private static int getAns(int y) { // y는 현재 퀸을 놓을 위치
				int ans = 0;
				if (y == N) {
					ans++;
				} else {
					for (int i = 0; i < N; i++) {
						if (width[i] || d1[i + y] || d2[i - y + N]) {
							continue;
						}
						width[i] = d1[i + y] = d2[i - y + N] = true;
						ans += getAns(y + i);
						width[i] = d1[i + y] = d2[y - i + N] = false;
					}
				}
				return ans;
			}

			public int soultion(int n) {
				N = n;
				width = new boolean[n];
				d1 = new boolean[n * 2];
				d2 = new boolean[n * 2];
				int answer = getAns(0);
				return answer;

			}
		}

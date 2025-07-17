// 유니온 파인드 알고리즘은 다음과 같은 일을 할 수 있다.
1. 두 부분 집합을 하나의 부분 집합으로 병합
2. 주어진 원소가 속한 부분 집합을 반환
	{같은 부분 집합에 속한 데이터 찾기}

public FindUnion(int n){
	this.n = n;
	rank = new int[n];
	parent = new int[n];

	initFindUnion(); // 초기화

}

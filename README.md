해시 테이블이란?<BR>
특정 입력 값을 해시 함수에 입력해 나온 결과값을 index로 데이터를 저장하는 자료구조이다.<BR>
일반적으로 search, insert, delete 시간 복잡도가 O(1)이다.<BR>
단점은 주소가 불규칙해 메모리 효율성이 낮다는 것이다.<BR>
해시 충돌이 작은 해시함수를 사용할수록 연산 비용이 증가한다.<BR>


결정 사항<BR>
1. 어떤 해시 함수를 사용할 것인가?<BR>
    division method<BR>
    digit folding<BR>
    multiplication method<BR>
    univeral hashing<BR>

2. 해시 충돌 발생 시 처리 방법<BR>
    opan address<BR>
    seperate chaining<BR>

test case<BR>
1. 해당 주소를 다른 프로세스가 사용하고 있다면?<BR>
2. 다른 입력에 대해 같은 해시 값이 나온다면?<BR>
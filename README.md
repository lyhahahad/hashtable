해시 테이블이란?<BR>
목적 : 검색 속도를 높여라<br>
방법 : <br>
특정 입력 값을 해시 함수에 입력해 나온 결과값을 index로 데이터를 저장하는 자료구조이다.<BR>
일반적으로 search, insert, delete 시간 복잡도가 O(1)이다.<BR>
단점은 주소가 불규칙해 메모리 효율성이 낮다는 것이다.<BR>
해시 충돌이 작은 해시함수를 사용할수록 연산 비용이 증가한다.<BR>


결정 사항<BR>
1. 어떤 해시 함수를 사용할 것인가?<BR>
    division method : 주소 = 입력값%테이블의 크기<BR> 
    digit folding : 키의 문자열을 ascii코드로 바꾸고 값을 함한 데이터를 주소로 사용<BR>
    multiplication method : 숫자로 된 key<BR>
    univeral hashing<BR>

2. 해시 충돌 발생 시 처리 방법<BR>
    opan address : 비어 있는 버킷에 데이터를 저장<BR>
    seperate chaining : 동일한 버킷에서 추가 메모리 사용<BR>

3. 이미 존재하는 key값이 들어온다면?<br>
    key는 중복이 안된다.

구현 방식<BR>
1. division method + open address or seperate chaining
2. digit folding + open address or seperate chaining
3. multiplication method + open address or seperate chaining
4. univeral hashing + open address or seperate 

test case<BR>
1. 해시 충돌이 0%인 경우 시간 복잡도 비교
2. 해시 충돌이 50%인 경우 시간 복잡도 비교
3. 해시 충돌이 100%인 경우 시간 복잡도 비교
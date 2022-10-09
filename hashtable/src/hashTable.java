public class hashTable {
    int capacity;
    String[] table;
    //hashtable 생성 시 capacity를 입력으로 받아 배열을 생성한다.
    hashTable(int c){
        capacity = c;
        String[] table = new String[c];
    }

//hash function : key 값을 입력으로 받아 주소 정하기.
    public int division(String key){
        int h = key.length()%getCapacity();
        //해당 위치에 table이 비어있다면?
        if (table[h] == null){
            return h;
        }
        //해당 위치에 이미 데이터가 있다면?->open address vs seperate chaining
        else{
            open_address(h);

        }

    }

    public void digit_folding(){

    }

    public void multipleication(){

    }

    public void univeral(){

    }

//hash collusion : 같은 주소가 나왔을 때 처리 방법.
    public int open_address(int h){
        //h에 +1하는 방식으로 진행할 경우, h가 테이블의 끝이고 이미 값이 있을 경우 앞부분 index가 비어있어도 메모리 할당이 불가능해진다.
        for(int i=1; i<getCapacity();i++){
            if (table[h+i]!=null){
                return (h+i);
            }
        }
        return 0;
    }

    public void seperate_chaining(){
        //각 요소의 값을 node로 만들고 해당 위치의 노드 뒤에 붙이기.(singlylinkedlist로 구현하기.)
    }
//hashtable main functions
    public void search(String key){
        //위치 구하기.
    }

    public void insert(String key, String value){
        //key 중복 검사->위치 구하기.

    }

    public void delete(String key){

    }
//hashtable functions
    public int getCapacity(){
        return capacity;
    }
}

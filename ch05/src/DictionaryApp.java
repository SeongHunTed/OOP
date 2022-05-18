abstract class PairMap{
    protected String keyArray []; // key값 저장
    protected String valueArray []; // value값 저장
    abstract String get(String key); // key -> value return
    abstract void put(String key, String value); // key - value 저장 // key값 존재하면 value update
    abstract String delete(String key); // key 값 value값 삭제
    abstract int length(); // 현재 키의 개수
}

class Dictionary extends PairMap {
    private int table;
    public Dictionary(int num){
        keyArray = new String[num];
        valueArray = new String[num];
        this.table = 0;
    }

    public String get(String key){
        int i;
        for(i = 0; i < keyArray.length; i++){
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return null;
    }

    public void put(String key, String value){
        for(int i = 0; i < keyArray.length; i++){
            if(key.equals(keyArray[i])){
                valueArray[i] = value;
                return;
            }
        }
        keyArray[table] = key;
        valueArray[table] = value;
        table++;
    }

    public String delete(String key){
        for(int i = 0; i < keyArray.length; i++){
            if(key.equals(keyArray[i])){
                String temp = keyArray[i];
                keyArray[i] = null;
                valueArray[i] = null;
                table--;
                return temp;
            }
        }
        return null;
    }

    int length(){
        return table;
    }
}

class DictionaryApp{
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
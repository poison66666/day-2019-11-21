import java.util.Arrays;

public class MyString {
    private final char[] value;

    public MyString(char[] value){
       // this.value = value;
       // System.out.println(this.value);
        this.value = Arrays.copyOf(value,value.length);
    }

    public MyString(char[] value,int offset,int count){
        this.value = Arrays.copyOfRange(value,offset,offset+count);
    }

    public char charAt(int index){
        return value[index];
    }

    public char[] toCharArray() {
        return Arrays.copyOf(value, value.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyString)) return false;
        MyString myString = (MyString) o;
        return Arrays.equals(value, myString.value);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

    //小写转为大写
   public MyString toUpperCase(){
       char[] value = toCharArray();
       for(int i =0;i<value.length;i++){
           if(Character.isLowerCase(value[i])){
               value[i] = Character.toUpperCase(value[i]);
           }
       }
       return new MyString(value);
    }

    //无视大小写比较是否相等
    public boolean equalsIgnoreCase(MyString o){
        if(o == null){
            return false;
        }
        if(value.length != o.value.length){
            return false;
        }
        for(int i =0;i<value.length;i++){
            char c = Character.toUpperCase(value[i]);
            char d = Character.toUpperCase(o.value[i]);
            if(c != d){
                return false;
            }
        }
        return true;
    }

    //拼接
    public MyString concat(MyString o) {
        char[] v = new char[value.length + o.value.length];
        System.arraycopy(value,0,v,0,value.length);//从value数组中第0位开始复制到v第0位开始，value.length长度中去
        System.arraycopy(o.value,0,v,value.length,o.value.length);
        return new MyString(v);
    }

    public static void main(String[] args) {
        MyString m= new MyString(new char[]{'a','b','c'});
        m.toUpperCase();
        System.out.println("-------------");
        System.out.println(m.value);
    }
}

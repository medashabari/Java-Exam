public class Genric {
    public static void main(String[] args) {
        Gen<Number> obj = new Gen<>(10.0);
        System.out.println(obj.value.getClass().getName());
        System.out.println("value :" +obj.value);
        Gen<String> obj2 = new Gen<>("shabarish");
        System.out.println("Type value T :"+obj2.value.getClass().getName());
        System.out.println("value :"+ obj2.value);
        Gen<Character> obj3 = new Gen<>('c');
        System.out.println("Type value T :"+obj3.value.getClass().getName());
        System.out.println("value :"+ obj3.value);
    }
}

class Gen<T>{
    T value;
 Gen(T value){
     this.value=value;
 }
}


public class MoreClass {
    public static void main(String[] args) {
        Oject obj1 = new Object();
        System.out.println(obj1);
        Object obj2 = new Object(){
            public String toString() {
                return "this is obj2"
            }
        };
        System.out.println(obj2);
    }
}

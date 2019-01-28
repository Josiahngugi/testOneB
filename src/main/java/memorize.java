public class memorize {

//    memorize function
    public void memorize() {
        this.originalFunction();
    }
//    memorized function
    public void originalFunction() {
        System.out.println("original method");

    }

    public static void main(String[] args) {
        memorize t = new memorize();
        t.memorize();
    }
}

public class Overload {
    public void comer( ) {
        System.out.println("Animal que come de todo.");
    }
    static class Caballo extends Animal {
        public void comer(int a) {
            System.out.println("Animal que come de todo");
        }
        public void comer(int a, double b) {
            System.out.println("Animal que come de todo");
        }
        public void comer(int[] matriz) {
            System.out.println("Animal que come de todo");
        }
    }
}

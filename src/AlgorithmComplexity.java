public class AlgorithmComplexity {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] a = new int[5];
        readArrayValue(a);
    }

    public static void readArrayValue(int[] array) {
        for (int i : array) {
            System.out.println(i);
//        }
//        for (int i = 1000; i > 0; i/=2) {
//            System.out.println("i = " + i);
            for (int i1 = 0; i1 < 15; i1++) {
                for (int i2 = 0; i2 < 15; i2++) {
                    for (int i3 = 0; i3 < 15; i3++) {
                        System.out.println("i3 = " + i3);
                    }
                    
                }
                
            }
        }
    }
}

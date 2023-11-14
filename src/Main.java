public class Main {
    public static void main(String[] args){
        ThreeGen<Integer, String, Double> threeGenObj = new ThreeGen<Integer, String, Double>(77, "Обобщённый текст", 2.2);
        System.out.println(threeGenObj);
    }
}
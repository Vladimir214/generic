/*Создать обобщенный класс с тремя параметрами (T, V, K).
Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
Создать метод, выводящий на консоль имена классов для трех переменных класса.*/

        public class ThreeGen <T, V, K> {
            T ob1;
            V ob2;
            K ob3;

            ThreeGen(T o1, V o2, K o3) {
                ob1 = o1;
                ob2 = o2;
                ob3 = o3;
            }

            public T getOb1() {
                return ob1;
            }

            public void setOb1(T ob1) {
                this.ob1 = ob1;
            }

            public V getOb2() {
                return ob2;
            }

            public void setOb2(V ob2) {
                this.ob2 = ob2;
            }

            public K getOb3() {
                return ob3;
            }

            public void setOb3(K ob3) {
                this.ob3 = ob3;
            }

            void showTypes() {
                System.out.println("Тип T: " + ob1.getClass().getName());
                System.out.println("Тип V: " + ob2.getClass().getName());
            }

            @Override
            public String toString() {
                return "ThreeGen:\n" +
                        "\nЗначение T = " + ob1 +
                        "\nЗначение V = " + ob2 +
                        "\nЗначение K = " + ob3;
            }
        }


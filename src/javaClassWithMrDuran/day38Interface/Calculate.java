package javaClassWithMrDuran.day38Interface;

public class Calculate  {
        public int calculatePerimeter(int... edges){
                int sum = 0;
                for (int edge: edges) {
                        sum += edge;
                }
                return sum;
        }
}

public class Main {
    public static void main(String[] args) {
        short [] a = new short[20 - 5 + 1];
        for (short i = 5; i <= 20; ++i) {
            a[i - 5] = i;
        }

        float [] x = new float[19];

        for (int i = 0; i < 19; ++i) {
            x[i] = (float) (Math.random() * 23.0 - 15.0);
        }

        double [][] q = new double[16][19];

        for (int i = 0; i < q.length; ++i) {
            for (int j = 0; j < q[0].length; ++j) {
                float xj = x[j];
                switch (a[i]) {
                    case 20:
                        q[i][j] = Math.pow((Math.pow(Math.pow(xj, 2.0 * xj) * (3.0 / 4.0 - Math.pow(xj, 4.0 + xj)), 3.0) + 2.0) / Math.tan(Math.cos(xj)), 2.0);
                        break;
                    case 5, 6, 9, 10, 12, 15, 17, 19:
                        q[i][j] = Math.atan(1.0 / Math.exp(Math.abs(Math.tan(Math.tan(xj)))));
                        break;
                    default:
                        q[i][j] = Math.pow(Math.pow(Math.sin(xj), Math.PI * Math.pow(2.0 * xj, 3.0)) * (Math.sin(Math.asin(Math.pow((xj - 3.5) / 23.0, 2.0))) + 1.0), 2.0);
                        break;
                }
            }
        }

        for (double [] q_i : q) {
            for (double q_ij : q_i) {
                System.out.printf("%14.4f", q_ij);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

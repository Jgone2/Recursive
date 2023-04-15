public static StringBuilder sb = new StringBuilder();

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sb.append((int)Math.pow(2, n) - 1).append("\n");

        hanoi(n, 1, 2, 3);
        System.out.println(sb);
}

public static void hanoi(int n, int from, int by, int to) {
        if(n == 1) {
            System.out.println(from + " " + to);
        } else {
            hanoi(n-1, from, to, by); // N-1개를 A(from)번에서 B(by)번으로 옮기기
            System.out.println(from + " " + to); // 1개를 A번에서 C번으로 옮기기
            hanoi(n-1, by, from, to); // N-1개를 B(by)번에서 C(to)번으로 옮기기
        }
}
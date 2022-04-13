public class prac2_9_again {
    public static void main(String[] args) {
        short a = (short)0x55ff;
        short b = (short)0x00ff;

        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short)(a & b));
        System.out.printf("%04x\n", (short)(a | b)));
        System.out.printf("%04x\n", (short)(a ^ b));
        System.out.printf("%04x\n", (short)(~a));

        byte c = 20; // 0x14 // 0101 0000 = 64 + 16 = 80 // 0001 0100 = 20 // 0000 0101 = 5
        byte d = -8; // 0xf8 // 0000 1000 = 8 // 1111 1000 = -8 // 1111 1110 -> -1 -1 = -2

        System.out.println("[시프트 연산 결과]");
        System.out.println(c << 2); // c를 2비트 왼쪽 시프트
        System.out.println(c >> 2); // c를 2비트 오른쪽 시프트 0삽입
        System.out.println(d >> 2); // d를 2비트 오른쪽 시프트 1 삽입
        System.out.printf("%x\n", (d >>> 2)); // d를 2비트 오른쪽 시프트 0 삽입

    }
}

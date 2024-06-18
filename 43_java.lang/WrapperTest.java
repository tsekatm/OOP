public class WrapperTest {
    public static void main(String[] args) {
        // byte
        byte valueOfByte1 = Byte.valueOf((byte)6);
        System.out.println(valueOfByte1);
        // int
        int valueOfByte2 = Byte.valueOf("6").compareTo(Byte.valueOf("6"));
        System.out.println(valueOfByte2);
        // string
        Byte valueOfByte = Byte.valueOf("4");
        System.out.println(valueOfByte);

        // string
        Long valueOfLong = Long.valueOf("4");
        System.out.println(valueOfLong);
        // long
        Long valueOfLong1 = Long.valueOf(10);
        System.out.println(valueOfLong1);

        // String
        Long valueOfLong2 = Long.valueOf("10");
        System.out.println(valueOfLong2);


    }

}
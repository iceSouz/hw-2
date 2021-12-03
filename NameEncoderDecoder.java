public class NameEncoderDecoder {

    public static void main(String[] args) {
        System.out.println(encode("Crab"));
        System.out.println(decode("NOTFORYOUCr5bYESNOTFORYOU"));
    }

    public static String encode(String name) {
        String result = "NOTFORYOU" + name.replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5")
                + "YESNOTFORYOU";
        return result;
    }

    public static String decode(String name) {
        String realName = name.substring(9, name.length() - 12);
        String result = realName.replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
        return result;
    }
}

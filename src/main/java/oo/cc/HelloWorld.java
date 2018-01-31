package oo.cc;

import java.util.*;

/**
 * Created by laiis on 2017/4/6.
 */
public class HelloWorld {

    public static String TEST = "ABCDE";

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        String temp = "Hello World!";
//
//        System.out.println(temp);
//        byte[] tempBytes = fixedBockSize(32, temp);
//        System.out.println(new String(tempBytes));
//
//        for (int i = 0; i < temp.getBytes().length; i++) {
//            System.out.print(temp.getBytes()[i] + " ");
//        }
//        System.out.println();
//
//        String target = new String(tempBytes);
//        for (int i = 0; i < target.trim().getBytes().length; i++) {
//            System.out.print(target.trim().getBytes()[i] + " ");
//        }
//        System.out.println();

        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
        map.put("TEST", TEST);

        System.out.println("TEST: " + map.get("TEST") + " : " + TEST);

        TEST = "CDEFG";
        System.out.println("TEST: " + map.get("TEST") + " : " + TEST);

        map.remove(null);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("");
        list.add(" ");
        list.add("E");

        System.out.println(list.size() + " " + list);

        String temp = "test.api.aldisfj/";
        String subtemp = temp.substring(0, temp.length() - 1);
        System.out.println(temp + " : " + subtemp);

    }


    private static byte[] fixedBockSize(int blockSize, String str) {

        byte[] dataBytes = str.getBytes();
        int plaintextLength = dataBytes.length;
        if (plaintextLength % blockSize != 0) {
            plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
        }

        byte[] plaintext = new byte[plaintextLength];
        System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

        return plaintext;
    }
}

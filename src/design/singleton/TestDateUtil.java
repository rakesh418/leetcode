package design.singleton;

import java.io.*;

public class TestDateUtil {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil util1 = DateUtil.getTest();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/home/lex418/Desktop/tmp-l/oos")));
        oos.writeObject(util1);

        DateUtil util2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/home/lex418/Desktop/tmp-l/oos")));
        util2 = (DateUtil) ois.readObject();
        oos.close();
        ois.close();
        System.out.println(util1==util2);


    }
}

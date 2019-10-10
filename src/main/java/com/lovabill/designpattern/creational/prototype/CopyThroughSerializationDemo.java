package com.lovabill.designpattern.creational.prototype;

import java.io.*;

class Foo implements Serializable {
    public int stuff;
    public String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    public Foo deepClone() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (Foo) ois.readObject();
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public String toString() {
        return "Foo{" +
                "stuff=" + stuff +
                ", whatever='" + whatever + '\'' +
                '}';
    }
}

/**
 * Serialize and deserialize an object to perform deep cloning.
 * Code is small, object must implement Serializable.
 */
class CopyThroughSerializationDemo {
    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");

        // use apache commons!
        Foo foo2 = foo.deepClone();
        foo2.whatever = "xyz";

        System.out.println(foo);
        System.out.println(foo2);
    }
}

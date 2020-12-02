package org.fenixsoft.clazz.chapter07;


import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {

    private static class MyClassLoader extends ClassLoader {
        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            try {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                InputStream is = getClass().getResourceAsStream(fileName);
                if (is == null)
                    return super.loadClass(name);
                byte[] b = new byte[is.available()];
                is.read(b);
                return defineClass(name, b, 0, b.length);
            } catch (IOException e) {
                throw new ClassNotFoundException(name);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader();

        Object obj2 = myClassLoader.loadClass("org.fenixsoft.clazz.chapter07.ClassLoaderTest").newInstance();
        Object obj1 = new ClassLoaderTest();

        System.out.println(obj2.getClass());
        System.out.println(obj1.getClass());

        System.out.println(obj1 instanceof org.fenixsoft.clazz.chapter07.ClassLoaderTest);
        System.out.println(obj2 instanceof org.fenixsoft.clazz.chapter07.ClassLoaderTest);
    }
}

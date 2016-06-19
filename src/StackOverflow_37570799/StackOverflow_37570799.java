package StackOverflow_37570799;

import java.lang.reflect.Constructor;

/**
 * This is the answer for StackOverflow post 37570799
 */
public class StackOverflow_37570799 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        String type = "java.lang.String";
        Class g = GenericClass.class;
        Constructor c = g.getConstructor(Class.class);
        GenericClass<?> genericClass = (GenericClass<?>) c.newInstance(Class.forName(type));
    }

}

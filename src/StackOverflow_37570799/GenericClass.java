package StackOverflow_37570799;

/**
 * This is a class mentioned in an answer for StackOverflow post 37570799
 *
 * @param <T> Some type
 */
public class GenericClass<T> {

    public GenericClass(Class<T> param) {
        System.out.println(param.getName());
    }

}

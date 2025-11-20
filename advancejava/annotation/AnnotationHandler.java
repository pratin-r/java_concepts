/*

this file is created to inspect and process the annotations at runtime

Reflection in Java is a powerful feature that allows you to inspect and manipulate classes, methods, fields, and other elements of the program at runtime, even if they are not known at compile time.

---   IMPORTANT   ---

.class in CustomAnnotation.class is like accessing our compiled class file. This can be used to access class informations like class name, super class name, package, variables, methods, constructors, implemented interface, annotations etc,. ITS LIKE ACCESSING ALL THESE DURING RUNTIME.

 */
package advancejava.annotation;

import java.lang.reflect.Method;

// use try catch blocks when working on Reflection. Caused exception when not using it
public class AnnotationHandler {
    public static void main(String[] args) {
        try {
            // Always SHOULD USE fully qualified class name when using forName() method
            Class<?> clazz = Class.forName("advancejava.annotation.Annotations");
            Method method = clazz.getMethod("brandName");
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation annotate = method.getAnnotation(CustomAnnotation.class);
                System.out.println(annotate.name());
            }
            // Invoke the method dynamically
            method.invoke(clazz.getDeclaredConstructor().newInstance());

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InstantiationException | java.lang.reflect.InvocationTargetException e) {

            e.printStackTrace();
        }
    }
}

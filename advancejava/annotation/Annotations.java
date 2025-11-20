/*
 * 1) Annotations are a powerful feature introduced in Java 5 that allows you to
 * add metadata to your code. Annotations provide additional information about
 * the code to the compiler or runtime environment without affecting the actual
 * execution of the code itself.
 * 
 * 2) Annotations are widely used in Java for a variety of purposes, such as
 * code documentation, compiler instructions, configuration, and more. They're
 * typically used by tools, frameworks, or libraries that process the
 * annotations at compile-time, class-loading time, or runtime.
 */

/* -- Key Concepts of Java Annotations

* Metadata: Annotations provide metadata about classes, methods, fields, parameters, etc. This metadata can be processed at compile-time or runtime.

* Annotation Types: Annotations are themselves defined using @interface.

* Retention Policies: Retention refers to how long an annotation should be retained and available for use. It specifies the lifetime of an annotation.  The retention policy defines how long the annotation is available for use and how long it can be accessed. It determines the lifetime of the annotation in the code, meaning whether it can be accessed at compile-time, class-load time, or runtime. Default retention policy is RetentionPolicy.CLASS


* It has three possible retention policies:

    SOURCE: The annotation is discarded by the compiler and not included in the .class files.

    CLASS: The annotation is retained in the .class files but not available at runtime (Default).

    RUNTIME: The annotation is retained at runtime and can be accessed using reflection (Most commonly used policy in frameworks like Spring, Hibernate).
    
* Target: An annotation can specify where it can be applied, such as methods, fields, classes, parameters, etc.

* Processing Annotations: Annotations can be processed at compile-time (using tools like apt or annotation processors), or at runtime (using reflection).

* Some of the annotations are:
    i) @Override
    ii) @Deprecated
    iii) @SuppressWarnings
    iv) @FunctionalInterface
*/
package advancejava.annotation;

// user defined annotation

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // allows us till where the annotation can be p
@Target(ElementType.METHOD) // allows us to decide where the custom annotation can be applied
@interface CustomAnnotation {
    String name() default "default name";
}

public class Annotations {
    @CustomAnnotation(name = "Brand")
    public void brandName() {
        System.out.println("OnePlus 13R");
    }
}

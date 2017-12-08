package other;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by ZSH
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();

    int val();
}

class Meta {
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String args[]) {
        myMeth("test", 10);
    }
}

/*
==================================================
 */
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("All annotations for Meta2:");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All annotations for myMeth");
            for (Annotation a : annos)
                System.out.println(a);

        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}


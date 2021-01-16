package senior.day11;

/**
 * Create by koala on 2021-01-02
 *
 * jdk8 之前的重复注解的写法：
 *
 */
public class AnnotationTest04 {

    @MyAnnotations04({@MyAnnotation04(value="hi"),@MyAnnotation04(value="hi")})
    class Person{
        private String name;
        private int age;

        public Person() {
        }

        @MyAnnotation04
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @MyAnnotation04
        public void walk(){
            System.out.println("人走路");
        }
    }

}

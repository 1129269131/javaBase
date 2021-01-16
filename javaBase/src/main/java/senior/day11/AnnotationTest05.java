package senior.day11;

/**
 * Create by koala on 2021-01-02
 *
 *  jdk8 可重复注解：① 在MyAnnotation05上声明@Repeatable，成员值为MyAnnotations05.class
 *                   ② MyAnnotation05的Target和Retention等元注解与MyAnnotations05相同
 *
 */
public class AnnotationTest05 {

    @MyAnnotation05(value="hi")
    @MyAnnotation05(value="abc")
    class Person{
        private String name;
        private int age;

        public Person() {
        }

        @MyAnnotation05
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @MyAnnotation05
        public void walk(){
            System.out.println("人走路");
        }
    }

}

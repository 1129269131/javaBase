package basicgrammar.day19;

import java.util.Objects;

/**
 * Create by koala on 2020-12-18
 */
public class RewriteEquals02 {

    private String name;
    private int age;

    public RewriteEquals02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewriteEquals02 that = (RewriteEquals02) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }
}

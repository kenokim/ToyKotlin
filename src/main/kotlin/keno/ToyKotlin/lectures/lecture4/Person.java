package keno.ToyKotlin.lectures.lecture4;

import com.sun.istack.NotNull;

public final class Person {
    @NotNull
    private final String name;
    private int age;

    public Person(@NotNull String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return this.age;
    }

    public final void setAge(int age) {
        this.age = age;
    }
}

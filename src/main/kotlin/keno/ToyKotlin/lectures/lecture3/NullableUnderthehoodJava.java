package keno.ToyKotlin.lectures.lecture3;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

public class NullableUnderthehoodJava {
    @NotNull
    public static final String foo() {
        return "foo";
    }

    @Nullable
    public static final String bar() {
        return "bar";
    }
}

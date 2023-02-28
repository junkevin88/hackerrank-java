import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class JavaSingletonPattern {
    public String str;
    private static JavaSingletonPattern instance = null;
    private JavaSingletonPattern() {
    }
    public static JavaSingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new JavaSingletonPattern();
        }
        return instance;
    }
}

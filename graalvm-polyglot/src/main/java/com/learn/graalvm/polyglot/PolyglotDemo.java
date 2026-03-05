package com.learn.graalvm.polyglot;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

/**
 * Polyglot API 入门示例
 * 演示在 Java 中通过 GraalVM Polyglot API 执行 JavaScript 代码
 */
public class PolyglotDemo {

    public static void main(String[] args) {
        // 创建 Polyglot 上下文，指定允许使用的语言
        try (Context context = Context.create("js")) {

            // 在 JavaScript 中执行表达式
            Value result = context.eval("js", "40 + 2");
            System.out.println("JS eval result: " + result.asInt());

            // 执行 JavaScript 函数
            context.eval("js", "function greet(name) { return 'Hello, ' + name + '!'; }");
            Value greetFn = context.getBindings("js").getMember("greet");
            String greeting = greetFn.execute("GraalVM").asString();
            System.out.println(greeting);

            // JavaScript 数组操作
            Value array = context.eval("js", "[1, 2, 3, 4, 5].map(x => x * x)");
            System.out.print("Squared array: ");
            for (int i = 0; i < array.getArraySize(); i++) {
                System.out.print(array.getArrayElement(i).asInt() + " ");
            }
            System.out.println();
        }
    }
}

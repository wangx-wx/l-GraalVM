package com.learn.graalvm.nativeimage;

/**
 * Native Image 入门示例
 * 使用 native-image 编译为本地可执行文件后，启动时间可从数百毫秒降至个位数毫秒
 */
public class HelloNative {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("Hello from GraalVM Native Image!");
        System.out.printf("Startup time: %.2f ms%n", (System.nanoTime() - start) / 1_000_000.0);
        System.out.printf("Max memory: %d MB%n", Runtime.getRuntime().maxMemory() / (1024 * 1024));
    }
}

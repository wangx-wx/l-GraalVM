# GraalVM 学习计划

## 阶段一：基础认知

### 1.1 GraalVM 概述
- [ ] GraalVM 是什么：高性能 JDK 发行版，包含高级 JIT 编译器（Graal Compiler）
- [ ] GraalVM 架构：Graal Compiler、Truffle Framework、SubstrateVM、Polyglot API
- [ ] GraalVM 版本：Community Edition vs Enterprise Edition
- [ ] 环境搭建：安装 GraalVM JDK 21，配置 JAVA_HOME 和 PATH

### 1.2 Graal Compiler（JIT 编译器）
- [ ] Graal Compiler 与 C2 的区别
- [ ] 使用 `-XX:+UseJVMCICompiler` 启用 Graal JIT
- [ ] JIT 编译日志分析（`-Dgraal.PrintCompilation=true`）

## 阶段二：Native Image（核心重点）

### 2.1 Native Image 基础
- [ ] Native Image 原理：AOT 编译、Closed World Assumption
- [ ] 第一个 Native Image 程序：`native-image` 命令行用法
- [ ] Maven 插件配置：`native-maven-plugin`
- [ ] 启动时间与内存占用对比（JVM vs Native）

### 2.2 Native Image 进阶
- [ ] 反射配置：`reflect-config.json`、`@RegisterForReflection`
- [ ] 资源配置：`resource-config.json`
- [ ] 动态代理配置：`proxy-config.json`
- [ ] JNI 配置：`jni-config.json`
- [ ] Tracing Agent：`-agentlib:native-image-agent` 自动生成配置
- [ ] 构建时初始化 vs 运行时初始化（`--initialize-at-build-time`）

### 2.3 Native Image 与框架集成
- [ ] Spring Boot 3.x + GraalVM Native Image
- [ ] Quarkus + GraalVM Native Image
- [ ] Micronaut + GraalVM Native Image
- [ ] 对比三大框架在 Native Image 下的表现

## 阶段三：Polyglot 多语言互操作

### 3.1 Polyglot API
- [ ] GraalVM Polyglot API 核心类：`Context`、`Value`、`Source`
- [ ] Java 调用 JavaScript（GraalJS）
- [ ] Java 调用 Python（GraalPy）
- [ ] Java 调用 Ruby（TruffleRuby）
- [ ] 语言间数据类型映射与转换

### 3.2 嵌入式场景
- [ ] 在 Java 应用中嵌入脚本引擎
- [ ] 沙箱安全策略配置
- [ ] 多语言调试

## 阶段四：Truffle 框架

### 4.1 Truffle 语言实现
- [ ] Truffle 框架概述：AST 解释器 + Partial Evaluation
- [ ] SimpleLanguage 源码阅读
- [ ] 实现一个简单的 DSL 解释器

### 4.2 Espresso（Java on Truffle）
- [ ] Espresso 原理：在 Truffle 上运行 Java 字节码
- [ ] 热交换（HotSwap）增强支持
- [ ] 多 Java 版本隔离运行

## 阶段五：性能调优与实战

### 5.1 性能分析
- [ ] JMH 基准测试：JVM 模式 vs Native Image 模式
- [ ] Profile-Guided Optimization（PGO）
- [ ] G1 GC 在 Native Image 中的配置

### 5.2 实战项目
- [ ] 构建一个 CLI 工具（Native Image 打包分发）
- [ ] 构建一个微服务（Spring Boot Native）
- [ ] 构建一个支持多语言插件的应用（Polyglot）

## 参考资源

- GraalVM 官方文档：https://www.graalvm.org/latest/docs/
- GraalVM GitHub：https://github.com/oracle/graal
- Native Image 参考手册：https://www.graalvm.org/latest/reference-manual/native-image/
- Truffle 语言实现教程：https://www.graalvm.org/latest/graalvm-as-a-platform/language-implementation-framework/

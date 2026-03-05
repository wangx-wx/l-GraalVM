# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 项目概述

这是一个 GraalVM 技术学习项目，涵盖 GraalVM 的核心特性与实践。

## 技术栈

- Java 21
- Maven（构建工具）
- GraalVM

## 构建与运行

```bash
# 编译项目
mvn clean compile

# 运行测试
mvn test

# 运行单个测试类
mvn test -Dtest=ClassName

# 运行单个测试方法
mvn test -Dtest=ClassName#methodName

# 打包
mvn clean package

# Native Image 编译（需要 GraalVM 环境）
mvn -Pnative package
```

## 项目结构

采用 Maven 多模块结构，按 GraalVM 学习主题划分模块：

- `graalvm-native-image` — Native Image 静态编译
- `graalvm-polyglot` — 多语言互操作（Polyglot API）
- `graalvm-truffle` — Truffle 语言实现框架
- `graalvm-espresso` — Java on Truffle（Espresso）
- `graalvm-performance` — 性能对比与基准测试

## 编码规范

- 使用中文注释说明 GraalVM 相关概念
- 每个模块的 README.md 记录该主题的学习笔记
- 遵循软件设计原则（SOLID、DRY、KISS）

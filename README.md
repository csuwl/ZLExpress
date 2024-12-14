[English](README.md)|[中文](README-ZH.md)
# ZLExpress Basic Grammar

# 一、Background Introduction

ZLExpress is a scripting language that supports business rules, expressions (Boolean combinations), special mathematical formula calculations, syntax analysis, and other features.

# 二、Dependency and call instructions

```xml
<groupId>io.github.csuwl</groupId>
<artifactId>ZLExpress</artifactId>
<version>1.0.5-RELEASE</version>
```


```java
ZLExpress zlExpress = new ZLExpress();
Object result = zlExpress.process("ds=543;ds>56;", null, null);
System.out.println(process);
```

# 三、Grammar Introduction

## 1、Operators and Java Object Operations
### Java syntax
```java
//support +,-,*,/,<,>,<=,>=,==,!=, Operators such as in, not,&&(and), | | (or), etc，
// "if", "else", "for", "break", "continue" and other statements, supporting custom functions. Support creating Java objects and calling methods.
n = 10;
sum = 0;
return sum+n;

int sumFunc(int d,int s){
    return d+s;
}

sum = sumFunc(n,m);

print(date("2024-12-06")," ",date("2024-02-08"));
```




### Object Operations in Java
```java
import java.math.BigInteger;
bigInt = new BigInteger();
bigInt2 = bigInt.add(bigInt);// Call object methods
```

## 2、Define functions in the script
```java
int add(int a, int b){
    return a + b;
};

int sub(int a, int b){
    return a - b;
};

a = 10;
return add(a, 4) + sub(a, 9);
```



## links for us
-  email:1105865632@qq.com

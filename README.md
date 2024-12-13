# ZLExpress基本语法

# 一、背景介绍

ZLExpress是一个脚本语言，支持业务规则、表达式（布尔组合）、特殊数学公式计算、语法分析等特性。

# 二、依赖和调用说明

```xml
<groupId>io.github.csuwl</groupId>
<artifactId>ZLExpress</artifactId>
<version>1.0.2-RELEASE</version>
```


```java
ZLExpress zlExpress = new ZLExpress();
Object result = zlExpress.process("ds=543;ds>56;", null, null);
System.out.println(process);
```

# 三、语法介绍

## 1、操作符和java对象操作
### 普通java语法
```java
//支持 +,-,*,/,<,>,<=,>=,==,!=,in,not,&&(and),||(or)等运算符，for, 支持自定义函数。支持创建java对象并调用方法。
n = 10;
sum = 0;
return sum+n;

int sumFunc(int d,int s){
    return d+s;
}

sum = sumFunc(n,m);

print(date("2024-12-06")," ",date("2024-02-08"));
```




### java的对象操作
```java
import java.math.BigInteger;
bigInt = new BigInteger();
bigInt2 = bigInt.add(bigInt);// 调用对象方法
```

## 2、脚本中定义function
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


[English](README.md)|[中文](README-ZH.md)
# ZLExpress基本语法

# 一、背景介绍

ZLExpress是一个脚本语言，支持业务规则、表达式（布尔组合）、特殊数学公式计算、语法分析等特性。代码精简，依赖最小，130k的jar包适合所有java的运行环境

# 二、依赖和调用说明

```xml
<groupId>io.github.csuwl</groupId>
<artifactId>ZLExpress</artifactId>
<version>1.0.6-RELEASE</version>
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
//支持 +,-,*,/,<,>,<=,>=,==,!=,in,not,&&(and),||(or),like等运算符，if,else,for,break,continue等语句，支持自定义函数。支持创建java对象并调用方法。
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

## 3、自定义扩展函数
自定义扩展函数通过SPI机制实现。在resources目录下创建META-INF.services文件夹，
然后创建com.csuwl.innerfunction.ExtenderCustomFunctionInterface文件，
并在文件中填写实现了com.csuwl.innerfunction.ExtenderCustomFunctionInterface的类引用名
```java
import com.csuwl.innerfunction.ExtenderCustomFunctionInterface;
import com.csuwl.model.InnerFunctionDefinition;

import java.util.Arrays;
import java.util.List;

/**
 * custom function
 * prettyPrint
 */
public class CustomPrintFunction implements ExtenderCustomFunctionInterface {
    @Override
    public Object visit(List<Object> parameterValue) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < parameterValue.size(); i++) {
            stringBuilder.append(parameterValue.get(i));
        }
        stringBuilder.append("]");

        System.out.println(stringBuilder.toString());
        return null;
    }

    @Override
    public List<InnerFunctionDefinition> getInnerFunctionDefinition() {
        return Arrays.asList(new InnerFunctionDefinition("prettyPrint"),new InnerFunctionDefinition("myPrint"));
    }
}

```

## links for us
-  email:1105865632@qq.com

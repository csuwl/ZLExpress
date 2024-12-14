[English](README.md)|[中文](README-ZH.md)
# ZLExpress Basic Grammar

# 一、Background Introduction

ZLExpress is a scripting language that supports business rules, expressions (Boolean combinations), special mathematical formula calculations, syntax analysis, and other features.

# 二、Dependency and call instructions

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

## 3、Custom extension function
Custom extension functions are implemented through SPI mechanism. Create a META-INF.services folder in the resources directory,
Then create "com.csuwl.innerfunction.ExtenderCustomFunctionInterface" file,
And filled in the file with the class reference name that implements "com.csuwl.innerfunction.ExtenderCustomFunctionInterface".
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

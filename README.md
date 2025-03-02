[English](README.md)|[中文](README-ZH.md)
# ZLExpress Basic Grammar

# 一、Background Introduction

<img src="https://github.com/csuwl/ZLExpress/blob/master/images/ZLExpress-logo.jpg" width="400px" height="400px"/>

ZLExpress is a scripting language that supports business rules, expressions (Boolean combinations), special mathematical formula calculations, syntax analysis, and other features. Simplified code, minimal dependencies, 130k jar package (smaller than QLExpress) suitable for all Java runtime environments

# 二、Dependency and call instructions

```xml
<groupId>io.github.csuwl</groupId>
<artifactId>ZLExpress</artifactId>
<version>1.0.10-RELEASE</version>
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
//support +,-,*,/,<,>,<=,>=,==,!=, Operators such as in, not,&&(and),||(or),like,etc，
// "if", "else", "for", "break", "continue" and other statements, 
// supporting custom functions. Support creating Java objects and calling methods.
n = 10;
sum = 0;
return sum+n;

sumFunc(int d,int s){
    return d+s;
}

sum = sumFunc(n,m);

if(543 in [748,654,87,543,654,7654]){
    print(date("2024-12-06")," ",date("2024-02-08"));
 }else{
    return false;
}
```

### Object Operations in Java
```java
import java.math.BigInteger;
bigInt = new BigInteger();
bigInt2 = bigInt.add(bigInt);// Call object methods
```

## 2、Base type
ZLExpress has base type: int/Int,double/double,string/String,Bool/bool/boolean,Array/array
```java
int i=543;
Int intValue=i;
s = "fdsa";
double dd=654.4532;
arr=[654,76556,,876,9];
```

## 3、Define functions in the script
```java
add(int a, int b){
    return a + b;
};

sub(int a, int b){
    return a - b;
};

a = 10;
return add(a, 4) + sub(a, 9);
```

## 4、High precision support
Specifying high-precision parameter when creating ZLExpress object
```java
ZLExpress zlExpress = new ZLExpress(true);
Object process = zlExpress.process(" id = -43 ; id==-43;", null, null);
assertEquals(process,true);
```

## 5、Date comparison
agoDay(today - comparisonDate > someValue): Used to check if a date is more than a certain number of days ago.

recentDay(today - date <= someValue): Used to check if a date falls within the past few days.
```java
dds = now();
dds agoDay 3;// false
dds recentDay 3;// true

dds = "2024-12-01";
dds agoDay 3; // true
dds recentDay 3 // false
```

## 6、Custom extension function
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
## 7、How to Contribute
Thank you very much for your interest in the ZLExpress project. We welcome your suggestions, comments (including criticisms) and contributions to the ZLExpress project.
Your suggestions, comments and contributions on ZLExpress can be made directly through GitHub's Issues.
If you have some bugfix, you can submit a "Pull Request" to the "dev" branch.

## 6、Next steps
Invite individuals who have the time and capability to compile the ZLExpress syntax code into Java bytecode and execute it during program runtime.

## links for us
-  email:1105865632@qq.com


[English](README.md)|[中文](README-ZH.md)
# ZLExpress基本语法

# 一、背景介绍

<img src="https://github.com/csuwl/ZLExpress/blob/master/images/ZLExpress-logo.jpg" width="400px" height="400px"/>

ZLExpress是一个脚本语言，支持业务规则、表达式（布尔组合）、特殊数学公式计算、语法分析等特性。代码精简，依赖最小，130k的jar包(比QLExpress还小)适合所有java的运行环境

# 二、依赖和调用说明

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

# 三、语法介绍

## 1、操作符和java对象操作
### 普通java语法
```java
//支持 +,-,*,/,<,>,<=,>=,==,!=,in,not,&&(and),||(or),like等运算符，
// if,else,for,break,continue等语句，支持自定义函数。支持创建java对象并调用方法。
n = 10;
sum = 0;
return sum+n;

int sumFunc(int d,int s){
    return d+s;
}

sum = sumFunc(n,m);

if(543 in [748,654,87,543,654,7654]){
    print(date("2024-12-06")," ",date("2024-02-08"));
 }else{
    return false;
}
```

### java的对象操作
```java
import java.math.BigInteger;
bigInt = new BigInteger();
bigInt2 = bigInt.add(bigInt);// 调用对象方法
```

## 2、基本类型
ZLExpress有以下基本类型: int/Int,double/double,string/String,Bool/bool/boolean,Array/array
```java
int i=543;
Int intValue=i;
s = "fdsa";
double dd=654.4532;
arr=[654,76556,,876,9];
```

## 3、脚本中定义function
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

## 4、高精度支持
创建ZLExpress对象时支持指定高精度运算
```java
ZLExpress zlExpress = new ZLExpress(true);
Object process = zlExpress.process(" id = -43 ; id==-43;", null, null);
assertEquals(process,true);
```
## 5、日期比较
agoDay(今天-比较日期>某个值)：可以用来比较是否为几天前。 

recentDay(今天-日期<=某个值)：可以用来比较是否为近几天。
```java
dds = now();
dds agoDay 3;// false
dds recentDay 3;// true

dds = "2024-12-01";
dds agoDay 3; // true
dds recentDay 3 // false
```

## 6、自定义扩展函数
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
## 7、怎样贡献代码
非常感谢您对ZLExpress项目的关注，欢迎您对ZLExpress项目提出建议、意见（包括批评）和贡献。
如果您对ZLExpress的建议、评论和贡献可以直接通过GitHub的Issues提出。
如果你有一些bug修复或者好的代码，你可以提交一个“Pull Request”到dev分支。


## 联系我们
-  email:1105865632@qq.com

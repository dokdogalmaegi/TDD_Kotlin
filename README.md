# TDD with. Kotlin

## Java와 Kotlin의 차이점

### 1. 코드 간결성과 가독성

### Kotlin 
Kotlin은 더 간결하고 표현력이 풍부한 문법을 가지고 있습니다. 예를 들어, 널 안전성과 확장 함수를 활용하여 코드를 더 간결하게 작성할 수 있다.
```kotlin 
// Kotlin
val result = nullableValue?.length ?: 0
```

### Java
Java에서는 위와 유사한 코드를 작성하려면, null 체크와 조건부 연산자를 명시적으로 작성해야 한다.
```java
// Java
int result;
if (nullableValue != null) {
    result = nullableValue.length();
} else {
    result = 0;
}
```

---

### Null 안전성

### Kotlin
Kotlin은 기본적으로 변수가 null인지 아닌지를 타입 시스템에서 확인하므로 NullPointerException을 방지할 수 있다.
```kotlin
// Kotlin
val length = nullableValue?.length // nullableValue가 null이 아니면 length를 가져옴
```

### Java
Java에서는 Null 체크를 수동으로 처리해야 하며, 실수로 null을 다루는 경우에 NullPointerException이 발생할 수 있다.
```java
String test = null;
int length = test.length(); // java.lang.NullPointerException
```

---

### 확장 함수

### Kotlin
Kotlin에서는 클래스의 멤버 함수가 아닌 외부에서 함수를 추가로 정의할 수 있는 확장 함수를 제공한다.
```kotlin
// Kotlin
fun String.addExclamation() = "$this!"
val result = "Hello".addExclamation()
```

### Java
Java에서는 이러한 기능을 구현하려면 정적 유틸리티 클래스나 메서드를 별도로 작성해애 한다.
```java
// Java
public static String addExclamation(String input) {
    return input + "!";
}

public static void main(String[] args) {
    String result = addExclamation("Hello");
    System.out.println(result);
}
```

---

## Kotlin의 기초 문법을 Java와 비교해서 알아보자

### 변수와 자료형 선언

```java
// Java

String name = "John";
int age = 25;
```

```kotlin
// Kotlin

val name: String = "John"
val age: Int = 25
```

---

### 조건문과 반복문

```java
// java

boolean isAdult;
if (age >= 18) {
    isAdult = true;    
} else {
    isAdult = false;    
}

for (int i = 1; i <= 5; i++) {
    System.out.println(i);    
}
```

```kotlin
// kotlin

val isAdult = if (age >= 18) true else false

for (i in 1..5) {
    println(i)
}
```

---

### 함수 정의

```java
// java

int add(int a, int b) {
    return a + b;
}
```

```kotlin
// kotlin

fun add(a: Int, b: Int): Int {
    return a + b;
}
```

---

### Null 안정성

```java
// Java

String nullableValue = null;

int length = (nullableValue != null) ? nullableValue.length() : 0;
```

```kotlin
// kotlin

val nullableValue: String? = null

val length = nullableValue?.length ?: 0
```

---

### 클래스와 객체

```java
// java

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// 객체 생성
Person person = new Person("Alice", 30);
System.out.println(person.getName());
person.setAge(31);
```

```kotlin
// kotlin

class Person(val name: String, var age: Int)

// 객체 생성
val person = Person("Alice", 30)
println(person.name)
person.age = 31
```
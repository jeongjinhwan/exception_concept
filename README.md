# Exception 정리.

## 목적
RuntimeException에 대한, throws 처리 / 비처리 어느 방법이 맞을까
### 결론
- Unchecked exceptions의 경우 대부분은 인지하지 못한 상황에서 발생하는 오류.
  - 확인이 가능한 경우, 예외 처리하는 것이 좋다 생각 합니다.
- 소스상에 throw new 예외를 발생시킨다면, 해당 예외를 throws 하는것이 좋다 생각합니다.
- 예외 처리 방법에 대해서는 
  - throws로 처리를 위임 하거나, 
  - try{}catch{}로 발생 시점에서 처리

## Java Exception Categories
### Errors
  - 발생하면 안되는 비정상적인 오류, error 하위 클래스는 throws 절에 선언 될 필요 없다. 
### Checked exceptions
  - 예외 처리 필요 O, 빌드 시 오류, RuntimeException 제외한 Exception클래스 하위class
### Unchecked exceptions
  - 예외 처리 필요 X, 빌드 시 오류 없음. RuntimeException 하위class

## Java Exception Hierarchy
```
java.lang.Object
└── java.lang.Throwable
    ├── java.lang.Error
    │   ├── VirtualMachineError  (Superclass of many Error types)
    │   │   ├── OutOfMemoryError
    │   │   └── StackOverflowError
    │   ├── LinkageError (Superclass of many Error types)
    │   │   └── NoClassDefFoundError
    │   └── ... other Error subclasses ...  (e.g., ThreadDeathError)
    └── java.lang.Exception
        ├── java.lang.RuntimeException
        │   ├── ArithmeticException
        │   ├── ArrayIndexOutOfBoundsException
        │   ├── ClassCastException
        │   ├── IllegalArgumentException
        │   ├── IllegalStateException
        │   ├── NullPointerException
        │   ├── ... other RuntimeException subclasses ... (e.g., NumberFormatException)
        └── ... other Exception subclasses ...
            ├── IOException
            │   ├── FileNotFoundException
            │   └── ... other IOException subclasses ...
            ├── SQLException
            ├── ClassNotFoundException
            └── ... other Exception subclasses ... (e.g., InterruptedException)
```
## Exception Handling in Java
- Checked exceptions은 무조건 처리 필요.
- Unchecked exceptions의 경우 필요에 따라 처리.
### try{}catch(){}
- 예외 발생이 예상되는 구문을 try{}로 감싸, catch(){}에서 대상 예외를 해소 합니다.
### throws/throw
- throw는 명시적으로 예외를 발생 시키는 것.
- throws는 확인된 예외 처리를 연기하는 것.
  - throws method를 호출하는 method는 Exception Handling 이 강제 된다.

## 번외
- "@SneakyThrows" 어노테이션을 사용하면, Checked exceptions -> RuntimeException 으로 처리 가능.
 - lombok을 적용 해야 사용 가능.
 - 사용 시 주의 필요.
  - Checked -> Runtime 으로 변경하므로, 명시적인 예외처리를 묵시적으로 변경됨.
 - 장점
  - 코드가 간결해짐 ???
 - 적용 방법.
```java
@SneakyThrows(IOException.class)
public void noSearchException(String fileNm) {
  FileReader reader = new FileReader(fileNm);
  int c;
  while ((c = reader.read()) != -1) {
    System.out.print((char) c);
  }
  reader.close();
}
 ```
참고 :
> [https://www.tutorialspoint.com/java/java_exceptions.htm](https://www.tutorialspoint.com/java/java_exceptions.htm)
> [https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Throwable.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Throwable.html)
> [https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Error.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Error.html)
> [https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html)

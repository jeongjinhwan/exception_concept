package exception_concept;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * 사용하는 함수에서는 아래의 예외를 처리해 주어야 합니다.
 */
public class ThrowHandling {

  // checkedException
  public void throwsHandlFileNotFoundException() throws FileNotFoundException {

  }

  // uncheckedException
  public void throwsHandlArithmeticException() throws ArithmeticException {

  }

  //checkedException
  /**
   * checked Exception 은 예외 처리가 강제.
   * checked Exception의 throw는 의미가 없습니다.
   * 처리 방법으로는 throws 로 처리를 위임 하거나, 혹은 해당 함수에서 처리가 강제 됩니다.
   */
  public void throwHandlSQLException() {
    // throw new SQLException();
  }

  // uncheckedException
  public void throwHandlClassCastException() {
    throw new ClassCastException();
  }

  /**
   * 내부 적으로 throw 예외를 발생 시킨다면, 명시적으로 throws에 동일 오류를 명시해 주는것이 해당 메서드를 사용하는데 있어 명확하다는 생각.
   * @throws ClassCastException
   */
  public void throwHandlClassCastException2()throws ClassCastException {
    throw new ClassCastException();
  }

}

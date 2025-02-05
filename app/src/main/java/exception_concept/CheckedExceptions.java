package exception_concept;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Checked exception에 대한 예제를 위한 구현한 클래스 입니다.<br/>
 * <br/>
 * 소스상에서 예외 처리를 강제 합니다.<br/>
 */
public class CheckedExceptions {

  public void trycatchFileNotFoundException() {
    try {
      FileReader reader = new FileReader("none1.exe");
      int c;
      while ((c = reader.read()) != -1) {
        System.out.print((char) c);
      }
      reader.close();
    } catch (FileNotFoundException fe) {
      fe.printStackTrace();
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }

  public void eFileNotFoundException() {
    // FileReader reader = new FileReader("none2.exe");
    // int c;
    // while ((c = reader.read()) != -1) {
    //   System.out.print((char) c);
    // }
    // reader.close();
  }

}

package pkg.test1;

import java.lang.annotation.*;

@Target(ElementType.MODULE)
public @interface TestModuleAnno {
  String value();
}

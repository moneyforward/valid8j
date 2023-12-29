package com.github.dakusui.valid8j;

import com.github.dakusui.valid8j_pcond.validator.Validator;

import java.util.function.Function;
import java.util.function.Predicate;

public enum Validates {
  ;
  @SuppressWarnings("unchecked")
  public static <T, E extends Throwable> T validate(T value, Predicate<T> p, Function<String, E> exceptionComposer) throws E {
    return Validator.instance().validate(value, p, (Function<String, Throwable>) exceptionComposer);
  }
}

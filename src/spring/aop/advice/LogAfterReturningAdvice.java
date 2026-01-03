package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

public class LogAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(@Nullable Object arg0, Method arg1, Object[] arg2, @Nullable Object arg3) {
        System.out.println("ReturnValue: " + arg0 + ", method: " + arg1.getName());
    }
}

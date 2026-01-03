package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

public class LogBeforeAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method arg0, Object[] arg1, @Nullable Object arg2) throws Throwable {
        System.out.println("START BEAFORE ADVICE");
    }
    
}

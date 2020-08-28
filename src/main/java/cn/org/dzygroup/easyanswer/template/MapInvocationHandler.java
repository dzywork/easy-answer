package cn.org.dzygroup.easyanswer.template;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 戴志勇
 */
public class MapInvocationHandler implements InvocationHandler {


    private final AnswerObject target;

    public MapInvocationHandler(AnswerObject target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().isInstance(target)) {
            return method.invoke(target, args);
        }
        return method.invoke(target.getProperties(), args);
    }
}

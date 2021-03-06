package online.dinghuiye.api.annotation.convert;

import online.dinghuiye.api.resolution.Convertor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据转换注解
 *
 * @author Strangeen on 2017/6/27
 *
 * @author Strangeen on 2017/9/3
 * @version 2.1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Convert {

    /**
     * @return 对应的转换实现类，默认无
     */
    Class<? extends Convertor> value();
}

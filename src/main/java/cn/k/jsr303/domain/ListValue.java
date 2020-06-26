package cn.k.jsr303.domain;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Null;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {ListValueContrValid.class})
public @interface ListValue {

    String message() default "{cn.k.jsr303.domain.ListValue.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int[] vals() default {};
}

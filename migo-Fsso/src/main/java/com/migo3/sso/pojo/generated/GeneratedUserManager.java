package com.migo3.sso.pojo.generated;

import com.migo3.sso.pojo.User;
import com.speedment.runtime.core.manager.Manager;
import javax.annotation.Generated;

/**
 * The generated base interface for the manager of every {@link
 * User} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedUserManager extends Manager<User> {
    
    @Override
    default Class<User> getEntityClass() {
        return User.class;
    }
}
package security;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import security.HelloGroup;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-17T21:34:21")
@StaticMetamodel(HelloUser.class)
public class HelloUser_ { 

    public static volatile SingularAttribute<HelloUser, String> password;
    public static volatile ListAttribute<HelloUser, HelloGroup> groups;
    public static volatile SingularAttribute<HelloUser, String> userId;

}
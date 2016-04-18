package security;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import security.HelloUser;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-17T21:34:21")
@StaticMetamodel(HelloGroup.class)
public class HelloGroup_ { 

    public static volatile SingularAttribute<HelloGroup, String> groupId;
    public static volatile ListAttribute<HelloGroup, HelloUser> users;

}
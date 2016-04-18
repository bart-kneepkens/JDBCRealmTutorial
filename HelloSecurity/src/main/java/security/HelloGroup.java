/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author BartKneepkens
 */
@Entity
public class HelloGroup implements Serializable
{
    @Id
    private String groupId;
    
    @ManyToMany
    private List<HelloUser> users;

    public String getId() {
        return groupId;
    }

    public void setId(String id) {
        this.groupId = id;
    }

    public List<HelloUser> getUsers() {
        return users;
    }

    public void setUsers(List<HelloUser> users) {
        this.users = users;
    }
    
    public HelloGroup(){}
    
}

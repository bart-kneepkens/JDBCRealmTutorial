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
public class HelloUser implements Serializable
{
    @Id
    private String userId;
    
    private String password;
    
    @ManyToMany(mappedBy="users")
    private List<HelloGroup> groups;
    
    public String getId() {
        return userId;
    }

    public void setId(String id) {
        this.userId = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<HelloGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<HelloGroup> groups) {
        this.groups = groups;
    }
    
    public HelloUser(){}
    
}

package com.rijai.LocationApi.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;    
    private String roleName;

    
    
    // public UserRoles() {
    // }

    
    // public UserRoles(Long myId, String roleName) {
    //     this.myId = myId;
    //     this.roleName = roleName;
    // }


    
    // @Override
    // public String toString() {
    //     return "UserRoles [myId=" + myId + ", roleName=" + roleName + "]";
    // }


    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((myId == null) ? 0 : myId.hashCode());
    //     result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
    //     return result;
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     UserRoles other = (UserRoles) obj;
    //     if (myId == null) {
    //         if (other.myId != null)
    //             return false;
    //     } else if (!myId.equals(other.myId))
    //         return false;
    //     if (roleName == null) {
    //         if (other.roleName != null)
    //             return false;
    //     } else if (!roleName.equals(other.roleName))
    //         return false;
    //     return true;
    // }
    // public Long getMyId() {
    //     return myId;
    // }
    // public void setMyId(Long myId) {
    //     this.myId = myId;
    // }
    // public String getRoleName() {
    //     return roleName;
    // }
    // public void setRoleName(String roleName) {
    //     this.roleName = roleName;
    // }
    


    
}
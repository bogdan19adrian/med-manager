package ro.go.bogdan.medmanager.users.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="roles")
@ToString
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Roles {

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "role_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "role_code")
    private String roleCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}

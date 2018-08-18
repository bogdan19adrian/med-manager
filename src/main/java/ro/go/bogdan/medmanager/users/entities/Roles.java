package ro.go.bogdan.medmanager.users.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;

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

    @ManyToMany
    @JoinTable(
            name = "rel_role_permissions",
            joinColumns = @JoinColumn(
                    name = "id_role", referencedColumnName = "role_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_permission", referencedColumnName = "id"))
    private Collection<Permissions> privileges;

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

    public Collection<Permissions> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Collection<Permissions> privileges) {
        this.privileges = privileges;
    }
}

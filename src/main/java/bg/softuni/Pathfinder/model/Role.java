package bg.softuni.Pathfinder.model;

import bg.softuni.Pathfinder.model.enums.UserRoles;

import javax.persistence.*;


@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idl;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private UserRoles name;

    public Role() {
    }

    public long getIdl() {
        return idl;
    }

    public Role setIdl(long idl) {
        this.idl = idl;
        return this;
    }

    public UserRoles getName() {
        return name;
    }

    public Role setName(UserRoles name) {
        this.name = name;
        return this;
    }
}

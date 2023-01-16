package bg.softuni.Pathfinder.model;

import bg.softuni.Pathfinder.model.enums.RouteCategory;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = true)
    @Enumerated(EnumType.STRING)
    private RouteCategory name;

    @Column(columnDefinition = "TEXT")
    private String text;

    public Category(){}

    public long getId() {
        return id;
    }

    public Category setId(long id) {
        this.id = id;
        return this;
    }

    public RouteCategory getName() {
        return name;
    }

    public Category setName(RouteCategory name) {
        this.name = name;
        return this;
    }

    public String getText() {
        return text;
    }

    public Category setText(String text) {
        this.text = text;
        return this;
    }
}

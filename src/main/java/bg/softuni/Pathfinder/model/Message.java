package bg.softuni.Pathfinder.model;


import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="date_time",nullable = false)
    private LocalDateTime dataTime;

    @Column(columnDefinition = "TEXT")
    private String text;

    @ManyToOne
    private User author;

    @ManyToOne
    private User recipient;

    public Message(){}

    public long getId() {
        return id;
    }

    public Message setId(long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public Message setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
        return this;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Message setAuthor(User author) {
        this.author = author;
        return this;
    }

    public User getRecipient() {
        return recipient;
    }

    public Message setRecipient(User recipient) {
        this.recipient = recipient;
        return this;
    }
}

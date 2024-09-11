package base.pkg.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PushNotiPermissionToken {

    @Id
    @GeneratedValue
    private Long id;
    private String token;

    // Constructors, getters, and setters
    public PushNotiPermissionToken() {
    }

    public PushNotiPermissionToken(Long id, String token) {
        this.id = id;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

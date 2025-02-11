package Product.example.project;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String email;



    public Object getId(){
        return id;
    }
	public Object getName() {

		return name;
	}

    public String getEmail() {
        return email;
    }


    public void setPassword(long id){
        this.id=id;
    }

    public void setId(long id){
        this.id=id;
    }
    public void setName(Object name) {
        this.name = (String) name;
    }


    public void setEmail(Object email) {
        this.email = (String) email;
    }

}





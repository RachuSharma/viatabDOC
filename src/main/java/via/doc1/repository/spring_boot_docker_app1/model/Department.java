package via.doc1.repository.spring_boot_docker_app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "DepartmentEntity")
@Table(name = "departmentTable")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

  /*  @JsonIgnore
    private List<StoryEntity> stories = new ArrayList<>();*/

    public Department() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


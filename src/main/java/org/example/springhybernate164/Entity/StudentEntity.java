package org.example.springhybernate164.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private int age;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createAd;

    @UpdateTimestamp
    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @OneToOne(cascade = CascadeType.PERSIST)
    private AdressEntity adress;

    @ManyToOne
    private TeacherEntity teachers;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<LessonEntity> lessons;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

package hello.hellospring.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "google_account")
@Comment("테이블 구글 계정 설명글")
public class GoogleAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    @Comment("계정정보를 가지고있는 id")
    private User userId;

    @Column(name = "email", columnDefinition = "VARCHAR(255)", nullable = false)
    private String email;
    private String pw;
}
package az.expressbank.categorystructure.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@Table(name = "CATEGORIES")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String categoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private int status;

    @Column(name = "category_group")
    private String categoryGroup;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "create_at")
    private LocalDateTime createAt;
}
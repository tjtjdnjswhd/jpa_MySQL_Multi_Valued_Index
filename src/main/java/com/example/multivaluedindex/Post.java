package com.example.multivaluedindex;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.convert.ValueConverter;

import java.util.List;

@Entity
@Table(name = "post")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @Convert(converter = StringListConverter.class)
    private List<String> tags;
}

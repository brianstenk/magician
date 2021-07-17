package com.example.magic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("magicians")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magician {
    private String name;
    private String sname;
}

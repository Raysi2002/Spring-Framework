package com.raysi.firstspringmvc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistance.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class clubs {
    @Id
    @GeneratedValue (Strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String photoUrl;
    private String content;
    @CreationTimeStamp
    private LocalDateTime createTime;
    @UpdateTimeStamp
    private LocalDateTime updateTime;
}

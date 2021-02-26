package com.jkb.instarexam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String username;
    private String tag;
    private Integer mainPic;
    private Integer profilePic;
    private Integer replyPic;


}

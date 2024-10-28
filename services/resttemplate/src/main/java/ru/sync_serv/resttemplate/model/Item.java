package ru.sync_serv.resttemplate.model;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    private int id;
    private String name;
}
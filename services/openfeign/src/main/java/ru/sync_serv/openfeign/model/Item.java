package ru.sync_serv.openfeign.model;

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

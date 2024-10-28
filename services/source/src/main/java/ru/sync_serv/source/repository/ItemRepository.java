package ru.sync_serv.source.repository;
import org.springframework.data.repository.CrudRepository;
import ru.sync_serv.source.model.Item;


import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Integer> {
    List<Item> findByNameIgnoreCase(String name);
}
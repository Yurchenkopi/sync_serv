package ru.sync_serv.source.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sync_serv.source.model.Item;
import ru.sync_serv.source.repository.ItemRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TrackerService {
    private final ItemRepository repository;

    public Item save(Item item) {
        return repository.save(item);
    }
    public boolean update(int id, Item item) {
        boolean result = repository.existsById(id);
        if (result) {
            item.setId(id);
            repository.save(item);
        }
        return result;
    }

    public void delete(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }

    public Item findById(int id) {
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public List<Item> findByName(String name) {
        return repository.findByNameIgnoreCase(name);
    }

    public List<Item> findAll() {
        return (List<Item>) repository.findAll();
    }
}
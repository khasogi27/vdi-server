package com.vdi.vdi_server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vdi.vdi_server.entity.Item;
import com.vdi.vdi_server.repo.ItemRepository;

@Service
public class ItemService {
  
  private final ItemRepository itemRepository;

  public ItemService(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  public List<Item> getAllItems() {
    return itemRepository.findAll();
  }

  public Item addItem(Item item) {
    return itemRepository.save(item);
  }

  public Item updaItem(Long id, Item item) {
    try {
      Optional<Item> optionalItem = itemRepository.findById(id);
      if (optionalItem.isPresent()) {
        Item existingItem = optionalItem.get();
        existingItem.setName(item.getName());
        existingItem.setDate(item.getDate());
        return itemRepository.save(existingItem);
      } else {
        throw new RuntimeException("Item not found with id: " + id);
      }
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("Error updating item: " + e.getMessage());
    }
  }

  public void deleteItem(Long idLong) {
    itemRepository.deleteById(idLong);
  }
}
package com.vdi.vdi_server.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vdi.vdi_server.entity.Item;
import com.vdi.vdi_server.service.ItemService;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {
  
  private final ItemService itemService;

  public ItemController(ItemService itemService) {
    this.itemService = itemService;
  }

  @GetMapping
  public List<Item> getAllItems() {
    return itemService.getAllItems();
  }

  @PostMapping
  public Item addItem(@RequestBody Item item) {
    return itemService.addItem(item);
  }

  @PutMapping("/{id}")
  public Item upaItem(@PathVariable Long id, @RequestBody Item item) {
    return itemService.updaItem(id, item);
  }

  @DeleteMapping("/{id}")
  private void deleteItem(@PathVariable Long id) {
    itemService.deleteItem(id);
  }

}
package com.vdi.vdi_server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vdi.vdi_server.entity.Item;
import com.vdi.vdi_server.service.ItemService;

@RestController
@CrossOrigin("${spring.cors}")
public class ItemController {
  
  @Autowired
  ItemService itemService;

  @GetMapping("/api/items")
  public List<Item> getAllItems() {
    return itemService.getAllItems();
  }

  @PostMapping("/api/item")
  public Item addItem(@RequestBody Item item) {
    return itemService.addItem(item);
  }

  @PutMapping("api/item/{id}")
  public Item upaItem(@PathVariable Long id, @RequestBody Item item) {
    return itemService.updaItem(id, item);
  }

  @DeleteMapping("api/item/{id}")
  private void deleteItem(@PathVariable Long id) {
    itemService.deleteItem(id);
  }

}

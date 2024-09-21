package com.vdi.vdi_server.repo;

import com.vdi.vdi_server.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
  
}

package com.Decoration.design.Decoration.repository;

import com.Decoration.design.Decoration.model.Orderlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderlistRepository extends JpaRepository<Orderlist, Long> {
}

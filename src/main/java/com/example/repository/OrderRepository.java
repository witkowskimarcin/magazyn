package com.example.repository;

import com.example.model.Location;
import com.example.model.Order;
import com.example.model.Principal;
import com.example.security.model.User;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByOrderByDate();

    @Query("SELECT f FROM ORDERS f ORDER BY f.date DESC")
    List<Order> findAllByOrderByDateDsc();

    List<Order> findAllByEndDate(Date d);

    List<Order> findAllByEndDateOrderByDate(Date d);

    List<Order>findAllByUserIsNullAndEndDateIsNull();

    Order findByEndDateIsNullAndUser(User u);

    List<Order>findAllByEndDateBetweenAndUser(Date start,Date end,User u );

    List<Order> findAllByPrincipal(Principal p);
}

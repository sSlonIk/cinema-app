package cinema.service;

import cinema.model.Order;
import cinema.model.ShoppingCart;
import cinema.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart cart);

    List<Order> getOrderHistory(User user);
}
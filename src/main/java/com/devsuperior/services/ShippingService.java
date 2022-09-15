package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public ShippingService() {
    }

    public double shipment(Order order){

        if(order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200) {
            return 12.0;
        }
        else {
            return 0;
        }
    }
}

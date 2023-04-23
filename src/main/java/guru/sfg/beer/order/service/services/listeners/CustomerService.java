package guru.sfg.beer.order.service.services.listeners;

import guru.sfg.brewery.model.events.CustomerPagedList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);
}

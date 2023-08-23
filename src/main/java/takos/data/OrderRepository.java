package takos.data;

import org.springframework.data.repository.CrudRepository;
import takos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}

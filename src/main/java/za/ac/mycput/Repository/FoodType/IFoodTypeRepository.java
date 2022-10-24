package za.ac.mycput.Repository.FoodType;
/*IFoodTypeRepository.java
  Repository interface for FoodType Domain
  @author: Anicka Schouw 217284183
  Date: October 2022
*/
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.mycput.Domain.FoodType;
import java.util.Set;
public interface IFoodTypeRepository extends JpaRepository<FoodType, String> {
    Set<FoodType> getAll();

}

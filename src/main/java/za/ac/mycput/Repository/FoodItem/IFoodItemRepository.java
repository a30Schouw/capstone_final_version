package za.ac.mycput.Repository.FoodItem;
/*
IFoodItemRepository.java
Repository Interface for FoodItem Domain
@author: Anicka Schouw 217284183
Date: october 2022
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.Domain.FoodItem;
@Repository
public interface IFoodItemRepository extends JpaRepository<FoodItem,String>
{
}

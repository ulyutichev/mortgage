package testTask.ulytichev.mortgage.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import testTask.ulytichev.mortgage.domain.CreditRate;

public interface CreditRateRepo extends JpaRepository<CreditRate, Integer> {
}
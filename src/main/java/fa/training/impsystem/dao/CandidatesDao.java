package fa.training.impsystem.dao;

import fa.training.impsystem.entities.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CandidatesDao extends JpaRepository<Candidates, Long> {
}

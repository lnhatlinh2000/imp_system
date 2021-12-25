package fa.training.impsystem.dao;

import fa.training.impsystem.entities.Candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class CandidatesDaoImpl {

    @Autowired
    private EntityManager entityManager;

    public List<Candidates> getEipMCompanyByPostName(String skill, String status) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Candidates> query = builder.createQuery(Candidates.class);
        Root<Candidates> root = query.from(Candidates.class);

        Predicate filterSkill = builder.like(root.get("skills").get("skillName"), skill);
        Predicate filterStatus = builder.like(root.get("interviews").get("status"), status);

        query.select(root).where(builder.and(filterSkill, filterStatus));

        Query collect = entityManager.createQuery(query);

        return collect.getResultList();

    }
}

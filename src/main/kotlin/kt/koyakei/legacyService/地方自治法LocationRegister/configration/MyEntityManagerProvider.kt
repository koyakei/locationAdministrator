package kt.koyakei.legacyService.地方自治法LocationRegister.configration

import org.axonframework.common.jpa.EntityManagerProvider
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


class MyEntityManagerProvider(entityManager:EntityManager) : EntityManagerProvider {

    override fun  getEntityManager() : EntityManager {
        return entityManager;
    }

    @PersistenceContext
    fun setEntityManager(entityManager:EntityManager ) {
        this.entityManager = entityManager;
    }

}
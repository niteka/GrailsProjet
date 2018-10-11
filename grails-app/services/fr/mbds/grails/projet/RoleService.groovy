package fr.mbds.grails.projet

import fr.mbds.grails.project.Role
import grails.gorm.services.Service

@Service(Role)
interface RoleService {

    Role get(Serializable id)

    List<Role> list(Map args)

    Long count()

    void delete(Serializable id)

    Role save(Role role)

}
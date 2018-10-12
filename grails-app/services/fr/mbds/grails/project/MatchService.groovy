package fr.mbds.grails.project


import grails.gorm.services.Service

@Service(Match)
interface MatchService {

    Match get(Serializable id)

    List<Match> list(Map args)

    Long count()

    void delete(Serializable id)

    Match save(Match match)

}
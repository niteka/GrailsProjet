package fr.mbds.grails.project

class Match {

    User winner
    int winnerScore
    User looser
    int looserScore

    Date dateCreated

    static constraints = {
    }
}

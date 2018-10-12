package grails

import fr.mbds.grails.project.Match
import fr.mbds.grails.project.Message
import fr.mbds.grails.project.Role
import fr.mbds.grails.project.User
import fr.mbds.grails.project.UserRole


class BootStrap {

    def init = { servletContext ->

        if (Role.count == 0) {
            def adminRole= new Role(authority: 'ROLE_ADMIN').save(flush: true, failOnError: true)
            def roleUser = new Role(authority: 'ROLE_USER').save(flush: true, failOnError: true)


            def user1 = new User(username: "Aime", password: "nag1",photo: "*").save(flush: true, failOnError: true)
            def user2 = new User(username: "Aime2", password: "nag2").save(flush: true, failOnError: true)
            def admin = new User(username: "admin", password: "admin").save(flush: true, failOnError: true)

            UserRole.create(user1, roleUser, true)
            UserRole.create(user2, roleUser, true)
            UserRole.create(admin, adminRole, true)

            new Match(winner: user1, looser: user2, winnerScore: 10, looserScore: 1).save(flush: true, failOnError: true)

            new Message(author: user1, target: user2, content: "c'est moi le meilleur").save(flush: true, failOnError: true)
            new Message(author: user2, target: user1, content: ":(").save(flush: true, failOnError: true)
        }
    }
    def destroy = {
    }
}
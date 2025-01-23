package org.example;

import com.github.javafaker.Faker;
import org.example.dao.EventoDAO;
import org.example.dao.LocationDAO;
import org.example.dao.PartecipazioneDAO;
import org.example.dao.PersonaDAO;
import org.example.entities.*;
import org.example.enumeration.TipoEvento;
import org.example.enumeration.TipoStato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.time.LocalDate;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class Main
{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_u1_d2project");
    private static EntityManager em = emf.createEntityManager();
    public static void main( String[] args ) {

        EventoDAO eventoDao = new EventoDAO(em);
        LocationDAO locationDao = new LocationDAO(em);
        PersonaDAO personaDao = new PersonaDAO(em);
        PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO(em);
        Faker faker = new Faker(Locale.ITALY);

        //Location l1 = new Location(faker.name().name(),faker.address().city());
        //locationDao.save(l1);
        /*Persona p1 = new Persona(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                LocalDate.of(1980,10,25),
                TipoSesso.F); */
        //personaDao.save(p1);
        //  Evento e1 = new Evento("Finale Coppa",LocalDate.of(2025,1,25),"Super finale di coppa", tipoEvento.PUBBLICO,100,locationDao.getbyID(1));
        //  eventoDao.save(e1);

        Evento e1 = new Concerto("Vasco Rossi", LocalDate.of(2025, 1 ,28), "ultimo concerto", TipoEvento.PUBBLICO, 100, locationDao.getByID(3), TipoStato.CONFERMATA);

        //Partecipazione p1 = new Partecipazione(personaDao.getById(2),eventoDao.getByID(1), TipoStato.CONFERMATA);
        //partecipazioneDao.save(p1);




        em.close();
        emf.close();
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Dao.PersonaDao;
import Dao.PersonaDaoImplement;
import Model.Persona;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author RomanO
 */
@ManagedBean
@ViewScoped
public class personaBean {
Persona persona;
List<Persona> personas;
    /**
     * Creates a new instance of personaBean
     */
    public personaBean() {
        persona=new Persona();
    }
    public List<Persona> getPersonas(){
        PersonaDao linkDato=new PersonaDaoImplement();
        personas=linkDato.mostrarPersonas();
        return personas;
//        return linkDato.mostrarPersonas();
    }
    public void insertar(){
        PersonaDao linkDao=new PersonaDaoImplement();
        linkDao.insertarPersona(persona);
        persona=new Persona();
    }
    public void modificar(){
        PersonaDao linkDao=new PersonaDaoImplement();
        linkDao.modificarPersona(persona);
        persona=new Persona();
    }
    public void eliminar(){
        PersonaDao linkDao=new PersonaDaoImplement();
        linkDao.eliminarPersona(persona);
        persona=new Persona();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    } 
}

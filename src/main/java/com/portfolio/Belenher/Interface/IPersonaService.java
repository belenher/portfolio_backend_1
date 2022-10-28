
package com.portfolio.Belenher.Interface;

import com.portfolio.Belenher.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
//Guardar un objeto de tipo persona
   public void savePersona(Persona persona);
   
//Eliminar un objeto buscado por id
   public void deletePersona(Long id);

//Borrar una persona por id
   public Persona findPersona(Long id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Nobrega
 */
public class JPA {
    
    
    @PersistenceUnit(unitName = "SGB-FECNPU")
    private EntityManagerFactory emf = null;
    
    
    public EntityManagerFactory getEmf(){
        return emf = Persistence.createEntityManagerFactory("SGB-FECNPU");
    }
}

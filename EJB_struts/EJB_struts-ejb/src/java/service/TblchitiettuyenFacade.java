/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Tblchitiettuyen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tai
 */
@Stateless(mappedName = "TblchitiettuyenFacade")
public class TblchitiettuyenFacade extends AbstractFacade<Tblchitiettuyen> implements TblchitiettuyenFacadeLocal {

    @PersistenceContext(unitName = "EJB_struts-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblchitiettuyenFacade() {
        super(Tblchitiettuyen.class);
    }
    
}

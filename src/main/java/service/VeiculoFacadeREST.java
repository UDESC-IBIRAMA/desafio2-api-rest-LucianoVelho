/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Veiculo;

/**
 *
 * @author lucia
 */
@Stateless
@Path("model.veiculo")
public class VeiculoFacadeREST extends AbstractFacade<Veiculo> {

    @PersistenceContext(unitName = "com.mycompany_Desafio_2_Dsw_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public VeiculoFacadeREST() {
        super(Veiculo.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Veiculo entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Veiculo entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces( MediaType.APPLICATION_JSON)
    public Veiculo find(@PathParam("id") Long id) {
        return super.find(id);
    }
    @GET
    @Path("/cor/{cor}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCor(@PathParam("cor") String cor) {
        return super.findCor(cor);
    }
    @GET
    @Path("/quilometragem/{quilometragem}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findQuilometragem(@PathParam("quilometragem") int quilometragem) {
        return super.findQuilometragem(quilometragem);
    }
    @GET
    @Path("/motor/{motor}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findMotor(@PathParam("motor") String motor) {
        return super.findMotor(motor);
    }
    @GET
    @Path("/tipo/{tipo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findTipo(@PathParam("tipo") String tipo) {
        return super.findTipo(tipo);
    }
     @GET
    @Path("/cor/{cor}/motor/{motor}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCorMotor(@PathParam("cor") String cor , @PathParam("motor") String motor) {
        return super.findCorMotor(cor,motor);
    }
    @GET
    @Path("/cor/{cor}/quilometragem/{quilometragem}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCorQuilometragem(@PathParam("cor") String cor , @PathParam("quilometragem") int quilometragem) {
        return super.findCorQuilometragem(cor,quilometragem);
    }
    @GET
    @Path("/cor/{cor}/tipo/{tipo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCorTipo(@PathParam("cor") String cor , @PathParam("tipo") String tipo) {
        return super.findCorTipo(cor,tipo);
        
    }
     @GET
    @Path("/motor/{motor}/quilometragem/{quilometragem}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findMotorQuilometragem(@PathParam("motor") String motor , @PathParam("quilometragem") int quilometragem) {
    return super.findMotorQuilometragem(motor,quilometragem);
        
    }
      @GET
    @Path("/motor/{motor}/tipo/{tipo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findMotorTipo(@PathParam("motor") String motor , @PathParam("tipo") String tipo) {
    return super.findMotorTipo(motor,tipo);
        
    }
    @GET
    @Path("/quilometragem/{quilometragem}/tipo/{tipo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findQuilometragemTipo(@PathParam("Quilometragem") int quilometragem , @PathParam("tipo") String tipo) {
    return super.findQuilometragemTipo(quilometragem,tipo);
        
    }
     @GET
    @Path("/quilometragem/{quilometragem}/tipo/{tipo}/motor/{motor}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findQuilometragemTipoMotor(@PathParam("Quilometragem") int quilometragem , @PathParam("tipo") String tipo ,@PathParam("motor") String motor) {
    return super.findQuilometragemTipo(quilometragem,tipo,motor);
        
    }
    @GET
    @Path("/cor/{cor}/quilometragem/{quilometragem}/tipo/{tipo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCorQuilometragemTipo(@PathParam("cor") String cor , @PathParam("quilometragem") int quilometragem , @PathParam("tipo") String tipo) {
        return super.findCorQuilometragemTipo(cor,quilometragem,tipo);
    }
      @GET
    @Path("/cor/{cor}/quilometragem/{quilometragem}/motor/{motor}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCorQuilometragemMotor(@PathParam("cor") String cor , @PathParam("quilometragem") int quilometragem , @PathParam("motor") String motor) {
        return super.findCorQuilometragemMotor(cor,quilometragem,motor);
    }
     @GET
    @Path("/cor/{cor}/quilometragem/{quilometragem}/motor/{motor}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCorTipoMotor(@PathParam("cor") String cor , @PathParam("tipo") String tipo , @PathParam("motor") String motor) {
        return super.findCorTipoMotor(cor,tipo,motor);
    }
       @GET
    @Path("/cor/{cor}/quilometragem/{quilometragem}/motor/{motor}/quilometragem/{quilometragem}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findCorTipoMotorquilometragem(@PathParam("cor") String cor , @PathParam("tipo") String tipo , @PathParam("motor") String motor , @PathParam("quilometragem" ) int quilometragem) {
        return super.findCorTipoMotorQuilometragem(cor,tipo,motor,quilometragem);
    }
    @GET
    @Path("/montadora/{montadora_nome}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findMontadoraNome(@PathParam("montadora_nome") String montadora_nome) {
        return super.findMontadoraNome(montadora_nome);
    }
      @GET
    @Path("/modelo/{modelo_nome}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findModeloNome(@PathParam("modelo_nome") String modelo_nome) {
        return super.findModeloNome(modelo_nome);
    }
    
    @GET
    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces( MediaType.APPLICATION_JSON)
    public List<Veiculo> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

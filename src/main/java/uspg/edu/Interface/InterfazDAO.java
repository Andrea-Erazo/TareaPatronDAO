/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.Interface;

import java.util.List;
import uspg.edu.model.Alumno;
import uspg.edu.model.Catedratico;

/**
 *
 * @author Andrea Erazo
 */
public interface InterfazDAO {
     public void registrar (Alumno alumno) throws Exception;
    public void modificar (Alumno alumno) throws Exception;
    public void eliminar (Alumno alumno) throws Exception;
    public List<Alumno> listar() throws Exception;
    
    public void registrar (Catedratico catedratico) throws Exception;
    public void modificar (Catedratico catedratico) throws Exception;
    public void eliminar (Catedratico catedratico) throws Exception;
    public List<Catedratico> listado() throws Exception;
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeWS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author BRUNOSILVA
 */
@WebService(serviceName = "MostraNomeComIdade")
@Stateless()
public class MostraNomeComIdade {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "mostranome")
    public String nomeMaisIdadeDez(@WebParam(name = "name") String nomeDigitado) {
        return nomeDigitado + " "+10;
    }
}

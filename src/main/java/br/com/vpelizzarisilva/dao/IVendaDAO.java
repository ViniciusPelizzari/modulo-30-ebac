/**
 * 
 */
package br.com.vpelizzarisilva.dao;

import br.com.vpelizzarisilva.dao.generic.IGenericDAO;
import br.com.vpelizzarisilva.domain.Venda;
import br.com.vpelizzarisilva.exceptions.DAOException;
import br.com.vpelizzarisilva.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}

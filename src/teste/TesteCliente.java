/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
//@author emanu

import br.com.controle.Cliente;
import br.com.entidade.ClienteDAO;

public class TesteCliente {
    public static void main(String[] args) throws Exception {
        Cliente cliente = ClienteDAO.findByCpf("99999");
        
        System.out.println(" "+ cliente.getNome_usuario());
    }
}

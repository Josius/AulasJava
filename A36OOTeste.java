public class A36OOTeste{
	
	public static void main(String[] args){
		
		A36OOContato contato = new A36OOContato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 9999 9999");
		
		//criar objeto endereco
		
		//Relacionamento tem-um endereco
		A36OOEndereco end = new A36OOEndereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCEP("99999-999");
		
		contato.setEndereco(end);
		
		//Relacionamento tem-um telefone e tem-muitos
		A36OOTelefone telefone = new A36OOTelefone();
		telefone.setTipo("Celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-999");
		
		A36OOTelefone telefone2 = new A36OOTelefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("11");
		telefone2.setNumero("8888-8888");
		
		//Relacionamento tem-muitos telefones
		A36OOTelefone[] telefones = new A36OOTelefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//Relacionamento tem-um telefone 
		//contato.setTelefone(telefone);
		
		//Relacionamento tem-muitos telefones
		contato.setTelefones(telefones);
		
		//Teste saida no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null){
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero() );
		}*/
		
		if(contato!=null && contato.getTelefones() != null){
			for(A36OOTelefone t : contato.getTelefones()){
				System.out.println(t.getDdd() + " " + t.getNumero() );
			}
		}
	}
}
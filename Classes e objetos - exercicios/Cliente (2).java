//Crie uma nova classe chamada Cliente.
• Adicione os atributos da classe: nome, CPF e endereço.
• Crie métodos para inicializar os atributos (um para cada atributo).
• Crie o métodos para imprimir na tela os atributos do cliente.
• Crie o método atualizarEndereco (String novoEndereco) que irá 
atualizar o endereço do cliente com o novo endereço informado.
• No método main da sua classe, crie um objeto da classe Cliente e 
chame os métodos para imprimir os atributos do cliente.
• Por fim, atualize o endereço e em seguida o imprima na tela para 
testar se eles estão funcionando corretamente.
public class Cliente
{
    //atributos da Classe
    private String nome;
    private String CPF;
    private String endereco;
    
    //inicialização dos metodos
    
    public void inicializarnome(String nome){
        this.nome = nome;
    }
    public void inicializarCPF(String CPF){
        this.CPF = CPF;
    }
    public void inicializarendereco(String endereco){
        this.endereco = endereco;
    }
    public void imprimirdetalhes(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+CPF);
        System.out.println("endereço: "+endereco);
    }
    public void atualizarEndereco(String novoEndereco){
        this.endereco = novoEndereco;
    }
    
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.inicializarnome("João Silva");
		cliente.inicializarCPF("074.943.543.79");
		cliente.inicializarendereco("Odesio frota gomes");
		
		System.out.println("Detalhes do cliente");
		cliente.imprimirdetalhes();
		
		cliente.atualizarEndereco("luis lima, 184");
		System.out.println("atualização de endereco");
		cliente.imprimirdetalhes();
		
	}
}

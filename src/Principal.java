import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();

		while(true) {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Valor total convertido para Real");
			System.out.println("5 - Encerrar\n");
			System.out.println("Digite o número correspondente ao que deseja realizar:");
			
			/*verifica se o dado que foi digitado pelo usuario e um valor entre 0 e 5*/
			int opcao;
            
			do {
                while (!teclado.hasNextInt()) { //verifica se o valor digitado é um inteiro
                    System.out.println("Opção inválida. Digite o número novamente: ");
                    teclado.next(); //limpa o buffer de entrada
                }
                opcao = teclado.nextInt();
                if (opcao <= 0 || opcao > 5) { //verifica se o valor está no intervalo de 1 a 5
                    System.out.println("Opção inválida. Digite o número novamente: ");

                }
            } while (opcao <= 0 || opcao > 5); //repete enquanto o valor não estiver entre 1 e 5
			
			switch(opcao) {
			    
                case 1:
			    
			    int tipo;
			    
                do {
			        System.out.println("Escolha o tipo da moeda que deseja adicionar:");
			        System.out.println("1 - Real");
			        System.out.println("2 - Dólar");
			        System.out.println("3 - Euro\n");

			        while (!teclado.hasNextInt()) { //verifica se o valor digitado é um inteiro
                        System.out.println("\nOpção inválida. Digite o número novamente: ");
			            System.out.println("Escolha o tipo da moeda que deseja adicionar:");
			            System.out.println("1 - Real");
			            System.out.println("2 - Dólar");
			            System.out.println("3 - Euro");
			            teclado.next(); //limpa o buffer de entrada
			        }
			        tipo = teclado.nextInt();
			    } 
                while (tipo <= 0 || tipo > 3);
			    
                if (tipo == 1) {
			        System.out.println("\nDigite o valor da moeda que deseja adicionar: ");
			        double valor = teclado.nextDouble();
			        Real real = new Real(valor);
			        cofrinho.adicionar(real); /*adicionando real no cofrinho*/                            
			        break;
			    } 
                else if (tipo == 2) {
			        System.out.println("\nDigite o valor da moeda que deseja adicionar: ");
			        double valor = teclado.nextDouble();
			        Dolar dolar = new Dolar(valor);
			        cofrinho.adicionar(dolar); /*adicionando dolar no cofrinho*/
			        break;
			    } 
                else if (tipo == 3) {
			        System.out.println("\nDigite o valor da moeda que deseja adicionar: ");
			        double valor = teclado.nextDouble();
			        Euro euro = new Euro(valor);
			        cofrinho.adicionar(euro); /*adicionando euro no cofrinho*/
			        break;
			    } 
                else {
			        System.out.println("\nOpção inválida.");
			        break;
			    }
					
				case 2:
				    System.out.println("Qual moeda voce deseja remover ?");
				    System.out.println("1 - Real");
				    System.out.println("2 - Dólar");
				    System.out.println("3 - Euro\n");
				    opcao=teclado.nextInt();

				    if(opcao == 1) {
				        System.out.println("\nDigite o valor da moeda que deseja remover: ");
						System.out.println("OBS: Só é possível remover o valor total da moeda.");
				        double valor = teclado.nextDouble();
						Real real = new Real(valor);
				        cofrinho.remover(real); 
				        break;
				    }
				    else if(opcao == 2) {
				        System.out.println("\nDigite o valor da moeda que deseja remover: ");
						System.out.println("OBS: Só é possível remover o valor total da moeda.");						
				        double valor = teclado.nextDouble();
						Dolar dolar = new Dolar(valor);
				        cofrinho.remover(dolar);
				        break;
				    }
				    else if(opcao == 3){
				        System.out.println("\nDigite o valor da moeda que deseja remover: ");
						System.out.println("OBS: Só é possível remover o valor total da moeda.");
				        double valor = teclado.nextDouble();
						Euro euro = new Euro(valor);
				        cofrinho.remover(euro);
				        break;
				    }
				    else {
				    	System.out.println("\nOpção inválida");
				        break;
				    }
				    
				case 3:
					System.out.println("\nListar moedas:");
					cofrinho.listagemMoedas();
					break;

				case 4:
                    System.out.println("\nValor total em real:");
					cofrinho.converterMoedas();
					break;
                    
				case 5:
					System.out.println("\nEncerrando o programa...");
			        teclado.close(); // fechar o objeto Scanner para evitar vazamentos de recursos
			        return; // return; encerra o programa

				default:
			        System.out.println("\nOpção inválida, tente novamente.");

			}		
					
		}
	}
}

package Capitulo3IntroducaoAClasses.classeInvoice3_12;

/*(Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
classe deve ter um construtor que inicializa as quatro variáveis de instância.
Forneça um método set e um get para cada variável de instância.
Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0.
Se o preço por item não for positivo, ele deve ser configurado como 0.0.
Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
capacidades da classe Invoice.*/

public class InvoiceTest {

    public static void main(String[] args) {

        //Teste
        Invoice invoice = new Invoice("0001", "Mouse", 5, 50.5);
        System.out.println("-----INVOICE-----");
        System.out.println("|Number: " + invoice.getNumber());
        System.out.println("|Description: " + invoice.getDescription());
        System.out.println("|Price: $" + invoice.getPrice());
        System.out.println("|Quantity: " + invoice.getQuantity());
        System.out.println("|Total: " + invoice.getInvoiceAmount());

        //Tratando números negativos como foi pedido na questão
        invoice.setQuantity(-54);
        invoice.setPrice(-89.0);
        System.out.println("\n--------------negative numbers treatment-----------------");
        System.out.println("|Price: $" + invoice.getPrice());
        System.out.println("|Quantity: " + invoice.getQuantity());



    }
}

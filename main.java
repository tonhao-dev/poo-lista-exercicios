class Main {

  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.nome_titular = "Hugo";
    c1.numero = 123;
    c1.agencia = "45678-9";
    c1.saldo = 50.0;
    c1.data_abertura = "04/06/2015";
    c1.deposita(100.0);

    System.out.println(c1.recuperaDadosParaImpressao());
  }
}

class Conta {
  String nome_titular;
  int numero;
  String agencia;
  double saldo;
  String data_abertura;

  //	seus	outros	atributos	e	métodos
  void saca(double valor) {
    this.saldo = saldo + valor;
  }

  void deposita(double valor) {
    this.saldo = this.saldo + valor;
  }

  double calculaRendimento() {
    //	o	que	fazer	aqui	dentro?
    return 0.1;
  }

  String recuperaDadosParaImpressao() {
    return
      "Titular: " + this.nome_titular + "\n" +
      "Numero: " + this.numero + "\n" +
      "Agencia: " + this.agencia + "\n" +
      "Saldo: " + this.saldo + "\n" +
      "Data de abertura: " + this.data_abertura + "\n";
  }
}

class Conta {
  private String titular;
  private int numero;
  private String agencia;
  private double saldo;
  private String data_abertura;

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
      "Titular: " + this.titular + "\n" +
      "Numero: " + this.numero + "\n" +
      "Agencia: " + this.agencia + "\n" +
      "Saldo: " + this.saldo + "\n" +
      "Data de abertura: " + this.data_abertura + "\n";
  }

  String getTitular() {
    return this.titular;
  }

  void setTitular(String titular) {
    this.titular = titular;
  }

  int getNumero() {
    return this.numero;
  }

  void setNumero(int numero) {
    this.numero = numero;
  }

  String getAgencia() {
    return this.agencia;
  }

  void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  double getSaldo() {
    return this.saldo;
  }

  void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  String getDataAbertura() {
    return this.data_abertura;
  }

  void setDataAbertura(String data_abertura) {
    this.data_abertura = data_abertura;
  }
}

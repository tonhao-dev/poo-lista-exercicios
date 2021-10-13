class Conta {
  String nome_titular;
  int numero;
  String agencia;
  double saldo;
  String data_abertura;

  //	seus	outros	atributos	e	métodos
  void sacar(double valor) {
    this.saldo = saldo + valor;
  }

  void depositar(double valor) {
    this.saldo = this.saldo + valor;
  }

  double calcularRendimento() {
    //	o	que	fazer	aqui	dentro?
    return 0.1;
  }
}

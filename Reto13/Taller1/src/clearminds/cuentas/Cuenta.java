package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;

	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
public void imprimir() {
	System.out.println("********************\n\nCUENTA\n********************\n\nNúmero de Cuenta:"+this.getId()+"\nTipo:"+ this.getTipo()+"\nSaldo: USD "+this.getSaldo()+"\n\n**********************");
	
}
public static void imprimirCabecera() {
	System.out.println("***************************************************\n"
			 + "|                    CUENTAS                      |\n"
			 + "***************************************************\n"
			 +"| ID                  | TIPO    |    SALDO        |\n"
			 + "---------------------------------------------------" );
}
public void imprimirConMiEstilo() {
	String tipoSalida="";
	String idSalida="";
	String saldoSalida="";
	for(int i=(20-this.getId().length());i>0;i--) {
		idSalida+=" ";
	}
	
	for(int i=(8-this.getTipo().length());i>0;i--) {
		tipoSalida+=" ";
	}
	String saldoString=""+this.saldo;
	for(int i=(11-saldoString.length());i>0;i--) {
		saldoSalida+=" ";
	}
	System.out.println("| "+this.getId()+idSalida+"| "+ this.getTipo()+tipoSalida+"| USD "+this.getSaldo()+saldoSalida+" |\n---------------------------------------------------");

}
}

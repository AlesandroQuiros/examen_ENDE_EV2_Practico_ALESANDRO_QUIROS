package optimizacionCodigo;

import java.util.Date;

public class Persona {

	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private int numeroColegiadoMedicina;
	private int numeroColegiadoEnfermeria;

	public Persona() {
		super();
	}

	public void realizarDiagnostico() {
	}

	public void visitarPaciente() {
	}

	public void vertificarAlta() {
	}

	public void realizarCuras() {
	}

	public void contactarFamilias() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getNumeroColegiadoMedicina() {
		return numeroColegiadoMedicina;
	}

	public void setNumeroColegiadoMedicina(int numeroColegiadoMedicina) {
		this.numeroColegiadoMedicina = numeroColegiadoMedicina;
	}

	public int getNumeroColegiadoEnfermeria() {
		return numeroColegiadoEnfermeria;
	}

	public void setNumeroColegiadoEnfermeria(int numeroColegiadoEnfermeria) {
		this.numeroColegiadoEnfermeria = numeroColegiadoEnfermeria;
	}

}
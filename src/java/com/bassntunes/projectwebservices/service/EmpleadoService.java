/**
 * 
 */
package com.bassntunes.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.bassntunes.projectwebservices.entity.Empleado;

/**
 * @author Horiz
 *
 */
public class EmpleadoService {

	/**
	 * metodo qur nos permite consultar empleado por su numero de Id
	 * 
	 * @param idEmpleado
	 * @return empleado consultado
	 */
	public Empleado consultarEmpleadoPorId(Integer idEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();

		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getIdEmpleado().equals(idEmpleado)) {
				return empleadoConsultado;
			}
		}

		return null;
	}

	/**
	 * metodo que simula la consulta de empleados
	 * 
	 * @return empleado consultado
	 */
	public Empleado consultarEmpleado() {

		Empleado empleado = new Empleado();

		empleado.setIdEmpleado(4567);
		empleado.setNombre("Alejandro");
		empleado.setPrimerApellido("Cruz");
		empleado.setSegundoApellido("Duran");
		empleado.setEdad(28);
		empleado.setFechaCreacion(LocalDateTime.now());

		return empleado;
	}

	/**
	 * metodo que permite consultar la lista de empleados
	 * 
	 * @return lista de empleados
	 */
	public List<Empleado> consultarEmpleados() {

		List<Empleado> empleados = new ArrayList();

		Empleado empleado1 = new Empleado();

		empleado1.setIdEmpleado(59274);
		empleado1.setNombre("Fabio");
		empleado1.setPrimerApellido("Hernandez");
		empleado1.setSegundoApellido("Hernandez");
		empleado1.setEdad(20);
		empleado1.setFechaCreacion(LocalDateTime.now());

		Empleado empleado2 = new Empleado();

		empleado2.setIdEmpleado(1783);
		empleado2.setNombre("Santiago");
		empleado2.setPrimerApellido("Gonzalez");
		empleado2.setSegundoApellido("Gonzalez");
		empleado2.setEdad(23);
		empleado2.setFechaCreacion(LocalDateTime.now());

		empleados.add(empleado1);
		empleados.add(empleado2);

		return empleados;
	}

}

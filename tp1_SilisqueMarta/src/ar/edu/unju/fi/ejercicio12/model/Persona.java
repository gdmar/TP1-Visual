package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento ;
	
	/*public int edad() {
		Calendar fechaActual = Calendar.getInstance();
		int añoActual = fechaActual.get(Calendar.YEAR);
		int mesActual = fechaActual.get(Calendar.MONTH) + 1; 
		int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
		int fechaq=this.fechaNacimiento.get(Calendar.YEAR);
		int edad = fechaActual.add(Calendar.YEAR, );
		
		if (mesActual < this.fechaNacimiento.get(Calendar.MONTH) ||  mesActual == this.fechaNacimiento.get(Calendar.MONTH) && diaActual < this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)) {
            edad--; 
            
        }
		return edad;
		
	}*/
	 
	public String signoDelSodiaco() {
		switch (this.fechaNacimiento.get(Calendar.MONTH)) {
        case 1: // Enero
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 20) return "Capricornio";
            else return "Acuario";
        case 2: // Febrero
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 19) return "Acuario";
            else return "Piscis";
        case 3: // Marzo
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 21) return "Piscis";
            else return "Aries";
        case 4: // Abril
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 20) return "Aries";
            else return "Tauro";
        case 5: // Mayo
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 21) return "Tauro";
            else return "Géminis";
        case 6: // Junio
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 21) return "Géminis";
            else return "Cáncer";
        case 7: // Julio
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 23) return "Cáncer";
            else return "Leo";
        case 8: // Agosto
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 23) return "Leo";
            else return "Virgo";
        case 9: // Septiembre
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 23) return "Virgo";
            else return "Libra";
        case 10: // Octubre
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 23) return "Libra";
            else return "Escorpio";
        case 11: // Noviembre
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 22) return "Escorpio";
            else return "Sagitario";
        case 12: // Diciembre
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 22) return "Sagitario";
            else return "Capricornio";
        default:
            return "Fecha de nacimiento inválida";
    }
		
	}
	
	public String estacion() {
		
		switch (this.fechaNacimiento.get(Calendar.MONTH)) {
        case 1: // Enero
        case 2: // Febrero
            return "Verano";
           
        case 3:     // Marzo
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) > 21) {
                return "Otoño";
            } else {
                return "Verano";
            }
           
        case 4: // Abril
        case 5: // Mayo
            return "Otoño";
          
        case 6: // Junio
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) >= 21) {
                return "Invierno";
            } else {
                return "Otoño";
            }
          
        case 7: // Julio
        case 8: // Agosto
            return "Invierno";
          
        case 9:   // Septiembre
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) >= 21) {
                return "Primavera";
            } else {
                return "Invierno";
            }
           
        case 10: // Octubre
        case 11: // Noviembre
            return "Primavera";
           
        case 12: // Diciembre
            if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH) >= 21) {
                return "Verano";
            } else {
                return "Pimavera";
            }
           
        default:
            return "Mes inválido";
           
    }

    
}
	

	
	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ","
				+ " \n fechaNacimiento=" + fechaNacimiento ;
	}
	

}

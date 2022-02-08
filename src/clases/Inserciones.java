/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaBandoCampos = "(Id_Bando int unsigned NOT NULL AUTO_INCREMENT,"
			+ "Nombre varchar(100) DEFAULT NULL," 
			+ "Ganador tinyint(1) DEFAULT NULL,"
			+ "Id_Guerra int unsigned DEFAULT NULL," 
			+ "PRIMARY KEY (Id_Bando),"
			+ "KEY Id_Guerra (Id_Guerra),"
			+ "CONSTRAINT Bando_ibfk_1 FOREIGN KEY (Id_Guerra) REFERENCES Guerra (Id_Guerra) ON DELETE CASCADE);";

	public static String tablaGuerraCampos = "(Id_Guerra int unsigned NOT NULL AUTO_INCREMENT, "
			+ "Nombre varchar(100) DEFAULT NULL, "
			+ "Fecha_Inicio date DEFAULT NULL, "
			+ "Fecha_Fin date DEFAULT NULL, "
			+ "PRIMARY KEY (Id_Guerra));";
	
	public static String tablaHistoricoCampos = "(Id_Historico int unsigned NOT NULL AUTO_INCREMENT,"
			+ "Inicio_Independencia date DEFAULT NULL,"
			+ "Fin_Independencia date DEFAULT NULL,"
			+ "Nombre_Pais varchar(100) DEFAULT NULL,"
			+ "PRIMARY KEY (Id_Historico),"
			+ "KEY Nombre_Pais (Nombre_Pais),"
			+ "CONSTRAINT Historico_ibfk_1 FOREIGN KEY (Nombre_Pais) REFERENCES Pais (Nombre) ON DELETE CASCADE);";
	
	public static String tablaPaisCampos = "(Nombre varchar(100) NOT NULL, PRIMARY KEY (Nombre));";
	
	public static String tablaSe_uneCampos = "(Id_Bando int unsigned NOT NULL,"
			+ "Nombre_Pais varchar(100) NOT NULL,"
			+ "Fecha_Union date DEFAULT NULL,"
			+ "Fecha_Abandono date DEFAULT NULL,"
			+ "PRIMARY KEY (Id_Bando,Nombre_Pais),"
			+ "KEY Nombre_Pais (Nombre_Pais),"
			+ "CONSTRAINT Se_Une_ibfk_1 FOREIGN KEY (Id_Bando) REFERENCES Bando (Id_Bando) ON DELETE CASCADE,"
			+ "CONSTRAINT Se_Une_ibfk_2 FOREIGN KEY (Nombre_Pais) REFERENCES Pais (Nombre) ON DELETE CASCADE);";
				
	public static String insercionTablaGuerra = "(Nombre, Fecha_Inicio, Fecha_Fin) values "
			+ "('Guerra1', '1999-12-12', '2000-12-12'),"
			+ "('Guerra2', '1999-12-12', '2000-12-12'),"
			+ "('Guerra3', '1999-12-12', '2000-12-12'),"
			+ "('Guerra4', '1999-12-12', '2000-12-12'),"
			+ "('Guerra5', '1999-12-12', '2000-12-12');";
	
	public static String insercionTablaBando = "(Nombre, Ganador, Id_Guerra) values "
			+ "('Visigodos', true, 1),"
			+ "('Alianza Francesa', false, 1),"
			+ "('Eje', true, 2),"
			+ "('Los Aliados', false, 2),"
			+ "('Alianza', true, 3);";
	
	public static String insercionTablaPais = " values "
			+ "('Corea'),"
			+ "('Vietnam'),"
			+ "('Italia'),"
			+ "('España'),"
			+ "('Portugal');";
	
	public static String insercionTablaHistorico = "(Inicio_Independencia, Fin_Independencia, Nombre_Pais) values "
			+ "('1923/12/12', '2000/12/12', 'Corea'),"
			+ "('1923/12/12', '2000/12/12', 'Italia'),"
			+ "('1923/12/12', '2000/12/12', 'España'),"
			+ "('1923/12/12', '2000/12/12', 'Portugal'),"
			+ "('1923/12/12', '2000/12/12', 'Vietnam');";
	
	public static String insercionTablaSe_une = " values "
			+ "(1, 'Corea', '1902/12/12', '1903/12/12'),"
			+ "(2, 'Vietnam', '1902/11/12', '1903/12/12'),"
			+ "(3, 'Italia', '1902/12/12', '1903/12/12'),"
			+ "(4, 'España', '1902/12/12', '1903/12/12'),"
			+ "(5, 'Portugal', '1902/12/12', '1903/12/12');";
	
}

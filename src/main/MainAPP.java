/*
 * @autor: Abel Jornet, Edgar Falc�, Ra�l Garrido
 * Fecha modificaci�n: 08/02/2021
 */
package main;

import clases.*;

public class MainAPP {

	public static void main(String[] args) {

		Mysql.openConnection();
		Mysql.createDB("Guerra");

		Mysql.createTable("Guerra", "Guerra", Inserciones.tablaGuerraCampos);
		Mysql.createTable("Guerra", "Bando", Inserciones.tablaBandoCampos);
		Mysql.createTable("Guerra", "Pais", Inserciones.tablaPaisCampos);
		Mysql.createTable("Guerra", "Historico", Inserciones.tablaHistoricoCampos);
		Mysql.createTable("Guerra", "Se_une", Inserciones.tablaSe_uneCampos);

		Mysql.insertData("Guerra", "Guerra", Inserciones.insercionTablaGuerra);
		Mysql.insertData("Guerra", "Bando", Inserciones.insercionTablaBando);
		Mysql.insertData("Guerra", "Pais", Inserciones.insercionTablaPais);
		Mysql.insertData("Guerra", "Historico", Inserciones.insercionTablaHistorico);
		Mysql.insertData("Guerra", "Se_une", Inserciones.insercionTablaSe_une);

		Mysql.getValues("Guerra", "Guerra");
		Mysql.deleteRecord("Guerra", "Guerra", 1);
		Mysql.getValues("Guerra", "Guerra");
		Mysql.closeConnection();
	}

}

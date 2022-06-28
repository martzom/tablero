package com.tablero.hockey.Service;

import java.util.List;

import com.tablero.hockey.entity.tablero;

public interface TableroService {
	public List<tablero> listaTableros();
	public void guardar(tablero tablero);
	public void eliminar(tablero tablero);
	public tablero encontrarTablero(tablero tablero);
}

package com.tablero.hockey.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tablero.hockey.Interface.InterfaceTableroDao;
import com.tablero.hockey.entity.tablero;
@Service
public class TableroServiceImp implements TableroService{

	@Autowired
	private InterfaceTableroDao tablerodao;
	
	@Override
	@Transactional(readOnly = true)
	public List<tablero> listaTableros() {
		return (List<tablero>) tablerodao.findAll();
	}

	@Override
	@Transactional
	public void guardar(tablero tablero) {
		tablerodao.save(tablero);
	}

	@Override
	@Transactional
	public void eliminar(tablero tablero) {
		tablerodao.delete(tablero);
	
	}

	@Override
	@Transactional(readOnly = true)
	public tablero encontrarTablero(tablero tablero) {
		return tablerodao.findById(tablero.getIdPartido()).orElse(null);
	}
}

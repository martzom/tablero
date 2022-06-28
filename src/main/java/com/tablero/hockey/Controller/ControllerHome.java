package com.tablero.hockey.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tablero.hockey.Service.TableroService;
import com.tablero.hockey.entity.tablero;



@Controller
public class ControllerHome {


	    
	    @Autowired
		private TableroService tableroservice;
	    
	    @GetMapping("/22222")
	    public String base(Model model){
	    	List<tablero> tablero = tableroservice.listaTableros();
	        model.addAttribute("tableros", tablero);
	        return "index";
	    }
	    
	    @GetMapping("/marcador3322")
	    public String marcador(Model model){
	    	List<tablero> tablero = tableroservice.listaTableros();
	        model.addAttribute("tableros", tablero);
	        return "marcador";
	    }
	    
	    @GetMapping("/marcador2")
	    public String marcador2(Model model){
	    	List<tablero> tablero = tableroservice.listaTableros();
	        model.addAttribute("tableros", tablero);
	        return "marcador2";
	    }
	    
	    @GetMapping("/")
	    public String agregar(tablero tablero){
	        return "modificar";
	    }
	    
	    @PostMapping("/guardar")
	    public String guardar(@Valid tablero tablero, Errors errores){
	    	if(errores.hasErrors()) {
	    		return "modificar";
	    	}
	        tableroservice.guardar(tablero);
	        return "redirect:/marcador2";
	    }
	   
	    @GetMapping("/editar/{idPartido}")
	    public String editar(tablero tablero, Model model){
	        tablero = tableroservice.encontrarTablero(tablero);
	        model.addAttribute("tablero", tablero);
	        return "modificar";
	    }
	    
	    @GetMapping("/eliminar/{idPartido}")
	    public String eliminar(tablero tablero, Model model){
	        tableroservice.eliminar(tablero);
	        return "redirect:/";
	    }
	   
	}

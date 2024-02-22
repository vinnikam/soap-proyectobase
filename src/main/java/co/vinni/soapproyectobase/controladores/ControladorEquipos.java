package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.dto.EquipoDto;
import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.servicios.ServicioEquipos;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Log4j2
@Controller
@RequestMapping("/equipos")
public class ControladorEquipos {
    private static final Logger logger = LogManager.getLogger(ControladorEquipos.class);

    @Autowired
    ServicioEquipos servicioEquipos;

    @RequestMapping("/guardar")
    public void registrarEquipo(EquipoDto equipo) {
        servicioEquipos.registrarEquipo(equipo);
    }

    @GetMapping({ "/"})
    public String obtenerEquipos(Model model){
        logger.info("Verificando ");
        model.addAttribute("equipos",servicioEquipos.obtenerEquipos());
        return "equipos";
    }
    @GetMapping
    public String getEmpleado() {
        return "empleado";
    }
}

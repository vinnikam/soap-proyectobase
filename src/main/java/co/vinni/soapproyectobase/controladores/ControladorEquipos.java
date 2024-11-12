package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.dto.EquipoDto;
import co.vinni.soapproyectobase.servicios.ServicioEquipos;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Log4j2
@Controller
public class ControladorEquipos {
    private static final Logger logger = LogManager.getLogger(ControladorEquipos.class);

    @Autowired
    ServicioEquipos servicioEquipos;

    @GetMapping({  "/equipos"})
    public String listarEquipos(Model model){
        logger.info("Verificando ");
        model.addAttribute("equipos",servicioEquipos.obtenerEquipos());
        return "equipos";
    }
    @GetMapping("/equipos/nuevo")
    public String mostrarFormulario(Model model){
        EquipoDto equipoDto = new EquipoDto();
        model.addAttribute("equipo", equipoDto);
        return "crear_equipo";
    }
    @PostMapping("/equipos")
    public String registrarEquipo(@ModelAttribute("equipo") EquipoDto equipo,
                                  @RequestParam("escudoArch") MultipartFile archivoEscudo) {
        if (!archivoEscudo.isEmpty()) {
            try {
                // Convertir el archivo a un arreglo de bytes
                byte[] bytes = archivoEscudo.getBytes();
                // Convertir a Base64
                String imagenBase64 = Base64.getEncoder().encodeToString(bytes);
                equipo.setEscudo(imagenBase64); // Almacena la imagen en Base64
            } catch (IOException e) {
                e.printStackTrace(); // Manejo de excepciones
            }
        }
        servicioEquipos.registrar(equipo);
        return "redirect:/equipos";
    }


    @GetMapping("/equipos/modificar/{serial}")
    public String mostrarFormularioEditar(@PathVariable long serial, Model model){
        EquipoDto equipoDto = new EquipoDto();
        model.addAttribute("equipo", servicioEquipos.obtenerEquipo(serial));
        return "editar_equipo";
    }

    @PostMapping("/equipos/{serial}")
    public String modificarEquipo(@PathVariable long serial,@ModelAttribute( "equipo") EquipoDto equipoDto, Model model){
        model.addAttribute("equipo", servicioEquipos.actualizar(equipoDto));
        return "redirect:/equipos";
    }
    @GetMapping("/equipos/{serial}")
    public String eliminarEquipo(@PathVariable long serial){

        servicioEquipos.eliminar(serial);

        return "redirect:/equipos";
    }
}

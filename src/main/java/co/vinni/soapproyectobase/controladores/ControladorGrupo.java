package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.entidades.Grupo;
import co.vinni.soapproyectobase.servicios.ServicioGrupo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class ControladorGrupo {
    final ServicioGrupo servicioGrupo;
    @GetMapping("/grupos")
    public String showForm(Model model) {
        model.addAttribute("grupo", new Grupo());
        return "grupoForm";
    }

    @PostMapping("/grupos")
    public String submitForm(@ModelAttribute Grupo grupo) {
        servicioGrupo.guardar(grupo);
        return "redirect:/grupos";
    }
}

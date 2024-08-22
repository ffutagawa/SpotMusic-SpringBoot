package br.com.ffutagawa.controller;

import br.com.ffutagawa.domain.Playlist;
import br.com.ffutagawa.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @GetMapping("/listar")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("playlists", playlistService.recuperar());
        return new ModelAndView("/playlist/list", model);
    }

    @GetMapping("/cadastro")
    public String preSalvar(@ModelAttribute("playlist")Playlist playlist){
        return "/playlist/add";
    }

    @PostMapping("/salvar")
    public String salvar (@ModelAttribute("playlist") Playlist playlist, BindingResult result, RedirectAttributes attr){
        if (result.hasErrors()){
            return "/playlist/add";
        }

        playlistService.salvar(playlist);
        attr.addFlashAttribute("mensagem", "Playlista criada com sucesso.");
        return "redirect:/playlists/listar";
    }


}

























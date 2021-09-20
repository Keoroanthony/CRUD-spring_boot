package com.interview.skylab.controller;

import com.interview.skylab.entity.ServicesProducts;
import com.interview.skylab.repository.RepositoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class ControllerServices {
    @Autowired
    private RepositoryServices repositoryServices;


    @GetMapping("")

    public String viewHomePage() {
        return ("index");
    }

    @GetMapping("/list_services")
    public String viewList(Model model) {
        List<ServicesProducts> servicesProductsList = repositoryServices.findAll();
        model.addAttribute("servicesProductsList", servicesProductsList);
        return "list_services";
    }
    @RequestMapping("/view_service/{id}")
    public ModelAndView showEditUserForm(@PathVariable(name = "id") int id) {

        ModelAndView mnv = new ModelAndView("view_service");

        //User object
        ServicesProducts servicesProducts = repositoryServices.getById(id);
        mnv.addObject("viewservice", servicesProducts);

        return mnv;
    }

    @PostMapping("/save_service")
    public String addNewService(ServicesProducts web_service) {
        repositoryServices.save(web_service);
        return "list_services";
    }
    @RequestMapping("/delete_user/{id}")
    public String deleteService(@PathVariable(name = "id") int id) {
        repositoryServices.deleteById(id);
        return "list_services";
    }

    @GetMapping("/add_service")
    public String addService(Model model) {

        model.addAttribute("ServiceProduct", new ServicesProducts());

        return "add_service";
    }

}

package com.CRUDPrueba.controller;

import com.CRUDPrueba.entidades.Empleado;
import com.CRUDPrueba.service.EmpleadoService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author SHAMILO
 */
@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoservice;
    
    
    @GetMapping //cuando se haga une petición se devuelven todos los empleados
    public List<Empleado> listar(){
        return empleadoservice.listar();
    }
    
    @PostMapping
    public Empleado insertar(Empleado emp, @RequestParam("image") MultipartFile multipartFile) throws IOException{
        String uploadDir = "user-photos/" + emp.getCodigo();
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        emp.setFoto(uploadDir + "/" + fileName);
        empleadoservice.insertar(emp);
        return emp;
    }
    
    @PutMapping //actualizar
    public Empleado actualizar(@RequestBody Empleado emp){
        return empleadoservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Empleado emp){
        empleadoservice.eliminar(emp);
        
    }
    
}

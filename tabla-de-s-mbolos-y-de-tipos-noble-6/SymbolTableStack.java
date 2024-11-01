/*
 * Universidad Nacional Autónoma de México
 * Facultad de Ciencias
 * Compiladores 2025-1
 * Tablas de símbolos y tipos
 * 
 * Alumno: Osorio Escandón Huriel
 * Correo: Huriel117@ciencias.unam.mx
 * Número de cuenta: 317204652
 */

import java.util.Optional;

public interface SymbolTableStack{
    void push(SymbolTable table);
    SymbolTable pop();
    Optional<SymbolTable> peek();
    Optional<SymbolTable> base();
    Optional<SymbolTable> lookup(String id);
}
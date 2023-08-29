package br.com.validator;

import br.com.exceptions.InvalidIdException;

public class Validator {

    private String id;

    public boolean isIdValid(String id) {
        try {
            if (id == null) {
                throw new InvalidIdException("ID inválido", "Apenas valores númericos inteiros são aceitos");
            }
            Long longId = Long.parseLong(id);
            if (longId < 1) {
                throw new InvalidIdException("ID inválido", "Apenas valores positivos são aceitos");
            }
        } catch (NumberFormatException msg) {
            throw new InvalidIdException("ID inválido", "Apenas valores númericos inteiros são aceitos");
        }
        return true;
    }
}

package com.example.sudoku;

import org.example.sudoku.SudokuController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SudokuControllerTest {

    @Test
    public void testValidInput() {
        SudokuController sudokuController = new SudokuController();
        String result = sudokuController.validate(0, 2, 4);
        assertEquals("Valid input", result);
    }

    @Test
    public void testInvalidInput() {
        SudokuController sudokuController = new SudokuController();
        String result = sudokuController.validate(0, 2, 5);
        assertEquals("Invalid input", result);
    }
}
